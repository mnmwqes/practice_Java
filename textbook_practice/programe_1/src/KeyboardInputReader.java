/* Задание. Напишите программу, которая читает символы с клавиатуры до тех пор, пока не будет получена точка.
Программа должна подсчитывать количество пробелов и в конце сообщать итог.
 */

public class KeyboardInputReader {
    public static void main(String[] args)
    throws java.io.IOException {
        int ws = 0;
        int ch;
        System.out.print("Нажмите любую клавишу (или . для завершения цикла):\n");
        while (true) {
            ch = System.in.read();
            char c = (char) ch;

            if(c == '.') break;

            if(c == ' ') ws++;
        }
        System.out.println("Кол-во нажатых пробелов: " + ws);
    }
}