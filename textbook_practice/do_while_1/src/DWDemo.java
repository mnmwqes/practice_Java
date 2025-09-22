public class DWDemo {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        do {
            System.out.print("Нажмите клавишу и затем Enter: ");
            ch = (char) System.in.read(); // получить символ
        } while(ch != 'q');
    }
}
