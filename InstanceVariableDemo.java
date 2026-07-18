
        class Student {
            String name;
            public void sayHello() {
                System.out.println("Hello, my name is " + name);
            }
}

public class InstanceVariableDemo {

    public static void main(String[] args) {
        Student s1 = new Student ();
        s1.name = "veer";

        Student s2 = new Student();
        s2.name = "Rahul";
    
        s1. sayHello(); 
        s2. sayHello();
// Hello, my name is Arya
// Hello, my name is Rahul
}
}