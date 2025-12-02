package com.example.portalchamados.controller;

import com.example.portalchamados.model.Chamado;
import com.example.portalchamados.repository.ChamadoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    private final ChamadoRepository chamadoRepository;

    public ChamadoController(ChamadoRepository chamadoRepository) {
        this.chamadoRepository = chamadoRepository;
    }

    @CrossOrigin("*")
    @GetMapping
    public List<Chamado> getAll() {
        return chamadoRepository.findAll();
    }

    @CrossOrigin("*")
    @PostMapping
    public Chamado save(@RequestBody Chamado chamado) {
        return chamadoRepository.save(chamado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        chamadoRepository.deleteById(id);
    }
}
