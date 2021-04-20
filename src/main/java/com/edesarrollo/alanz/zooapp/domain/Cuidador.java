package com.edesarrollo.alanz.zooapp.domain;

import java.util.ArrayList;
import java.util.Objects;

public class Cuidador extends Trabajador {

    private ArrayList<String> recintosAsignados;
    private String turno;

    public Cuidador(){
    }

    public Cuidador(String dni, String nombre, String apellidos, int numTfno, float salario, String turno) {
        super(dni, nombre, apellidos, numTfno, salario);
        this.recintosAsignados = recintosAsignados;
        this.turno = turno;
    }




    public ArrayList<String> getRecintosAsignados() {
        return recintosAsignados;
    }

    public void setRecintosAsignados(ArrayList<String> recintosAsignados) {
        this.recintosAsignados = recintosAsignados;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }



    @Override
    public String toString() {
        System.out.println("Cuidador{");
        System.out.println("    Nombre:     " + this.getNombre());
        System.out.println("    Apellidos:  " + this.getApellidos());
        System.out.println("    DNI:        " + this.getDni());
        System.out.println("    Turno:      " + this.turno);
        System.out.println("}");
        return "";
    }
}

