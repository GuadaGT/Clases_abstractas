import Interfaces.Animal;
import Models.Gato;
import Models.Perro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        Perro perro1 = new Perro("Patitas",2,"Galgo");
        Perro perro2 = new Perro("Calcetines",3,"Husky");
        Perro perro3 = new Perro("Avellano",6,"Podenco");
        Perro perro4 = new Perro("Gaia",7,"Podenco");
        Gato gato1 = new Gato("Pecas",11,"corto");
        Gato gato2 = new Gato("Pikachu",6,"largo");
        Gato gato3 = new Gato("Levi",5,"corto");
        Gato gato4 = new Gato("Eren",1,"largo");

        listaAnimales.add(perro1);
        listaAnimales.add(perro2);
        listaAnimales.add(perro3);
        listaAnimales.add(perro4);
        listaAnimales.add(gato1);
        listaAnimales.add(gato2);
        listaAnimales.add(gato3);
        listaAnimales.add(gato4);

        for (Animal a : listaAnimales) {
            System.out.println(a);
            a.comer();
            a.dormir();
            System.out.println("----------------------");
        }
    }
}
