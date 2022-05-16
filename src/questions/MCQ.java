import java.io.*;



import java.util.*;



public class MCQ



{



    public static void main(String args[]) throws FileNotFoundException



    {



        PrintWriter pw1 = new PrintWriter(new File("LPU.txt"));



        pw1.print("LPU");







        pw1.print("JALANDHAR");



        pw1.flush();



        Scanner st= new Scanner(new File("LPU.txt"));



        st.useDelimiter("A");





        while(st.hasNext())



        {



            System.out.print(st.next());



        }





    }



}