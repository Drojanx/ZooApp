package com.edesarrollo.alanz.zooapp;

import com.edesarrollo.alanz.zooapp.domain.*;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ZooTest {

    private static Zoo zoo;

    @BeforeAll
    public static void setupAll() { zoo = new Zoo(); }

    @Test
    public void testConstructorAnimal(){
        Animal animal = new Animal("Michi", "Felino", "Macho", 5, 40, "1A");
        assertEquals("Michi", animal.getNombre());
        assertEquals("Felino", animal.getEspecie());
        assertEquals("Macho", animal.getSexo());
        assertEquals(5, animal.getEdad());
        assertEquals(40, animal.getPeso());
        assertEquals("1A", animal.getRecinto());
        assertNotEquals("Hola", animal.getEdad());
        assertNotEquals("Ave", animal.getEspecie());
    }

    @Test
    public void testConstructorRecinto(){
        Recinto recinto = new Recinto("1A", "Sabana", 12, 80.50, 1200.00);
        assertEquals("1A", recinto.getIdRecinto());
        assertEquals("Sabana", recinto.getBioma());
        assertEquals(12, recinto.getCapacidadAnimales());
        assertEquals(80.50, recinto.getArea());
        assertEquals(1200.00, recinto.getConsumoAgua());
        assertEquals(120, recinto.getCapacidadAnimales());
        assertNotEquals("MAL", recinto.getIdRecinto());
        assertEquals(2000, recinto.getBioma());
    }

    @Test
    public void testConstructorTrabajador(){
        Trabajador trabajador = new Trabajador("11111111F", "Pepe", "Lopez Gimenez", 976121212, 1200);
        assertEquals("11111111F", trabajador.getDni());
        assertEquals("Pepe", trabajador.getNombre());
        assertEquals("Lopez Gimenez", trabajador.getApellidos());
        assertEquals(976121212, trabajador.getNumTfno());
        assertEquals(1200, trabajador.getSalario());
        assertNotEquals("MAL", trabajador.getDni());
    }

    @Test
    public void testConstructorCuidador(){
        Cuidador cuidador = new Cuidador("22222222Q", "Almudena", "Calava Sierra", 976343434, 1200, "Tarde");
        assertEquals("22222222Q", cuidador.getDni());
        assertEquals("Almudena", cuidador.getNombre());
        assertEquals("Calava Sierra", cuidador.getApellidos());
        assertEquals(976343434, cuidador.getNumTfno());
        assertEquals(1200.00, cuidador.getSalario());
        assertEquals(2, cuidador.getTurno());
        assertNotEquals("Tarde", cuidador.getTurno());
        assertNotEquals(2000, cuidador.getApellidos());
    }

    @Test
    public void testConstructorOficinista(){
        Oficinista oficinista = new Oficinista("33333333J", "Sergio", "Ramirez Calvo", 976565656, 1200, "Contabilidad", "Completa");
        assertEquals("33333333J", oficinista.getDni());
        assertEquals("Sergio", oficinista.getNombre());
        assertEquals("Ramirez Calvo", oficinista.getApellidos());
        assertEquals(976565656, oficinista.getNumTfno());
        assertEquals(1200, oficinista.getSalario());
        assertEquals("Contabilidad", oficinista.getDepartamento());
        assertEquals("Completa", oficinista.getTipoJornada());
        assertNotEquals(2000, oficinista.getNumTfno());
        assertNotEquals("MAL", oficinista.getTipoJornada());
    }



}
