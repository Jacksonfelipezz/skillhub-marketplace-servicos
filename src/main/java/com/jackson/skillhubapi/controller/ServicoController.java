package com.jackson.skillhubapi.controller;

import com.jackson.skillhubapi.entity.Servico;
import com.jackson.skillhubapi.service.ServicoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Servicos")
@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoService serviceService;

    public ServicoController(ServicoService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping
    public ResponseEntity<List<Servico>> findAll(){
        return ResponseEntity.ok(serviceService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> findById(@PathVariable Long id){
        return ResponseEntity.ok(serviceService.findbyId(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Servico save(@RequestBody Servico servico) {
        return serviceService.save(servico);
    }

    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        serviceService.delete(id);
    }
}
