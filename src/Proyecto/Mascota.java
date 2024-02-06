package Proyecto;

public class Mascota {

    private String nombre;
    private int edad;
    private String tipoDeAnimal;



    public Mascota(String nombre, int edad, String tipoDeAnimal){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }
}
