
import java.io.*;
import java.util.ArrayList;

//****************
public class QuantamA {

    public static void makeZero(int array[][],int i){
        for(int row=0;row<5;row++){
            array[i][row]=0;
        }
    }

    public static void fill1(int array[][],int row,int i){

        for(;row<5;row++){
            array[i][row]=1;

            for (int j=0;j<5;j++){
                for (int k=0;k<5;k++){
                    System.out.print(array[j][k]);
                }
                System.out.println(" ");
            }

        }

        makeZero(array,i);

    }



    public static void main(String[] args) {

        int array[][] = new int[5][5];
        for(int i=0;i<5;i++){
            for(int row=0;row<5;row++){

                System.out.println("   ");
            }
        }



    }

}
