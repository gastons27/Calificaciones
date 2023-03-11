/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificaciones;
import java.util.*;

/**
 *
 * @author gasto
 */
public class Calificaciones2 {
    
    String nombre = "";
    int [] calif = new int[5];
    
    public float promedioCal(){
        
        int suma=0;
        
        for (int i=0; i<calif.length; i++) {
            suma+=calif[i];
        }
        
        float promedio = suma / (float)calif.length;
        
        System.out.println("Promedio final es: " +promedio);
        return promedio;
        
        
        
    }

    public char calificacion (float pPromedio){
        char nota=' ';
        
        return nota;
    }
    
    public void imprime (float pPromedio, char pNota){
        
    }
    
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    public void setCalificaciones(){
        Scanner s = new Scanner (System.in);
        
        System.out.print("Calificacion 1: ");
        calif[0] = s.nextInt();
        
        System.out.print("Calificacion 2: ");
        calif[1] = s.nextInt();
        
        System.out.print("Calificacion 3: ");
        calif[2] = s.nextInt();
        
        System.out.print("Calificacion 4: ");
        calif[3] = s.nextInt();
        
        System.out.print("Calificacion 5: ");
        calif[4] = s.nextInt();
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

}