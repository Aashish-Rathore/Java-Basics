package OOPS;

public class OOPS {

    public static void main(String[] args) {
        Pen p1= new Pen();          //Created a pen object 
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color= "Yellow";               //updation
        System.out.println(p1.color);  
        
        
        Student s1= new Student();
        s1.calcPercentage(56,64,54);
        
    }     
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;  
    }

    void setTip(int newTip){
        tip = newTip;
    } 
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem , int math){
        percentage = (phy + chem + math) /3 ;

        System.out.println(percentage);

    }
}