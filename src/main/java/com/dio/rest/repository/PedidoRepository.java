package com.dio.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.rest.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
