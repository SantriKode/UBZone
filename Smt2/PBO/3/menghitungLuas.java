import java.io.*;
import java.util.*;

public class menghitungLuas {
    
    private static final double PI=(3.14);
    private static final double PHI=(22/7);
        
    private byte side, base, high, radius;
    private double wide;
    
    void setSide(byte rectangleSide){
        this.side = rectangleSide;
    }
    
    void setBase(byte triangleBase){
        this.base = triangleBase;
    }
    
    void setHigh(byte triangleHigh){
        this.high = triangleHigh;
    }
    
    void setRadius(byte circleRadius){
        this.radius = circleRadius;
    }
    
    void setWide(double dataWide){
        this.wide = dataWide;
    }
    
    double getWide(){
        return this.wide;
    }
    
    void rectangleWide(){
        int data = side*side;
        setWide((byte)data);
    }
    
    void triangleWide(){
        double data = base*high*0.5;
        setWide((byte)data);
    }
    
    void circleWide(){
        double data = 0;
        if (radius % 7 == 0){
            data = radius*radius*PHI;
            setWide(data);
        } else{
            data = radius*radius*PI;
            setWide((int)data);
        }
    }
        
    public static void main(String[] args) throws IOException {
        menghitungLuas objek = new menghitungLuas();
        Scanner input = new Scanner(System.in);
        byte data = input.nextByte();
        if (data == 1) {
            objek.setSide(input.nextByte());
            objek.rectangleWide(); //Persegi
            System.out.println((byte)objek.getWide());
        } else if (data == 2) {
            objek.setBase(input.nextByte());
            objek.setHigh(input.nextByte());
            objek.triangleWide(); //Segitiga
            System.out.println((byte)objek.getWide());
        } else if (data == 3) {
            objek.setRadius(input.nextByte());
            objek.circleWide(); //Lingkaran
            System.out.println(objek.getWide());
        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
        input.close();
    }
}
