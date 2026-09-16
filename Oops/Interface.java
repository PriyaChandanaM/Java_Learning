interface Animal{
    void sound();
}

class Cat implements Animal{
    @Override 
    public void sound(){
        System.out.println("Meow Meow");
    }

}

class Dog implements Animal{
    @Override 
    public void sound(){
        System.out.println("woof woof");
    }

}

class Cow implements Animal{
    @Override 
    public void sound(){
        System.out.println("Moo Moo");
    }

}

public class Interface{
    public static void main(String [] args){
        Animal a1= new Dog();
        a1.sound();
        Animal a2=new Cat();
        Animal a3= new Cow();
        a2.sound();
        a3.sound();

    }

}