public class Main {
    public static void main(String[] args) {
       int [][] A = {{0,0,0,4,0},{0,0,0,0,0,0},{-19,0,0,0,0},{0,0,7,0,0},{0,0,0,0,0},{0,0,0,22,0}};
       for (int [] element: A) {
           for (int i = 0; i <= 4; i++)
           {
               if (i!=4)
                   System.out.print(element[i] + " ");
               else
                   System.out.print(element[i]);
           }
           System.out.println();
       }
    }
}