package com.spikhair2.spikyhair2.services;

import org.springframework.stereotype.Service;

import com.spikhair2.spikyhair2.models.entity.Usuario;
import com.spikhair2.spikyhair2.repositories.UsuarioRepository;
import com.spikhair2.spikyhair2.services.DAO.Idao;

@Service
public class UsuarioService implements Idao<Usuario, Long> {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
     @Override
    public java.util.List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario save(Usuario entity) {
        return usuarioRepository.save(entity);
    }

    @Override
    public Usuario update(Long id, Usuario entity) {
        return usuarioRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public long count() {
        return usuarioRepository.count();
    }


}   
