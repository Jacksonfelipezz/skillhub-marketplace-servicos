package com.jackson.skillhubapi.service;

import com.jackson.skillhubapi.entity.Servico;
import com.jackson.skillhubapi.repository.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private final ServiceRepository serviceRepository;

    public ServicoService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<Servico> findAll(){
        return serviceRepository.findAll();
    }

    public Servico findbyId(Long id){
        return serviceRepository.findById(id).get();
    }
    public Servico save(Servico servico){
        return serviceRepository.save(servico);
    }
    public void delete(Long id){
        serviceRepository.deleteById(id);
    }
}
