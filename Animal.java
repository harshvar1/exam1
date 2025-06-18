import java.util.*;
class Animal
{
    String name;
    public void eat(){
        System.out.println("I can eat");
        System.out.println("I can eat");
        
    }


}

class dog extends Animal {
    public void display() {
        System.out.println("My name is "+  name);
    }
}

class Main {
    public static void main(String[] args) {
        dog labrador=new dog();

        labrador.name ="rohu";
        labrador.display();
        labrador.eat();
        
    }
}
