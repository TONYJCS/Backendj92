package com.example.demo.Bean;

import javax.persistence.*;

@Entity
@Table(name = "matricula")
public class MatriculaBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmatricula;

    private Integer idestudiante;

    private Integer idcursos;

    public Integer getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(Integer idmatricula) {
        this.idmatricula = idmatricula;
    }

    public Integer getIdmestudiante() {
        return idestudiante;
    }

    public void setIdmestudiante(Integer idmestudiante) {
        this.idestudiante = idmestudiante;
    }

    public Integer getIdcursos() {
        return idcursos;
    }

    public void setIdcursos(Integer idcursos) {
        this.idcursos = idcursos;
    }
}
