package EngineerTest;

class Parent{
    void show(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("Child");
    }
}

public class Main{
    public static void main(String[] args){
        Parent pa = new Child();
        pa.show();
    }
}