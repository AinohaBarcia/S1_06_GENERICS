package n1exerici1;

public class Main {
    public static void main(String[] args) {

        String object1 = "Maria";
        String object2 = "Pedro";
        String object3= "Emma";
        ;
        NoGenericMethods  ngm = new NoGenericMethods(object1,object2,object3);

        NoGenericMethods ngm2 = new NoGenericMethods(object2,object3,object1);

        System.out.println(ngm);
        System.out.println(ngm2);
    }
}
