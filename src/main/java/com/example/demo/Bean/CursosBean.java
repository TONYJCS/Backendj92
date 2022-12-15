package com.example.demo.Bean;

import javax.persistence.*;

@Entity
@Table(name = "cursos")
public class CursosBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcursos;

    private String nombcurso;

    private String ciclo;

    private Integer creditos;

    public Integer getIdcursos() {
        return idcursos;
    }

    public void setIdcursos(Integer idcursos) {
        this.idcursos = idcursos;
    }

    public String getNombcurso() {
        return nombcurso;
    }

    public void setNombcurso(String nombcurso) {
        this.nombcurso = nombcurso;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
}
