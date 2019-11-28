package Lat10;

public class Percobaan2StudentRecordExample {
    /**
     * Mochammad Hudda
     * A2.1900106
     * TI_IA
     * @param args
     */
    public static void main(String[] args){

        //Membuat 3 object StudentRecord
        Percobaan1StudentRecord annaRecord = new Percobaan1StudentRecord();
        Percobaan1StudentRecord beahRecord = new Percobaan1StudentRecord();
        Percobaan1StudentRecord crisRecord = new Percobaan1StudentRecord();

        //Memberi nama siswa
        annaRecord.setName("Anna");
        beahRecord.setName("Beah");
        crisRecord.setName("Cris");

        //Menampilkan nama siswa Anna
        System.out.println(annaRecord.getName());

        //Menampilkan jumlah siswa
        System.out.println("Count = " + Percobaan1StudentRecord.getStudentCount());

    }
}
