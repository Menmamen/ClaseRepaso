package Proyecto;

import org.junit.Test;

import static org.junit.Assert.*;

public class TiendaMascotasTest {

    @Test
    public void agregarMascotas() {
        TiendaMascotas tiendaMascotas = new TiendaMascotas();
        assertEquals(0,tiendaMascotas.numeroMascotas);
        tiendaMascotas.agregarMascotas("Lobo", 1, "perro");
        assertEquals(1,tiendaMascotas.numeroMascotas);
    }

    @Test
    public void venderMascotas() {
        TiendaMascotas tiendaMascotas = new TiendaMascotas();
        tiendaMascotas.agregarMascotas("Lobo", 1, "perro");
        tiendaMascotas.venderMascotas("Lobo");
        assertEquals(0, tiendaMascotas.numeroMascotas);
    }


    @Test
    public void testVenderMascotasnoExiste() {
        TiendaMascotas tiendaMascotas = new TiendaMascotas();
        tiendaMascotas.agregarMascotas("Lobo", 1, "perro");
        tiendaMascotas.venderMascotas("Luna");
        assertEquals(1, tiendaMascotas.numeroMascotas);
    }
}