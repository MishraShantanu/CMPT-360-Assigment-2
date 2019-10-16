
import java.io.*;
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
    public static int fill(int a[][],int i,int X,int count){

        for(int j=0;j<2*X;j++){

            a[i][j] = 1;
        }
        count++;

        return count;
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
        int test = X;
        int count = 0;
        int a[][] = new int[2 * X][2 * X];
        for (int i = 0; i < 2 * X; i++) {
              count = fill(a,i,X,count);
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
