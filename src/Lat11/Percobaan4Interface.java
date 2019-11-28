package Lat11;

/**
 *  Mochammad Hudda
 *  A2.1900106
 *  TI_IA
 */


public class Percobaan4Interface implements Relation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Percobaan4Interface(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }

    public double getLength(){
        double length = Math.sqrt((x2 - x1)*(x2 - x1) +
                (y2 - y1)*(y2 - y1));
        return length;
    }

    public boolean isGreater(Object a, Object b){
        double aLen = ((Percobaan4Interface)a).getLength();
        double bLen = ((Percobaan4Interface)b).getLength();
        return(aLen > bLen);
    }

    public boolean isLess(Object a, Object b){
        double aLen = ((Percobaan4Interface)a).getLength();
        double bLen = ((Percobaan4Interface)b).getLength();
        return(aLen > bLen);
    }

    public boolean isEqual(Object a, Object b){
        double aLen = ((Percobaan4Interface)a).getLength();
        double bLen = ((Percobaan4Interface)b).getLength();
        return(aLen == bLen);
    }
}
