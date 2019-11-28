package Lat11;

/**
 *  Mochammad Hudda
 *  A2.1900106
 *  TI_IA
 */


public class Percobaan1SubclassSuperclass {
    protected String name;
    protected String address;
    /**
     * Default constructor
     */

    public Percobaan1SubclassSuperclass(){
        System.out.println("Inside Person : Constructor");
        name = "";
        address = "";
    }

    /**
     * Constructor dengan dua parameter
     */
    public Percobaan1SubclassSuperclass(String name, String address){
        this.name = name;
        this.address = address;
    }

    /**
     * Method Accessor
     */
    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String add)
    {
        this.address = add;
    }
}

