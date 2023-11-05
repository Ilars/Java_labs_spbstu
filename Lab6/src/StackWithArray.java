public class StackWithArray {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackWithArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Стек переполнен. Невозможно добавить элемент " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Добавлен элемент " + value);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст. Невозможно удалить элемент.");
            return -1; // Можно выбрать другое значение по умолчанию
        } else {
            int value = stackArray[top--];
            System.out.println("Удален элемент " + value);
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Стек пуст. Невозможно просмотреть верхний элемент.");
            return -1; // Можно выбрать другое значение по умолчанию
        } else {
            int value = stackArray[top];
            System.out.println("Верхний элемент: " + value);
            return value;
        }
    }

    public static void main(String[] args) {
        StackWithArray stack = new StackWithArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
