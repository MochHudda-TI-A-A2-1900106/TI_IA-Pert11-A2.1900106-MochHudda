package Lat7;

public class Percobaan3ArrayMultidimensi {
    /**
     * Mochammad Hudda
     * A2.1900106
     * TI_IA
     */
    public static void main(String[]args)
    {
        //512 x 128 dari integer array
        int[][] twoD = new int[512][128];
        //Karakter 8 x 16 x 24
        char[][][] threeD = new char[8][16][24];
        //String array 4 x 2
        String[][] dogs = {{"Terry","Brown"},{"Kristin","White"},{"Toby","Gray"},{"Fido","Black"}};
        System.out.println(dogs[0][0]);
    }
}
