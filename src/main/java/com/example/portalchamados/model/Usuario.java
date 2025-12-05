package com.example.portalchamados.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_usuario")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_usuario")
    private Long id;

    @Column(name = "NM_usuario")
    private String nome;

    @Column(name = "EM_usuario")
    private String email;

    @Column(name = "TL_usuario")
    private String telefone;

    @Column(name = "PS_usuario")
    private String password;
}
