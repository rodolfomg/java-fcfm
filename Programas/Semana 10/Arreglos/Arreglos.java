import java.util.Scanner;
import java.lang.String;

class Cancion {
    String nombre;
    int valor;
}

class Arreglos{
    public static void main(String[] args){
        Cancion[] canciones = new Cancion[500];
        int n, mayor;
        Scanner teclado = new Scanner(System.in);
        
        n = teclado.nextInt();
        teclado.nextLine();
        for(int i=0; i<n; i++){
            canciones[i] = new Cancion();
            canciones[i].valor = teclado.nextInt();
            canciones[i].nombre = teclado.nextLine();
        }
        for(int i=0; i<n; i++){
            mayor = 0;
            for(int j=0; j<n; j++){
                if(canciones[j].valor > canciones[mayor].valor){
                    mayor = j;
                }
            }
            System.out.println(canciones[mayor].nombre);
            canciones[mayor].valor = 0;
        }
    }
}
