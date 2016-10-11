import java.util.Scanner;
import java.lang.String;

public class Edificios{
    public static void main(String[] args){
        int m, n, x, y, c, k, i, j;
        Scanner teclado = new Scanner(System.in);
        
        m = teclado.nextInt();
        n = teclado.nextInt();
        int[][] mapa = new int[m][n];
        
        for(i=0; i<m; i++)
            for(j=0; j<n; j++)
                mapa[i][j] = 0;
        
        c = teclado.nextInt();
        for(i=0; i<c; i++){
            x = teclado.nextInt();
            y = teclado.nextInt();
            mapa[y][x] = 1;
        }
        
        k = teclado.nextInt();
        String[] respuestas = new String[k];
        for(i=0; i<k; i++){
            x = teclado.nextInt();
            y = teclado.nextInt();
            if(mapa[y][x] == 0){
                mapa[y][x] = 1;
                respuestas[i] = "Si";
            }
            else {
                respuestas[i] = "No";
            }
        }
        for(i=0; i<k; i++) System.out.println(respuestas[i]);
    }
}
