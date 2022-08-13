package Ejercicios;
/*
 * @author Trabajo
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Coche miCoche = new Coche();//Se crea el objeto miCoche
        
        //Se le asignan puertas al coche
        miCoche.AdicionarPuerta();
        miCoche.AdicionarPuerta();
        miCoche.AdicionarPuerta();
        miCoche.AdicionarPuerta();
        System.out.println(miCoche.puertas);       
    }  
}

class Coche{
    public int puertas;//Variable que almacena el numero de puertas
    
    //Función que incrementa el numero de puertas del coche
    public void AdicionarPuerta(){
        this.puertas++;
    }   
}
