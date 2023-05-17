package Models;

import Interfaces.Animal;

public class Perro extends Animal
{
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void comer() {
        System.out.println("El perro  está comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro  está durmiendo");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }
}
