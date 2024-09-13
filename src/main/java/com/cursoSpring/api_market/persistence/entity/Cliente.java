package com.cursoSpring.api_market.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(name = "id")
    private String idCliente;

    private String nombre;
    private String apellidos;
    private String celular;
    private String direccion;

    @Column(name = "correo_electronico")
    private String correo;

    @OneToMany(mappedBy = "cliente")

    private List<Compra> compras;
}
