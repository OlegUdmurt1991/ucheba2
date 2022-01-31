package Path3;
//Игра в угадывание букв, четвертая версия
public class Tema {
    public static void main (String args[])
            throws java.io.IOException {
        char ch, answer = 'S';

        do {
            System.out.println("Загадана буква из диапазона A-Z");
            System.out.println("Попытайтесь ее угадать: ");

            ch = (char) System.in.read();
            if (ch == answer)
                System.out.println("Вы угадали!");
            else {
                System.out.print("Нужная буква находится ");
                if (ch < answer)
                    System.out.println("ближе к концу алфавита");
                else
                    System.out.println("ближе к началу алфавита");
            }
        } while (ch != answer);
    }
}
