import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassInfo {
    public static void printClassInfo(Class<?> clazz) {
        System.out.println("Информация о классе: " + clazz.getName() + "\n");

        // Модификаторы класса
        int modifiers = clazz.getModifiers();
        System.out.println("Модификаторы: " + Modifier.toString(modifiers) + "\n");

        // Родительский класс
        Class<?> superclass = clazz.getSuperclass();
        if (superclass != null) {
            System.out.println("Родительский класс: " + superclass.getName() + "\n");
        }

        // Интерфейсы, реализуемые классом
        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            System.out.print("Интерфейсы: ");
            for (Class<?> intf : interfaces) {
                System.out.print(intf.getName() + ", ");
            }
            System.out.println("\n");
        }

        // Поля класса
        Field[] fields = clazz.getDeclaredFields();
        if (fields.length > 0) {
            System.out.println("Поля класса:");
            for (Field field : fields) {
                System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getName() + " " + field.getName());
            }
            System.out.println("\n");
        }

        // Методы класса
        Method[] methods = clazz.getDeclaredMethods();
        if (methods.length > 0) {
            System.out.println("Методы класса:");
            for (Method method : methods) {
                System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getName() + " " + method.getName());
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Class<?> clazz = String.class; // Пример класса String
        printClassInfo(clazz);
    }
}