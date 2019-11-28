package Lat10;

/**
 *  Mochammad Hudda
 *  A2.1900106
 *  TI_IA
 */


public class Percobaan4StudentRecordExampleModify {
    public static void main(String[] args){
        //Membuat 3 object StudentRecord
        Percobaan3StudentRecordModify annaRecord = new Percobaan3StudentRecordModify();
        Percobaan3StudentRecordModify beahRecord = new Percobaan3StudentRecordModify();
        Percobaan3StudentRecordModify crisRecord = new Percobaan3StudentRecordModify();

        //Versi baru
        Percobaan3StudentRecordModify recordAnna = new Percobaan3StudentRecordModify("Candra");
        Percobaan3StudentRecordModify recordBeah = new Percobaan3StudentRecordModify("Bagus","Malang");
        Percobaan3StudentRecordModify recordCris = new Percobaan3StudentRecordModify(80,90,100);

        //Memberi nama siswa
        annaRecord.setName("Anna");
        beahRecord.setName("Beah");
        crisRecord.setName("Cris");

        //Menampilkan nama siswa Anna
        System.out.println(annaRecord.getName());

        //Menampilkan jumlah siswa
        System.out.println("Count = " + Percobaan3StudentRecordModify.getStudentRecord());
        Percobaan3StudentRecordModify anna2Record = new Percobaan3StudentRecordModify();
        anna2Record.setName("Anna");
        anna2Record.setAddress("Philipina");
        anna2Record.setAge(15);
        anna2Record.setMathGrade(80);
        anna2Record.setEnglishGrade(95.5);
        anna2Record.setScienceGrade(100);

        //overload method
        anna2Record.print(anna2Record.getName());
        anna2Record.print(anna2Record.getEnglishGrade(),
                anna2Record.getMathGrade(),
                anna2Record.getScienceGrade());
        recordAnna.print(recordAnna.getName());

    }
}
