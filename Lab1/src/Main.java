public class Main {
    public static void main(String[] args) {
        // Создание строк
        String str1 = "Hello, World!";
        String str2 = "Java Programming";

        // Длина строки
        int length = str1.length();
        System.out.println("Длина строки str1: " + length);

        // Сравнение строк
        boolean areEqual = str1.equals(str2);
        System.out.println("str1 и str2 равны: " + areEqual);

        // Сравнение без учета регистра
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("str1 и str2 равны без учета регистра: " + areEqualIgnoreCase);

        // Объединение строк
        String concatenatedStr = str1.concat(" " + str2);
        System.out.println("Объединенная строка: " + concatenatedStr);

        // Извлечение подстроки
        String subStr = str1.substring(0, 5);
        System.out.println("Подстрока: " + subStr);

        // Поиск индекса подстроки
        int index = str2.indexOf("Java");
        System.out.println("Индекс первого вхождения 'Java' в str2: " + index);

        // Замена символов
        String replacedStr = str1.replace('o', '0');
        System.out.println("Замененная строка: " + replacedStr);

        // Разделение строки на массив подстрок
        String[] parts = str2.split(" ");
        System.out.println("Разделенная строка: ");
        for (String part : parts) {
            System.out.println(part);
        }

        // Удаление начальных и конечных пробелов
        String trimmedStr = "  Trim me  ".trim();
        System.out.println("Обрезанная строка: " + trimmedStr);

        // Определение, начинается ли строка с подстроки
        boolean startsWith = str1.startsWith("Hello");
        System.out.println("str1 начинается с 'Hello': " + startsWith);

        // Определение, заканчивается ли строка на определенную подстроку
        boolean endsWith = str2.endsWith("Programming");
        System.out.println("str2 заканчивается на 'Programming': " + endsWith);

        // Проверка, содержит ли другую подстроку или нет
        boolean contains = str2.contains("Java");
        System.out.println("str2 содержит 'Java': " + contains);

        // Лексическое сравнение строк
        int compareTo = str1.compareTo(str2);
        System.out.println("Результат сравнения str1 и str2: " + compareTo);

        // Приведение к верхнему регистру
        String upperCase = str1.toUpperCase();
        System.out.println("str1 в верхнем регистре: " + upperCase);

        // Приведение к нижнему регистру
        String lowerCase = str2.toLowerCase();
        System.out.println("str2 в нижнем регистре: " + lowerCase);
    }
}
