/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguez01092025;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         matriz();
        
        
    }
    
    
    public static void matriz () {
        //Se Isntancia el SCANNER para lectura de teclado
        Scanner scanner = new Scanner(System.in);
        
        
        //Se instancia la matriz de INTEGER
        int [][] matriz = new int [3][3];
        int suma = 0; //Variable para la suma de valores digitados
        int total_elementos = 0; //contador de elementos de la matriz
        double promedio = 0d;//calculo del promedio de edades digitadas
        
        ///Salida al usuario para indicar que debe ingresar datos
        System.out.println("ingrese los valores para una matriz 3 x 3");{
        
        
        //Se recorre primero las filas con una estructura de control Iterativa
        //DE tipo por
        for(int i=0; i<matriz.length; i++){
            //En cada iteracion de debera obtener ka cantidad de elementos
            //Que existe en el arreglo (cantidad de columnas)
            total_elementos += matriz[i].length;
            
            //Se Recorre las columnas
            //
            //
            for(int j = 0; j < matriz[i].length; j++){
            //Se vuelve un ARRAY -------    
                //Se imprime el valor de cada celda de la matriz (fila,columna)
                //Fila: x columna: Y
                
                //System.out.println(matriz[i][j]+" ");
            
                //Se imprime la peticion al usuario para el ingreso de datos
                System.out.println("Elemento [ " +i+ " ][" +j+ "]");
                
                //Se hace lectura de teclado
                matriz[i][j] = scanner.nextInt();
            }
        }
    
        
        //Salida de valores
    System.out.println("matriz ingresada:");
    
    //Se recorre las filas de la matriz
    for(int x = 0; x <matriz.length; x++){
    
    
    for(int y=0; y < matriz[x].length; y++){
        
        
         System.out.print(matriz[x][y]+" ");
         
         suma += matriz[x][y];
        
    }
    System.out.println();
    }
    
    
    promedio = (double) suma/total_elementos;
     System.out.println(suma+"es la sumatoria total de elementos, la cantidad de elementos digitados es de:"+total_elementos);
     System.out.println("El promedio de edad es:" +promedio);
    
    //
    
    
    
         
          
    
        
}
    
    
}       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
