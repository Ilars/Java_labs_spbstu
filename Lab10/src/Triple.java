public class Triple<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public T min() {
        if (first instanceof Comparable) {
            if (first.compareTo(second) <= 0 && first.compareTo(third) <= 0) {
                return first;
            } else if (second.compareTo(first) <= 0 && second.compareTo(third) <= 0) {
                return second;
            } else {
                return third;
            }
        } else{
            throw new RuntimeException("Impossible to perform min");
        }
    }

    public T max() {
        if (first instanceof Comparable) {
            if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
                return first;
            } else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
                return second;
            } else {
                return third;
            }
        } else{
            throw new RuntimeException("Impossible to perform max");
        }
    }

    public T mean() {
        if (first instanceof Comparable) {
            if (first.compareTo(second) == 0) {
                return third;
            } else if (first.compareTo(third) == 0) {
                return second;
            } else {
                return first;
            }
        } else{
            throw new RuntimeException("Impossible to perform mean");
        }
    }

    public static void main(String[] args) {
        Triple<Integer> triple = new Triple<>(3, 1, 2);

        System.out.println("Минимальное значение: " + triple.min());
        System.out.println("Максимальное значение: " + triple.max());

        try {
            System.out.println("Среднее значение: " + triple.mean());
        } catch (UnsupportedOperationException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
