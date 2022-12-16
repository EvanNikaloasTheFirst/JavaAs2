package DataStorage;
import java.io.*;
import java.io.FileWriter;


public class Persistance {

    public static int add (int a, int b){
        return a + b;
    }

    public int sub(int a , int b){
        return a -b;
    }
    public static void writeData(String filename)
    {
        //   open file
//        write to file
//        close the file
        String names [] = {"Evan","Emmanuel","John"};
        try{
//      FileWriter creates a new file
        FileWriter fr = new FileWriter(filename);

//     BufferedWriter  buffers all the data at once
        BufferedWriter bw = new BufferedWriter(fr);

        for(String s:names)
        {
            bw.write(s+"\n");
        }
        bw.close();
    }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void readFile(String filename){
//        open file
//        read to file
//        close the file

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
//                reads everything in the file
                System.out.println(br.readLine());
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args)  {
//        need an object to call a non static method
        Persistance p = new Persistance();
//        add(1,2);
//        p.sub(4,3);
        writeData("outfile.text");
        readFile("outfile.text");
    }
}
