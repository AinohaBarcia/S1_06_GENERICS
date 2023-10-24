package n1exercici2;

public class Main {
    public static void main(String[] args) {


        Persona persona = new Persona("Emma", "Barcia", 9);
        GenericMethods<Object> object = new GenericMethods<>( "blue",persona, 3);


        System.out.println(object);
    }
}
