
import java.io.*;
import java.util.ArrayList;

//****************
public class Q2 {

    public static void makeZero(int array[][]){
        for(int col=0;col<5;col++){
            for(int row=0;row<5;row++) {
                array[col][row] = 0;
            }
        }
    }

    public static void fill1(int array[][],int row ){
        int col = array.length-1;
        //  System.out.print("A");
        for(;col<5;col++) {
            //   System.out.print("B");
            for (; row < 5; row++) {
                // System.out.print("c");
                array[col][row] = 1;
            }
        }
        for(int i=0;i<5;i++){
            // System.out.print("B");
            for (int j=0;j<5;j++){
                System.out.print(array[i][j]);
                //  System.out.print("L");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        makeZero(array);
    }






    public static void main(String[] args) {

        int array[][] = new int[5][5];

            for(int row=0;row<5;row++){
                fill1(array,row);
            }




    }

}
