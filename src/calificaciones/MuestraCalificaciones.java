package calificaciones;
import java.util.*;

/**
 *
 * @author gasto
 */
public class MuestraCalificaciones {
    String nombre = "";
    int[] calif = new int [5];
    
    public static void main(String[] args) {
        
        String capturaNombre="";
        float promedioResult=0;
        char califNota=' ';
        
        Calificaciones2 pCalculo = new Calificaciones2();
        System.out.print("Calificaciones\n");
        
        
        Scanner s = new Scanner (System.in);
        System.out.print("Alumno: ");
        capturaNombre = s.next();
        pCalculo.setNombre(capturaNombre);
        
        pCalculo.setCalificaciones();
        promedioResult = pCalculo.promedioCal();
        
      
        
        if(promedioResult > 0 && promedioResult <= 50) califNota = 'F';
        if(promedioResult > 51 && promedioResult <= 60) califNota = 'E';
        if(promedioResult > 61 && promedioResult <= 70) califNota = 'D';
        if(promedioResult > 71 && promedioResult <= 80) califNota = 'C';
        if(promedioResult > 81 && promedioResult <= 90) califNota = 'B';
        if(promedioResult > 91 && promedioResult <= 100) califNota = 'A';
        
        
        System.out.println("Calificacion Final: " +califNota);
        
        
    }
        
        
        
    }
    

