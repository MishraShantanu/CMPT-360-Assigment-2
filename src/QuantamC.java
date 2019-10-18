import java.io.*;
import java.util.ArrayList;

//****************
public class QuantamC {
    public static int count = 0;
    public static int count1 = 0;

    public static void makeZero(int array[][],int i){
        for(int row=0;row<5;row++){
            array[i][row]=0;
        }
    }

    public static boolean checkFill(int indexOfR1,int indexOfR2,int arrayAdd[][]){
        boolean flag = true;

        for(int i=indexOfR1;i<=arrayAdd.length-1;i++){
            int sum = 0;
            for(int j=0;j<=indexOfR2;j++){
                sum += arrayAdd[j][i];
                if(sum==2&j==indexOfR2){
                    System.out.println("Sum: "+sum+" Col: "+j+" row: "+i);
                    flag=true;
                    break;
                }else{
                    flag = false;
                    count1++;

                }
            }

            if(!flag)
                break;
        }

        return flag;

    }

    public static void fill1(int array[][],int row,int i){
        if(checkFill(row,array.length-1,array)){
            //array[i][row-1]=0;
            count++;
            if(count<1000) {
                for(;row<5;row++){
                    array[i][row]=1;
                    for(int q=i+1;q<array.length-1;q++){
                        for(int k=0;k<array.length;k++){
                            fill1(array,k,q);
                        }
                    }
                    // fill1();
                    if(i<5) {
                        print(array);
                    }
                }

                makeZero(array,i);

            }
        }

    }

    public static void print(int array[][]){
        for (int j=0;j<5;j++){
            for (int k=0;k<5;k++){
                System.out.print(array[j][k]);
            }
            System.out.println(" ");

        }
        System.out.println(" ");
    }
    public static void base(int array[][]){

        for(int i =0;i<array.length;i++){
            if(i==0||i==array.length-1){
                for (int j=0;j<array.length;j++){
                    array[i][j]=1;
                }
            }
        }
    }
    public static void main(String[] args) {

        int array[][] = new int[5][5];

        base(array);
        print(array);


        for(int i=1;i<array.length-1;i++){
            for(int row=0;row<array.length;row++){
                fill1(array,row,i);
                System.out.println("   ");
            }
        }

        System.out.println(count);
        System.out.println(count1);

    }

}