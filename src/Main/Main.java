/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Main {

    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Sema","Soja",3,"Delmon");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Pelusa","Alimento",8,"Oveja");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("Raviol","Alimento",2,"siames");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Princesa","Alfalfa",5,"overo");
        caballo1.Alimentarse();
        
        
        
        
    }
    
}
