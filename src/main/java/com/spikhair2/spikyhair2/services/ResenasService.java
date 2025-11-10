package com.spikhair2.spikyhair2.services;

import com.spikhair2.spikyhair2.models.entity.Resenas;
import com.spikhair2.spikyhair2.repositories.ResenasRepository;
import com.spikhair2.spikyhair2.services.DAO.Idao;

public class ResenasService implements Idao<Resenas, Long> {
    private final ResenasRepository resenasRepository;
    public ResenasService(ResenasRepository resenasRepository) {
        this.resenasRepository = resenasRepository;
    }
    @Override
    public java.util.List<Resenas> getAll() {
        return resenasRepository.findAll();
    }   
    @Override
    public Resenas getById(Long id) {
        return resenasRepository.findById(id).orElse(null);
    }  
    @Override
    public Resenas save(Resenas entity) {
        return resenasRepository.save(entity);
    }
    @Override
    public Resenas update(Long id, Resenas entity) {
        return resenasRepository.save(entity);
    }
    @Override
    public void delete(Long id) {
        resenasRepository.deleteById(id);
    }
    @Override
    public long count() {
        return resenasRepository.count();
    }

}
