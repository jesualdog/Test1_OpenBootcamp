package Ejercicios;
/*
 * @author Jesualdo Gutierrez
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        int resultado;
        //Se llama a la función suma y se almacenan los datos en una variable
        resultado = suma(5, 10, 15);
        System.out.println(resultado);
    }
    
    public static int suma(int num1, int num2, int num3){
        return (num1 + num2 + num3);
    }
    
}
