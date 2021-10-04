package com.devsuperior.dsvendas.controllers;

import java.util.List;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService service;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> list = service.findAll();
        return ResponseEntity.ok(list);
        
    }

    
}
// CONTROLLER <->(dto) <-> SERVICE <-> REPOSITORY <-> ENTITY
// RESPONDE AS REQUISIÇÕES DO FRONTEND (ENDPOINT)
// service.find() vem do SellerService
// responde enviando uma lista de vendedores(SellertDTO) para o FRONTEND