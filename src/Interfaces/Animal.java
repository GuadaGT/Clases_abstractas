package Interfaces;

public abstract class Animal
{
    protected String nombre;
    protected int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Animal()
    {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract void comer();

    public abstract void dormir();
}

