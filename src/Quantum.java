
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
//****************
//START: READ ONLY
//****************
public class Quantum {
//****************
//END: READ ONLY
//****************

// YOU CAN DEFINE YOUR OWN FUNCTIONS HERE IF YOU REALLY NEED ONE

//****************
//START: READ ONLY
//****************
     public static void fillRow(int indexOfRow,int arrayAdd[][],int numOfElements){
         for(int j=0;j<2*numOfElements;j++){
             arrayAdd[indexOfRow][j] = 1;
         }
     }
     public static boolean checkFill(int indexOfR1,int indexOfR2,int arrayAdd[][],int numOfElements){
         boolean flag = false;

         for(int i=indexOfR1;i<=2*numOfElements-1;i++){
             int sum = 0;
             for(int j=0;j<=indexOfR2;j++){
                    sum += arrayAdd[j][i];
                    if(sum==2&j==indexOfR2){
                        //System.out.println("Sum: "+sum+" Col: "+j+" row: "+i);
                        flag=true;
                        break;
                     }
             }

             if(flag)
                 break;
         }

         return flag;

     }
    static void permute(java.util.List<Integer> arr, int k){
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            System.out.println(java.util.Arrays.toString(arr.toArray()));
        }
    }



    /**     
	 * @param n : The number of buses
     * @return The cost of minimum crossing configuration with X buses
     */
    public static int cost(int X) {
//****************
//END: READ ONLY
//****************

        //WRITE YOUR NSID:

        //start: edit and write your code here
        int test = 2*X;

        int array[][] = new int[test][test];
        boolean flag = true;


            fillRow(0,array,X);
            fillRow(test-1,array,X);


           // System.out.println(checkFill(0,test-1,array,X));
        final int n = 5;

        int j = 0;
        for (int i = 2; i <3 ; i++)
        {

            for ( ; j <= test-1; j++) {
                array[i][j]=1;
                System.out.print("val: "+ array[i][j]+" i: "+i+" j:"+j);
                System.out.println(checkFill(0,2,array,X));
                System.out.println(checkFill(0,test-1,array,X));
                for(int k =0;k<test;k++){
                    for(int l=0;l<test;l++){
                        System.out.print(array[k][l]);
                    }System.out.println(" ");
                }System.out.println(" ");
            }
            System.out.println("exit");j++;
            // Move to the next line

        }


        for(int i =0;i<test;i++){
            for(int p=0;j<test;j++){
                System.out.print(array[i][p]);
            }System.out.println(" ");
        }
        return test;
            //end: write your code here


        }

//****************
//START: READ ONLY
//****************
    /**
     * Main Function.
     */
    public static void main(String[] args) {

        BufferedReader reader;
        File file = new File("output.txt");
		int X = 0; 
		String line;
        try {
            reader = new BufferedReader(new FileReader("Quantum.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));            
            while(true){ 
				line = reader.readLine();
				if(line == null) break;				
				X = Integer.parseInt(line); 
                writer.write(cost(X) + "\n");
				writer.flush();
            } 

            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate input file.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
