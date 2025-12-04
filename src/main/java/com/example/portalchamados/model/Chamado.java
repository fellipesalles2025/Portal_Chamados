package com.example.portalchamados.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tb_chamado")
@Data
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Chamado")
    private Long id;

    @Column(name = "As_Chamado")
    private String assunto;

    @Column(name = "Ds_Chamado")
    private String descricao;

    @Column(name = "Pr_Chamado")
    private String prioridade;

    @Column(name = "Dt_Chamado")
    private LocalDate dataAbertura;

    @Column(name = "Ob_Chamado")
    private String observacao;

    @Column(name = "St_Chamado")
    private String status;

    @PrePersist
    public void prePersist() {
        this.dataAbertura = LocalDate.now();
        this.status = "Novo";
        this.observacao = "";
    }
}