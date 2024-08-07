// 2  A resistor is a circuit device designed to provide a specific resistance between its two ends. 
// Resistance is expressed in ohms (Ω) or kilo-ohms (kΩ). Resistors are usually marked with coloured 
// bands that encode their resistance, as shown in figure 1 below. The first two bands represent digits 
// and the third is a power-of-ten multiplier.
// The table below shows the number value of each band colour. For example, if the first band is red 
// (represents 2), the second is black (represents 0), and the third is orange (represents 3), the 
// resistance is 20 × 103 Ω or 20 kΩ.
// Write a Resistor class containing the parameterized constructor, which takes in three strings 
// representing the three band colours. Write the methods to calculate and set the resistance for the 
// resistor. 
import java.util.*;
class Resistor{
    HashMap<String,Integer> color;
    String band1,band2,band3;
    double value;
    public Resistor(){
        band1=band2=band3="";
        value=0.0;
    }
    public Resistor(String b1,String b2,String b3){
        band1=b1;
        band2=b2;
        band3=b3;
        color = new HashMap<>();
        color.put("black",0);
        color.put("brown",1);
        color.put("red",2);
        color.put("orange",3);
        color.put("yellow",4);
        color.put("green",5);
        color.put("blue",6);
        color.put("violet",7);  
        color.put("grey",8);
        color.put("white",9);
    }
    public String getResistance(){
        value = (color.get(band1)*10+color.get(band2))*Math.pow(10,color.get(band3));
        value = value/1000;
        return value+" Kilo Ohms";
    }
};
public class exp2{
    public static void main(String[] args){
        Resistor r = new Resistor("red","black","orange");
        System.out.println(r.getResistance());
    }

}