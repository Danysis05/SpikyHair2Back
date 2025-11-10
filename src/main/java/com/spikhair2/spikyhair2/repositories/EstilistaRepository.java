package com.spikhair2.spikyhair2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spikhair2.spikyhair2.models.entity.Estilista;

@Repository
public interface EstilistaRepository extends JpaRepository<Estilista, Long> {

}
