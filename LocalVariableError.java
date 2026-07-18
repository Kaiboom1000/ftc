public class LocalVariableError {
    public static void main(String[] args) {
        greet () ;
        System.out.printIn(name) ;
    }

    static void greet () {
        String name = "Sara";
        System.out.println(name) ;
    }
}