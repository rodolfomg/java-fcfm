import  java.util.Scanner;

public class Espiral{
    public static void main(String[] args){
        int n, i, j;
        Scanner teclado = new Scanner(System.in);
        
        n = teclado.nextInt();
        int[][] mat = new int[n][n];
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                mat[i][j] = teclado.nextInt();
            }
        }
        
        int x, y, sentido=-1;
        x = y = (int)n/2;
        System.out.print(mat[y][x]+" ");
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                x = x + 1 * sentido;
                if(x>=0 && x<n && y>=0 && y<n)
                    System.out.print(mat[y][x]+" ");
            }
            sentido *= -1;
            for(j=1; j<=i; j++){
                y = y + 1 * sentido;
                if(x>=0 && x<n && y>=0 && y<n)
                    System.out.print(mat[y][x]+" ");
            }
        }

    }
}

/*
5
25 24 23 22 21
10 9 8 7 20
11 2 1 6 19
12 3 4 5 18
13 14 15 16 17
*/
