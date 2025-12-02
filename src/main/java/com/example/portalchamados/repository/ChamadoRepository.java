package com.example.portalchamados.repository;

import com.example.portalchamados.model.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado,Long> {
}
