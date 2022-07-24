package com.dio.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dio.rest.entity.Produto;
import com.dio.rest.exception.ProductPriceException;
import com.dio.rest.service.ProdutoService;

@SpringBootTest
public class ProdutoTest {

    @Autowired
    private ProdutoService produtoService;

    @Test
    public void verificaValorNegativoNoProduto() throws Exception {
        Produto produto = new Produto();

        produto.setNome("TEste");
        produto.setPreco(-10.0);

        assertThrows(ProductPriceException.class, () -> produtoService.save(produto));

        
    }
}
