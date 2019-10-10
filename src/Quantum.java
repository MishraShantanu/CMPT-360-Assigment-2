
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
