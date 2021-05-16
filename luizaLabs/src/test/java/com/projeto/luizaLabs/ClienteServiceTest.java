//package com.projeto.luizaLabs;
//
//import com.projeto.luizaLabs.entity.Cliente;
//import com.projeto.luizaLabs.service.ClienteService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.transaction.Transactional;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@Transactional
//public class ClienteServiceTest {
//
//    @Autowired
//    ClienteService clienteServiceTest;
//
//    @Test
//    void salvarClienteNoBanco() {
//
//        Cliente cliente = new Cliente();
//        cliente.setCpf("12346789015");
//        cliente.setNome("Nelly");
//        Cliente clienteSalvo = clienteServiceTest.adicionarCliente(cliente);
//        assertThat(clienteSalvo).isNotNull();
//    }
//
//    //@Test
////    void verificarIdDoClienteSalvo() {
////
////        Cliente cliente = new Cliente();
////        cliente.setCpf("12346789015");
////        cliente.setNome("Nelly");
////        Cliente clienteSalvo = clienteServiceTest.adicionarCliente(cliente);
////        assertThat(clienteSalvo.getID()).isEqualTo(1);
////    }
//
////    @Test
////    public void obterUsuarioPeloId() {
////    Cliente cliente = new Cliente();
////    cliente.setCpf("12346789015");
////    cliente.setNome("Nelly");
////    clienteServiceTest.adicionarCliente(cliente);
////    Cliente found = clienteServiceTest.buscarCliente(cliente.getID());
////    assertThat(found.getNome()).isEqualTo(cliente.getNome());
////    }
//
//    @Test
//    public void contaQuantosClientesNoBanco() {
//    Cliente cliente = new Cliente();
//    cliente.setCpf("12346789015");
//    cliente.setNome("Nelly");
//    clienteServiceTest.adicionarCliente(cliente);
//    long qtd = clienteServiceTest.quantidadeDeClientes();
//    assertThat(qtd).isEqualTo(1);
//    }
//}