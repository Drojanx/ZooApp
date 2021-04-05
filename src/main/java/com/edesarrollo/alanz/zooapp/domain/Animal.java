package com.edesarrollo.alanz.zooapp.domain;

import java.util.Objects;

public class Animal {

    private String nombre;
    private String especie;
    private String sexo;
    private int edad;
    private float peso;
    private String recinto;

    public Animal(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getRecinto() {
        return recinto;
    }

    public void setRecinto(String recinto) {
        this.recinto = recinto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return  nombre.equals(animal.nombre) &&
                especie.equals(animal.especie) &&
                sexo.equals(animal.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, especie, sexo);
    }

    @Override
    public String toString() {
        System.out.println("Animal{");
        System.out.println("    Nombre:     " + this.getNombre());
        System.out.println("    Especie:    " + this.getEspecie());
        System.out.println("    Sexo:       " + this.getSexo());
        System.out.println("    Edad:       " + this.getEdad());
        System.out.println("    Peso:       " + this.getPeso());
        System.out.println("    Recinto:    " + this.getRecinto());
        System.out.println("}");
        return "";
    }
}
