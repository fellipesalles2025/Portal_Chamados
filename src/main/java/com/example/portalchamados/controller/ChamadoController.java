package com.example.portalchamados.controller;

import com.example.portalchamados.model.Chamado;
import com.example.portalchamados.service.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/chamados")
public class ChamadoController {

    @Autowired
    private ChamadoService chamadoService;

    @GetMapping
    public List<Chamado> findAll(){
        return chamadoService.findAll();
    }

    @PostMapping
    public Chamado save(@RequestBody Chamado chamado){
        return chamadoService.save(chamado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        chamadoService.delete(id);
    }
}
