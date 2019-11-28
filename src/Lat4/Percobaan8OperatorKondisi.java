package Lat4;

public class Percobaan8OperatorKondisi {
    /**
     * Mochammad Hudda
     * A2.1900106
     * TI_IA
     */
    public static void main(String[]args)
    {
        String status ="";
        int grade = 80;
        //Mendapatkan status pelajar
        status =  (grade >= 60)?"Passed":"Fail";

        //print
        System.out.println(status);
    }
}

