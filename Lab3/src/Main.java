public class Main {
    public static void main(String[] args) {
        // Логические операции && (и), || (или), ! (не)
        boolean a = true;
        boolean b = false;

        boolean andResult = a && b; // Логическое "и"
        boolean orResult = a || b;  // Логическое "или"
        boolean notA = !a;          // Логическое "не"

        System.out.println("a && b: " + andResult);
        System.out.println("a || b: " + orResult);
        System.out.println("!a: " + notA);

        // Тернарная операция (условный оператор) x < y ? x : y
        int x = 5;
        int y = 10;
        int min = x < y ? x : y;
        System.out.println("Минимальное значение: " + min);

        // Поразрядные логические операции & (и), | (или), ^ (исключающее или), ~ (инверсия)
        int num1 = 5;  // 0101
        int num2 = 3;  // 0011

        int andResultBitwise = num1 & num2;  // Поразрядное "и"
        int orResultBitwise = num1 | num2;   // Поразрядное "или"
        int xorResultBitwise = num1 ^ num2;  // Поразрядное "исключающее или"
        int notResultBitwise = ~num1;        // Поразрядная инверсия

        System.out.println("num1 & num2: " + andResultBitwise);
        System.out.println("num1 | num2: " + orResultBitwise);
        System.out.println("num1 ^ num2: " + xorResultBitwise);
        System.out.println("~num1: " + notResultBitwise);

        // Операции сдвига >> (сдвиг вправо), << (сдвиг влево), >>> (сдвиг вправо с заполнением нулями)
        int num3 = 8;  // 1000

        int rightShift = num3 >> 1;    // Сдвиг вправо на 1 позицию: 0100 (4)
        int leftShift = num3 << 1;     // Сдвиг влево на 1 позицию: 10000 (16)
        int zeroFillRightShift = num3 >>> 1;  // Сдвиг вправо с заполнением нулями: 0100 (4)

        System.out.println("num3 >> 1: " + rightShift);
        System.out.println("num3 << 1: " + leftShift);
        System.out.println("num3 >>> 1: " + zeroFillRightShift);
    }
}