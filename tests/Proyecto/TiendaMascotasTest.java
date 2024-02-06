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
        mascotatest[0] = new Mascota("Lobo", 1, "perro");
        TiendaMascotas tiendaMascotas = new TiendaMascotas();
        tiendaMascotas.agregarMascotas(nombre,edad,tipo);

        assertArrayEquals(mascotatest[0], tiendaMascotas.mascotas[0]);
    }

    @Test
    public void venderMascotas() {
    }

    @Test
    public void mostrarInventario() {
    }

}