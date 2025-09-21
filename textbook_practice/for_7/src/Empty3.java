public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        // Просуммировать числа от 1 до 5.
        for(i = 1; i <= 5; sum += i++); // "sum += i++", а точнее:    "sum = sum + i;     i++"
        System.out.println("Сумма равна " + sum);
    }
}
