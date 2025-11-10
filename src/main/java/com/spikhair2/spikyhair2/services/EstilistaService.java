package com.spikhair2.spikyhair2.services;

import com.spikhair2.spikyhair2.models.entity.Estilista;
import com.spikhair2.spikyhair2.repositories.EstilistaRepository;
import com.spikhair2.spikyhair2.services.DAO.Idao;

public class EstilistaService implements Idao<Estilista, Long> {
    private final EstilistaRepository estilistaRepository;

    public EstilistaService(EstilistaRepository estilistaRepository) {
        this.estilistaRepository = estilistaRepository;
    }
    @Override
    public java.util.List<Estilista> getAll() {
        return estilistaRepository.findAll();
    }   
    @Override
    public Estilista getById(Long id) {
        return estilistaRepository.findById(id).orElse(null);
    }  
    @Override
    public Estilista save(Estilista entity) {
        return estilistaRepository.save(entity);
    }
    @Override
    public Estilista update(Long id, Estilista entity) {
        return estilistaRepository.save(entity);
    }
    @Override
    public void delete(Long id) {
        estilistaRepository.deleteById(id);
    }
    @Override
    public long count() {
        return estilistaRepository.count();
    }

}