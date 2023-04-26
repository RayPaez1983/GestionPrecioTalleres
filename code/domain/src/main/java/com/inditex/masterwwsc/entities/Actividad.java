package com.inditex.masterwwsc.entities;

import jakarta.persistence.*;

@Entity
@Table(name="actividad")
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(name="ID_TIPO_UNIDA")
    private  Integer ID_TIPO_UNIDAD;

    public Actividad(){}

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getID_TIPO_UNIDAD() {
        return ID_TIPO_UNIDAD;
    }

    public void setID_TIPO_UNIDAD(Integer ID_TIPO_UNIDAD) {
        this.ID_TIPO_UNIDAD = ID_TIPO_UNIDAD;
    }
}
