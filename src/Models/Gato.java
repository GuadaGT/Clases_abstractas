package Models;

import Interfaces.Animal;

public class Gato extends Animal
{
    private String pelaje;

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public Gato() {
    }

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public Gato(String nombre, int edad, String pelaje) {
        super(nombre, edad);
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pelaje='" + pelaje + '\'' +
                '}';
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El gato está durmiendo");
    }
}
