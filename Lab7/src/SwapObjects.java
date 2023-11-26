public class SwapObjects {
    public static <T> void swapValues(T obj1, T obj2) {
        System.out.println("Обмен значений перед:");
        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);

        T temp = obj1;
        obj1 = obj2;
        obj2 = temp;

        System.out.println("Обмен значений после:");
        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);
    }

    public static void main(String[] args) {
        Integer num1 = 5;
        Integer num2 = 10;

        swapValues(num1, num2);

        String str1 = "Hello";
        String str2 = "World";

        swapValues(str1, str2);
    }
}
