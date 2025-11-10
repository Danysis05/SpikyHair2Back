package com.spikhair2.spikyhair2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spikhair2.spikyhair2.models.entity.Rol;
import com.spikhair2.spikyhair2.repositories.RolRepository;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initRoles(RolRepository rolRepository) {
        return args -> {
            String[] roles = {"ADMINISTRADOR", "PROPIETARIO", "USUARIO"};

            for (String rol : roles) {
                rolRepository.findByName(rol).orElseGet(() -> {
                    Rol nuevoRol = new Rol(rol);
                    return rolRepository.save(nuevoRol);
                });
            }

            System.out.println("Roles iniciales cargados correctamente.");
        };
    }
}

