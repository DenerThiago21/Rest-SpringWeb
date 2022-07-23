package com.dio.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.rest.entity.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}