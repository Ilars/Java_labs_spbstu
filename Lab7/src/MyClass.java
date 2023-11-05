public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void swapValues(MyClass obj1, MyClass obj2) {
        int temp = obj1.value;
        obj1.value = obj2.value;
        obj2.value = temp;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);

        System.out.println("До обмена:");
        System.out.println("obj1.value = " + obj1.getValue());
        System.out.println("obj2.value = " + obj2.getValue());

        // Вызываем метод для обмена значений между объектами
        swapValues(obj1, obj2);

        System.out.println("\nПосле обмена:");
        System.out.println("obj1.value = " + obj1.getValue());
        System.out.println("obj2.value = " + obj2.getValue());
    }
}
