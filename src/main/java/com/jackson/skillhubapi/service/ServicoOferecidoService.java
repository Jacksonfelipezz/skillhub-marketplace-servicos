package com.jackson.skillhubapi.service;

import com.jackson.skillhubapi.entity.ServicoOferecido;
import com.jackson.skillhubapi.repository.ServicoOferecidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoOferecidoService {

    private final ServicoOferecidoRepository servicoOferecidoRepository;

    public ServicoOferecidoService(ServicoOferecidoRepository servicoOferecidoRepository) {
        this.servicoOferecidoRepository = servicoOferecidoRepository;
    }

    public List<ServicoOferecido> finAll(){
        return servicoOferecidoRepository.findAll();
    }

    public ServicoOferecido findById(Long id){
        return servicoOferecidoRepository.findById(id).get();
    }

    public ServicoOferecido save(ServicoOferecido servicoOferecido){
        return servicoOferecidoRepository.save(servicoOferecido);
    }

    public void delete(Long id){
        servicoOferecidoRepository.deleteById(id);
    }
}
