package com.spring.spring.repository;

import com.spring.spring.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    //select * from Cliente where id = x

    static Cliente findById(long id) {
        return null;
    }


}

