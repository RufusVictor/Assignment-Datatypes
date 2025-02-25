class FirstClass {
    void display() {
        System.out.println("Inside FirstClass");
    }
}

class SecondClass {
    void display() {
        System.out.println("Inside SecondClass");
    }
}

class ThirdClass {
    void display() {
        System.out.println("Inside ThirdClass");
    }
}

public class MultipleClasses {  
    public static void main(String[] args) {
        FirstClass obj1 = new FirstClass();
        SecondClass obj2 = new SecondClass();
        ThirdClass obj3 = new ThirdClass();

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
