package com.edesarrollo.alanz.zooapp.domain;

public class Oficinista extends Trabajador{

    private String departamento;
    private String tipoJornada; //Completa, parcial...

    public Oficinista(){

    }

    public Oficinista(String dni, String nombre, String apellidos, int numTfno, float salario, String departamento, String tipoJornada) {
        super(dni, nombre, apellidos, numTfno, salario);
        this.departamento = departamento;
        this.tipoJornada = tipoJornada;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    @Override
    public String toString() {
        System.out.println("Oficinista{");
        System.out.println("    Nombre:         " + this.getNombre());
        System.out.println("    Apellidos:      " + this.getApellidos());
        System.out.println("    DNI:            " + this.getDni());
        System.out.println("    Departamento:   " + this.getDepartamento());
        System.out.println("    Jornada:        " + this.getTipoJornada());
        System.out.println("}");
        return "";
    }
}
