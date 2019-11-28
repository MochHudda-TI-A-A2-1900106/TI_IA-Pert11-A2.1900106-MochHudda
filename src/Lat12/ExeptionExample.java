package Lat12;

/**
 *  Mochammad Hudda
 *  A2.1900106
 *  TI-IA
 */

public class ExeptionExample {
    public static void main(String[] args){
        try{
            System.out.println(args[1]);
        }catch (ArrayIndexOutOfBoundsException exp){
            System.out.println("Exeption caught!");
        }
    }
}
