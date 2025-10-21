public class Man {

    int dnaCode;

    public static void main(String[] args) {

        Man man1 = new Man();
        man1.dnaCode = 111222333;

        Man man2 = new Man();
        man2.dnaCode = 111222333;

        System.out.println(man1 == man2);
    }
}