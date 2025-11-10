package com.spikhair2.spikyhair2.services;

import com.spikhair2.spikyhair2.models.entity.Peluqueria;
import com.spikhair2.spikyhair2.repositories.PeluqueriaRepository;
import com.spikhair2.spikyhair2.services.DAO.Idao;


public class PeluqueriaService implements Idao<Peluqueria, Long> {

    private final PeluqueriaRepository peluqueriaRepository;

    public PeluqueriaService(PeluqueriaRepository peluqueriaRepository) {
        this.peluqueriaRepository = peluqueriaRepository;
    }
    @Override
    public java.util.List<Peluqueria> getAll() {
        return peluqueriaRepository.findAll();
    }   
    @Override
    public Peluqueria getById(Long id) {
        return peluqueriaRepository.findById(id).orElse(null);
    }  
    @Override
    public Peluqueria save(Peluqueria entity) {
        return peluqueriaRepository.save(entity);
    }
    @Override
    public Peluqueria update(Long id, Peluqueria entity) {
        return peluqueriaRepository.save(entity);
    }
    @Override
    public void delete(Long id) {
        peluqueriaRepository.deleteById(id);
    }
    @Override
    public long count() {
        return peluqueriaRepository.count();
    }

}
