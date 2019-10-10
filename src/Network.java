
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;
//****************
//START: READ ONLY
//****************
public class Network {
//****************
//END: READ ONLY
//****************

// YOU CAN DEFINE YOUR OWN FUNCTIONS HERE IF YOU REALLY NEED ONE

//****************
//START: READ ONLY
//****************

    /**     
	 * @param n : The number of packets
     * @param D : An array representing the packet ordering  
     * @return The performance metric for D
     */
    public static int metric(int []D, int n) {
//****************
//END: READ ONLY
//****************

		//WRITE YOUR NSID: 

		//start: edit and write your code here 
		int test = 0;
		for(int i = 0; i<n; i++) {
		    int []arr = new int[n-(i+1)];
		    System.arraycopy(D,i+1,arr,0,(n-(i+1)));
		    Arrays.sort(arr);
            if (i < n - 1) {
                if(test<D[i]-arr[0]){
		        test=D[i]-arr[0];
            }
            }

//


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
		int n = 0;
		int []X= new int[1000];
		String line;
        try {
            reader = new BufferedReader(new FileReader("Network.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));            
            while(true){ 
				line = reader.readLine();
				if(line == null) break;				
				StringTokenizer st = new StringTokenizer(line, ",");
				n = 0;
				while (st.hasMoreTokens()) {  
					X[n] = Integer.parseInt(st.nextToken()); 
					//System.out.println(""+X[n]);					
					n++;
				} 
                writer.write(metric(X,n) + "\n");
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
