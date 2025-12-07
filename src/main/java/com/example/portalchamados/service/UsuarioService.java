package com.example.portalchamados.service;

import com.example.portalchamados.model.Usuario;
import com.example.portalchamados.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario) {
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));

        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

    public boolean login(String email, String senhaDigitada) {
        Usuario usuario = usuarioRepository.findByEmail(email);

        if (usuario == null) {
            return false;
        }

        return passwordEncoder.matches(senhaDigitada, usuario.getPassword());
    }
}
