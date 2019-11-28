package Lat9;

public class Percobaan1PassByValue {
    /**
     * Mochammad Hudda
     * A2.1900106
     * TI_IA
     */
    public static void main(String[]args)
    {
        int i = 10;
        System.out.println(i);
        test(i);
        System.out.println(i);
    }
    public static void test(int j){
        j = 33;
    }
}
