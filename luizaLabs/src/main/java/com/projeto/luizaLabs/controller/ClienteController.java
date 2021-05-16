package com.projeto.luizaLabs.controller;

import com.projeto.luizaLabs.entity.Cliente;
import com.projeto.luizaLabs.service.ClienteService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @ApiOperation(value = "Adicionar um novo usuário")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Foi adicionado um novo usuário", response = Response.class),
            @ApiResponse(code = 400, message = "Requisição inválida", response = Response.class)
    })
    @PostMapping("/clientes")
    public ResponseEntity<Cliente> adicionarCliente(@RequestBody Cliente cliente) {
        try {
            Cliente respostaCliente = clienteService.adicionarCliente(cliente);
            return new ResponseEntity<>(clienteService.adicionarCliente(cliente), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "Retornar um usuário")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Usuário retornado com sucesso", response = Response.class),
            @ApiResponse(code = 400, message = "Requisição inválida", response = Response.class)
    })
    @GetMapping("/clientes/{id}")
    public ResponseEntity<?> buscarCliente(@PathVariable long id) {
        try {
            return new ResponseEntity<>(clienteService.buscarCliente(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @ApiOperation(value = "Atualizar cliente")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Return the user who was modified", response = Response.class),
            @ApiResponse(code = 401, message = "You do not have permission to access this feature.", response = Response.class),
            @ApiResponse(code = 404, message = "Log not found", response = Response.class),
            @ApiResponse(code = 500, message = "An exception was thrown", response = Response.class),
    })
    @PutMapping("/cliente/{id}")
    public ResponseEntity<Cliente> atualizarCliente(@RequestBody Cliente pessoa, @PathVariable(value = "id") long id) {
        try {
            Optional<Cliente> cliente = clienteService.findById(id);
            if (cliente.isPresent()) {
                pessoa.setID(cliente.get().getID());
                return new ResponseEntity<>((Cliente) clienteService.atualizarCliente(pessoa), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


//    public ResponseEntity<Cliente> atualizarCliente(@PathVariable long id, Cliente cliente) {
//        try {
//            Optional<Cliente> clientePosBusca = clienteService.buscarCliente(id);
//            if (clientePosBusca.isPresent()) {
//                cliente.setID(clientePosBusca.get().getID());
//                return new ResponseEntity<>(clienteService.atualizarCliente(cliente), HttpStatus.NOT_FOUND);
//            }
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//}
// }

    @ApiOperation(value="Retornar a quantidade de usuários")
    @ApiResponses(value={
            @ApiResponse(code=200,message="Quantidade de usuários retornado com sucesso",response= Response.class),
            @ApiResponse(code=400,message="Requisição inválida",response=Response.class)
    })
    @GetMapping("/qtdeclientes")
    public long  qtdeClientes() {
        return clienteService.quantidadeDeClientes();
    }
}
