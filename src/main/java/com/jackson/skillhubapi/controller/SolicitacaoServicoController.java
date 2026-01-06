package com.jackson.skillhubapi.controller;

import com.jackson.skillhubapi.entity.SolicitacaoServico;
import com.jackson.skillhubapi.service.SolicitacaoServicoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Solicitacoes Servicos")
@RestController
@RequestMapping("/solicitacoes-servicos")
public class SolicitacaoServicoController {

    private final SolicitacaoServicoService solicitacaoServicoService;

    public SolicitacaoServicoController(SolicitacaoServicoService solicitacaoServicoService) {
        this.solicitacaoServicoService = solicitacaoServicoService;
    }

    @GetMapping
    public ResponseEntity<List<SolicitacaoServico>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(solicitacaoServicoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SolicitacaoServico> findById(@PathVariable Long id){
        return ResponseEntity.ok(solicitacaoServicoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<SolicitacaoServico> save(@RequestBody SolicitacaoServico solicitacaoServico){
        return ResponseEntity.status(HttpStatus.CREATED).body(solicitacaoServico);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        solicitacaoServicoService.delete(id);
    }


}
