package Proyecto;

import Proyecto.Mascota;

public class TiendaMascotas {

    int numeroMascotas = 0;
    Mascota[] mascotas = new Mascota[100];



    public void agregarMascotas(String nombre, int edad, String tipoDeAnimal){
        mascotas[numeroMascotas] = new Mascota(nombre, edad, tipoDeAnimal);
        numeroMascotas++;

    }
    public void venderMascotas(String nombre){
        for (int i = 0; i < numeroMascotas ; i++) {
            if(mascotas[i].nombre == nombre){
                mascotas[i] = null;
                numeroMascotas--;
                i = numeroMascotas;
            }
        }
    }
    public static void main(String[] args) {



    }
}
