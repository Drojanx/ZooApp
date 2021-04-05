package com.edesarrollo.alanz.zooapp.domain;

import java.util.Objects;

public class Recinto {

    private String idRecinto;
    private String bioma;
    private int capacidadAnimales;
    private double area;
    private double consumoAgua;

    public Recinto(){

    }

    public String getIdRecinto() {
        return idRecinto;
    }

    public void setIdRecinto(String idRecinto) {
        this.idRecinto = idRecinto;
    }

    public String getBioma() {
        return bioma;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }

    public int getCapacidadAnimales() {
        return capacidadAnimales;
    }

    public void setCapacidadAnimales(int capacidadAnimales) {
        this.capacidadAnimales = capacidadAnimales;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getConsumoAgua() {
        return consumoAgua;
    }

    public void setConsumoAgua(double consumoAgua) {
        this.consumoAgua = consumoAgua;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recinto recinto = (Recinto) o;
        return  Objects.equals(this.getIdRecinto(), recinto.getIdRecinto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRecinto);
    }

    @Override
    public String toString() {
        System.out.println("Animal{");
        System.out.println("    ID:         " + this.getIdRecinto());
        System.out.println("    Bioma:      " + this.getBioma());
        System.out.println("    Capacidad:  " + this.getCapacidadAnimales());
        System.out.println("    Area:       " + this.getArea());
        System.out.println("    Consumo:    " + this.getConsumoAgua());
        System.out.println("}");
        return "";
    }
}
