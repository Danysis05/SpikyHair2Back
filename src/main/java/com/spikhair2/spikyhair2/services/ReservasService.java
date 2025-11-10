package com.spikhair2.spikyhair2.services;

import com.spikhair2.spikyhair2.models.entity.Reservas;
import com.spikhair2.spikyhair2.repositories.ReservasRepository;
import com.spikhair2.spikyhair2.services.DAO.Idao;

public class ReservasService implements Idao<Reservas, Long> {

    private final ReservasRepository reservasRepository;
    public ReservasService(ReservasRepository reservasRepository) {
        this.reservasRepository = reservasRepository;
    }
    @Override
    public java.util.List<Reservas> getAll() {
        return reservasRepository.findAll();
    }  
    @Override
    public Reservas getById(Long id) {
        return reservasRepository.findById(id).orElse(null);
    }  
    @Override
    public Reservas save(Reservas entity) {
        return reservasRepository.save(entity);
    }
    @Override
    public Reservas update(Long id, Reservas entity) {
        return reservasRepository.save(entity);
    }
    @Override
    public void delete(Long id) {
        reservasRepository.deleteById(id);

    }
    @Override
    public long count() {
        return reservasRepository.count();
    }

}
