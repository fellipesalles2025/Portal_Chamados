package com.example.portalchamados.service;

import com.example.portalchamados.model.Chamado;
import com.example.portalchamados.repository.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository chamadoRepository;

    public List<Chamado> findAll() {
        return chamadoRepository.findAll();
    }

    public Chamado findById(Long id) {
        return chamadoRepository.findById(id).orElseThrow(() -> new RuntimeException("Chamado não encontrado"));
    }

    public Chamado save(Chamado chamado) {
        return chamadoRepository.save(chamado);
    }

    public void delete(Long id) {
        chamadoRepository.deleteById(id);
    }
}
