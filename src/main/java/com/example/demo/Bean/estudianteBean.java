package com.example.demo.Bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "estudiante")
public class estudianteBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idestudiante;
    private  String  dni;
    private  String  nombestudiantes;
    private  String  apellidomaterno;
    private  String  apellidopaterno;
    private  Integer edad;
    private  Date    fechanacimiento;
    private  Boolean estado;

    public Integer getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombestudiantes() {
        return nombestudiantes;
    }

    public void setNombestudiantes(String nombestudiantes) {
        this.nombestudiantes = nombestudiantes;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}

