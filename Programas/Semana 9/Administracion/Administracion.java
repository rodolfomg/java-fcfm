import java.util.Scanner;
import java.lang.String;

class Estudiante {
    private
        String Nombre, Carrera;
        int Matricula, Semestre;
        float Promedio;
    
    public void setPromedio(float prom){
        Promedio = prom;
    }
    
    public float getPromedio(){
        return Promedio;
    }
}

public class Administracion {
    
    public static void main(String[] args){
        int n;
        float prom=0, valor;
        Scanner teclado = new Scanner(System.in);
        Estudiante alumno = new Estudiante();
        
        n = teclado.nextInt();
        for(int i=1; i<=n; i++){
            valor = teclado.nextFloat();
            prom = prom + valor;
        }
        
        prom = prom / n;
        
        alumno.setPromedio(prom);
        System.out.println("Promedio: "+alumno.getPromedio());
    }
    
}
