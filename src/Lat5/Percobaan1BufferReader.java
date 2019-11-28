package Lat5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Percobaan1BufferReader {
    /**
     * Mochammad Hudda
     * A2.1900106
     * TI_IA
     */
    public static void main(String[]args)
    {
        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
        String nama ="";

        System.out.print("Please Enter Your Name: ");
        try {
            nama = datain.readLine();
        }catch (IOException e){
            System.out.println("Error!");
        }
        System.out.println("hello "+nama);
    }
}
