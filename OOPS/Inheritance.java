package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
         shark.eat();
    }
}
//Base class
class Animal{
    String color;
    void eat(){
            System.out.println("eats");
        }
    void breathe(){
        System.out.println("breathe");
    }
    }

//Derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}





// Types of inheritance in java-
// 1 Single level inheritance
// 2 Multi level inheritance
// 3 hierarchical inheritance
// 4 Multiple Inheritance (Applied through interfaces )
// 5 hybrid inheritance