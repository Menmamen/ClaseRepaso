package Proyecto;

import java.util.Objects;
import java.util.Scanner;

public class TiendaMascotas {

    int numeroMascotas = 0;
    Mascota[] mascotas = new Mascota[100];



    public void agregarMascotas(String nombre, int edad, String tipoDeAnimal){
        mascotas[numeroMascotas] = new Mascota(nombre, edad, tipoDeAnimal);
        numeroMascotas++;
        System.out.println("Se ha agregado correctamente a " + nombre + "\n¡Bienvenid@ " + nombre + "!");

    }
    public void venderMascotas(String nombre){
        boolean exists = false;
        for (int i = 0; i < numeroMascotas ; i++) {
            if(Objects.equals(mascotas[i].getNombre(), nombre)){
                mascotas[i] = null;
                for (int j = i; j < numeroMascotas; j++) {
                    mascotas[j] = mascotas [j+1];
                }
                numeroMascotas--;
                exists = true;
                i = numeroMascotas;

            }

        }
        if (!exists){
            System.out.println("No he podido encontrar ninguna mascota en el sistema con el nombre: " + nombre);
        }else {
            System.out.println("Se ha procesado correctamente la venta de " + nombre + "\n¡Hasta luego " + nombre + "!");
        }
    }
    public void mostrarInventario(){
        if(mascotas[0] == null){
            System.out.println("El inventario se encuentra vacio.");
        }else{
            for (int i = 0; i < numeroMascotas; i++) {
                System.out.println(mascotas[i]);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TiendaMascotas tiendaMascotas = new TiendaMascotas();
        System.out.println("Bienvenido a KIWOKO.");

        System.out.println("¿Qué tarea deseas llevar a cabo?");
        System.out.println("1: Comprobar el inventario.\n2:Agregar una mascota nueva.\n3: Vender una mascota.\n4: Nada, gracias.");
        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("Has seleccionado comprobar el inventario.");
                tiendaMascotas.mostrarInventario();

            case 2:
                System.out.println("Has seleccionado agregar una mascota.\nPor favor introduce el nombre de la nueva mascota :");
                String nombrea = sc.nextLine();
                System.out.println("¿Qué edad tiene " + nombrea + "?");
                int edad = sc.nextInt();
                System.out.println("¿Qué tipo de mascota es?");
                String tipo = sc.nextLine();
                tiendaMascotas.agregarMascotas(nombrea,edad,tipo);

            case 3:
                System.out.println("Has seleccionado vender una mascota.\nPor favor introduce el nombre de la mascota afortunada:");
                String nombrev = sc.nextLine();
                tiendaMascotas.venderMascotas(nombrev);

            case 4:
                System.out.println("¡Gracias por usar nuestro sistema!");

            default:
                System.out.println("No he podido reconocer el valor introducido, por favor reinicia el sistema.");
        }



    }
}
