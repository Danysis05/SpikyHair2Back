package com.spikhair2.spikyhair2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spikhair2.spikyhair2.models.entity.Resenas;

@Repository
public interface ResenasRepository extends JpaRepository<Resenas, Long> {

}
