package com.edesarrollo.alanz.zooapp.domain;

import java.util.Objects;

public class Trabajador {

    private String dni;
    private String nombre;
    private String apellidos;
    private int numTfno;
    private float salario;

    public Trabajador(){

    }

    public Trabajador(String dni, String nombre, String apellidos, int numTfno, float salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numTfno = numTfno;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumTfno() {
        return numTfno;
    }

    public void setNumTfno(int numTfno) {
        this.numTfno = numTfno;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuidador cuidador = (Cuidador) o;
        return Objects.equals(this.getDni(), cuidador.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numTfno=" + numTfno +
                ", salario=" + salario +
                '}';
    }
}

