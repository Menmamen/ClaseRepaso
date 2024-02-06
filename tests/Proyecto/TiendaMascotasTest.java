package Proyecto;

import org.junit.Test;

import static org.junit.Assert.*;

public class TiendaMascotasTest {

    @Test
    public void agregarMascotas() {
        String nombre = "Lobo";
        int edad = 1;
        String tipo = "perro";
        Mascota[] mascotatest = new Mascota[10];
        mascotatest[0] = ("Lobo",1,"perro");
        TiendaMascotas tiendaMascotas = new TiendaMascotas();
        tiendaMascotas.agregarMascotas(nombre,edad,tipo);

        assertArrayEquals(tiendaMascotas.mascotas[0], mascotatest[0]);
    }

    @Test
    public void venderMascotas() {
    }

    @Test
    public void mostrarInventario() {
    }

}