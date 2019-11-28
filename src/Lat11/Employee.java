package Lat11;

/**
 *  Mochammad Hudda
 *  A2.1900106
 *  Ti-IA
 */


public class Employee extends Percobaan1SubclassSuperclass {
    public String getName(){
        System.out.println("Employee Name : " + name);
        return name;
    }

    public static void main(String[] args){
        Percobaan1SubclassSuperclass ref;
        Percobaan1Extends studentObject = new Percobaan1Extends();
        Employee employeeObject = new Employee();

        ref = studentObject; //Person menunjuk kepada Object Student

        String temp = ref.getName(); //getName dari Student Class dipanggil
        System.out.println(temp);

        ref = employeeObject; //Person menunjuk kepada Object Employee

        temp = ref.getName(); //getName dari Employee Class dipanggil
        System.out.println(temp);

    }
}
