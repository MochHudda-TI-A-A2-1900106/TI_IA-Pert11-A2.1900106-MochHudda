package Lat10;

/**
 *Mochammad Hudda
 * A2.1900106
 * TI_IA
 */


public class Percobaan1StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int StudentCount;

    /**
     * Menghasilkan nama dari siswa
     */
    public String getName(){
        return name;
    }

    /**
     * Mengubah nama siswa
     */
    public void setName(String temp){
        name = temp;
    }

    //Area penulisan kode lain

    /**
     * Menghitung rata-rata nilai Matematik, Bahasa Inggris, ** Ilmu Pasti
     */
    public double getAverage(){
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade)/3;
        return result;
    }

    /**
     * Menghasilkan jumlah instance StudentRecord
     */
    public static int getStudentCount(){
        return StudentCount;
    }
}
