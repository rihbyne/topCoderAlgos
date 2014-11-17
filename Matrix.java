package topCoderAlgos;

/**
 * This class performs matrix operations
 */

public class Matrix {
   private int N;
   private int[][] c;

   public int[][] computeDotMatrix(int[][] a,int[][] b){
       N = a.length;
       c = new int[N][N];

       System.out.println(N);

       for (int i = 0; i < N; i++)
           for (int j = 0; j < N; j++)
           { // Compute dot product of row i and column j.
               for (int k = 0; k < N; k++){
                   System.out.println("c"+"["+i+"]"+"["+j+"]"+"="+"a["+i+"]"+"["+k+"]"+"b"+"["+k+"]"+"["+j+"]"+"N="+N);
                   c[i][j] += a[i][k]*b[k][j];
               }
           }
       return c;
   }

}
