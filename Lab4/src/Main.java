public class Main {

    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        int choice = 2;

        switch (choice) {
            case 1:
                System.out.println("Выбран вариант 1");
                break;
            case 2:
                System.out.println("Выбран вариант 2");
                break;
            case 3:
                System.out.println("Выбран вариант 3");
                break;
            default:
                System.out.println("Неверный вариант");
        }

        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Понедельник");
                break;
            case "Tuesday":
                System.out.println("Вторник");
                break;
            default:
                System.out.println("Другой день");
        }

        Color color = Color.RED;

        switch (color) {
            case RED:
                System.out.println("Красный");
                break;
            case GREEN:
                System.out.println("Зеленый");
                break;
            case BLUE:
                System.out.println("Синий");
                break;
        }
    }
}
