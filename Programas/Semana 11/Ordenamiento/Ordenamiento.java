import  java.util.Scanner;

public class Ordenamiento{
    public static void main(String[] args){
        int n, i, j, aux, p_m;
        Scanner teclado = new Scanner(System.in);
        
        n = teclado.nextInt();
        int[] v = new int[n];
        for(i=0;i<n;i++) v[i] = teclado.nextInt();
        
        for(i=0; i<n-1; i++){
            p_m = i;
            for(j=i+1; j<n; j++){
                if(v[j] < v[p_m]){
                    p_m = j;
                }
            }
            aux = v[p_m];
            v[p_m] = v[i];
            v[i] = aux;
        }
        for(i=0;i<n;i++) System.out.print(v[i]+" ");
    }
}
