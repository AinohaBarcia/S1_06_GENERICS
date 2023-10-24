package n1exerici1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods <Byte> byteBox = new NoGenericMethods(1,7,3);
        NoGenericMethods <String> stringBox = new NoGenericMethods<>("Maria","Pedro","Emma");
        NoGenericMethods <Integer> intBox = new NoGenericMethods<>(122,45,630);

        NoGenericMethods<Object> randomObject = new NoGenericMethods<>(byteBox,intBox,stringBox);
        NoGenericMethods<Object> randomObject2 = new NoGenericMethods<>(stringBox,byteBox,stringBox);
        stringBox.setObject1("Pepita");

        System.out.println(stringBox.getObject1());
        System.out.println(randomObject);
        System.out.println(randomObject2);
    }
}
