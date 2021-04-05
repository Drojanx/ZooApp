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
        switch (tipo){
            case "1":
                Cuidador cuidador = new Cuidador();
                System.out.println("Cuidador:");
                System.out.println("    DNI:");
                cuidador.setDni(teclado.nextLine());
                System.out.println("    Nombre:");
                cuidador.setNombre(teclado.nextLine());
                System.out.println("    Apellido:");
                cuidador.setApellidos(teclado.nextLine());
                System.out.println("    Nº tfno:");
                cuidador.setNumTfno(Integer.parseInt(teclado.nextLine()));
                System.out.println("    Turno:");
                cuidador.setTurno(teclado.nextLine());
                System.out.println("    Salario:");
                cuidador.setSalario(Float.parseFloat(teclado.nextLine()));
                cuidadores.add(cuidador);
                System.out.println("Cuidador creado.");
                break;
            case "2":
                Oficinista oficinista = new Oficinista();
                System.out.println("Oficinista:");
                System.out.println("    DNI:");
                oficinista.setDni(teclado.nextLine());
                System.out.println("    Nombre:");
                oficinista.setNombre(teclado.nextLine());
                System.out.println("    Apellido:");
                oficinista.setApellidos(teclado.nextLine());
                System.out.println("    Nº tfno:");
                oficinista.setNumTfno(Integer.parseInt(teclado.nextLine()));
                System.out.println("    Jornada:");
                oficinista.setTipoJornada(teclado.nextLine());
                System.out.println("    Salario:");
                oficinista.setSalario(Float.parseFloat(teclado.nextLine()));
                System.out.println("    Departamento:");
                oficinista.setDepartamento(teclado.nextLine());
                oficinistas.add(oficinista);
                System.out.println("Oficinista creado.");
                break;
            case "3":
                Animal animal = new Animal();
                System.out.println("Animal:");
                System.out.println("    Nombre:");
                animal.setNombre(teclado.nextLine());
                System.out.println("    Especie:");
                animal.setEspecie(teclado.nextLine());
                System.out.println("    Sexo:");
                animal.setSexo(teclado.nextLine());
                System.out.println("    Edad:");
                animal.setEdad(Integer.parseInt(teclado.nextLine()));
                System.out.println("    Peso:");
                animal.setPeso(Float.parseFloat(teclado.nextLine()));
                System.out.println("    Recinto:");
                animal.setRecinto(teclado.nextLine());
                animales.add(animal);
                System.out.println("Animal creado.");
                break;
            case "4":
                Recinto recinto = new Recinto();
                System.out.println("Recinto:");
                System.out.println("    ID:");
                recinto.setIdRecinto(teclado.nextLine());
                System.out.println("    Bioma:");
                recinto.setBioma(teclado.nextLine());
                System.out.println("    Capacidad:");
                recinto.setCapacidadAnimales(Integer.parseInt(teclado.nextLine()));
                System.out.println("    Area:");
                recinto.setArea(Double.parseDouble(teclado.nextLine()));
                System.out.println("    Consumo agua:");
                recinto.setConsumoAgua(Float.parseFloat(teclado.nextLine()));
                recintos.add(recinto);
                System.out.println("Animal creado.");
                break;
        }
    }

    private void verEntrada(String tipo){
        //Terminar código
    }
}


