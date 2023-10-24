package n1exercici2;

public class GenericMethods<T> {
    private T object1;
    private T object2;
    private T object3;

    public GenericMethods(T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    @Override
    public String toString() {
        return "GenericMethods" +
                "object1=" + object1 +
                ", object2=" + object2 +
                ", object3=" + object3;
    }

}
