package OOPS;

public class getandset{
    // Get : to return the value
    // Set : to modify the value
    // this:keyword is used to refer to current object
     public static void main(String[] args) {

    
        Pen p1= new Pen();          
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        
        p1.setColor("Yellow");              
        System.out.println(p1.getColor());
    }
    
}

class Pen{
        String color;
        int tip;

        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }
        void setColor(String newColor){
            this.color = newColor;
        }

        void setTip(int tip){
            this.tip = tip;
        }
    }
