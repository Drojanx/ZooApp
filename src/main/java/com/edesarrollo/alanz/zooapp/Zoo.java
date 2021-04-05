package com.edesarrollo.alanz.zooapp;

import com.edesarrollo.alanz.zooapp.domain.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    private Cuidador cuidador;
    private Oficinista oficinista;
    private Recinto recinto;
    private Animal animal;
    private boolean salir;
    private Scanner teclado;

    private ArrayList<Cuidador> cuidadores = new ArrayList<>();
    private ArrayList<Oficinista> oficinistas = new ArrayList<>();
    private ArrayList<Recinto> recintos = new ArrayList<>();
    private ArrayList<Animal> animales = new ArrayList<>();


    public Zoo(){
        salir = false;
        teclado = new Scanner(System.in);
        cuidador = new Cuidador();
        oficinista = new Oficinista();
        recinto = new Recinto();
        animal = new Animal();
    }

    public void ejecutar(){
        while(!salir) {
            System.out.println("********ZooApp********");
            System.out.println("    1.Crear entrada");
            System.out.println("    2.Ver entrada");
            System.out.println("    x.Salir");
            String crearVer = teclado.nextLine();
            while(!crearVer.equals("1") && !crearVer.equals("2") && !crearVer.equals("x")){
                System.out.println("Debe introducir una opcion de las indicadas: ");
                crearVer = teclado.nextLine();
            }
            String tipo ="";
            if(!crearVer.equals("x")) {
                System.out.println("      1.Cuidador");
                System.out.println("      2.Oficinista");
                System.out.println("      3.Animal");
                System.out.println("      4.Recinto");
                tipo = teclado.nextLine();
                while (!tipo.equals("1") && !tipo.equals("2") &&
                        !tipo.equals("3") && !tipo.equals("4")) {
                    System.out.println("Debe introducir una opcion de las indicadas: ");
                    tipo = teclado.nextLine();
                }
            }
            switch (crearVer) {
                case "1":
                    crearEntrada(tipo);
                    break;
                case "2":
                    verEntrada(tipo);
                    break;
                case "x":
                    salir();
                    break;
            }
        }
    }

    private void salir(){
        salir = true;
    }

    private void crearEntrada(String tipo){
        //Terminar código
    }

    private void verEntrada(String tipo){
        //Terminar código
    }
}


