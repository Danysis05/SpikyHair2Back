package com.spikhair2.spikyhair2.services;

import java.util.List;

import com.spikhair2.spikyhair2.models.entity.Servicio;
import com.spikhair2.spikyhair2.repositories.ServicioRepository;
import com.spikhair2.spikyhair2.services.DAO.Idao;

public class ServicioService implements Idao<Servicio, Long> {
    private final ServicioRepository servicioRepository;
    public ServicioService(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    @Override
    public List<Servicio> getAll() {
        return servicioRepository.findAll();
    }

    @Override
    public Servicio getById(Long id) {
        return servicioRepository.findById(id).orElse(null);
    
    }

    @Override
    public Servicio save(Servicio entity) {
        return servicioRepository.save(entity);
    }

    @Override
    public Servicio update(Long id, Servicio entity) {
        
        return servicioRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        servicioRepository.deleteById(id);
    }

    @Override
    public long count() {
        return servicioRepository.count();
    }

}
