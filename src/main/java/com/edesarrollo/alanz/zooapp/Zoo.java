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
        String b1;
        String b2;
        String b3;
        switch (tipo){
            case "1":
                System.out.println("Introduce DNI del cuidador que busca: ");
                b1 = teclado.nextLine();
                for (Cuidador cuidador : cuidadores){
                    if(cuidador.getDni() != null && cuidador.getDni().contains(b1)){
                        System.out.println(cuidador);
                    }
                }
                break;
            case "2":
                System.out.println("Introduce DNI del oficinista que busca: ");
                b1 = teclado.nextLine();
                for (Oficinista oficinista : oficinistas){
                    if(oficinista.getDni() != null && oficinista.getDni().contains(b1)){
                        System.out.println(oficinista);
                    }
                }
                break;
            case "3":
                System.out.println("Introduce nombre del animal que busca: ");
                b1 = teclado.nextLine();
                System.out.println("Introduce especie del animal que busca: ");
                b2 = teclado.nextLine();
                System.out.println("Introduce sexo del animal que busca: ");
                b3 = teclado.nextLine();
                for (Animal animal : animales){
                    if(animal.getNombre() != null && animal.getEspecie() != null && animal.getSexo() != null &&
                            animal.getNombre().contains(b1) && animal.getEspecie().contains(b2) && animal.getSexo().contains(b3)){
                        System.out.println(animal);
                    }
                }
                break;
            case "4":
                System.out.println("Introduce ID del recinto que busca: ");
                b1 = teclado.nextLine();
                for (Recinto recinto : recintos){
                    if(recinto.getIdRecinto() != null && recinto.getIdRecinto().contains(b1)){
                        System.out.println(recinto);
                    }
                }
                break;
        }
    }
}


