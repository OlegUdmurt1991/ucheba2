package Path3;
//Игра в угадывание букв, четвертая версия
public class Guess4 {
    public static void main(String[]args)
        throws java.io.IOException{

        char ch, ignore, answer = 'S';

        do{
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.print("Попытайтесь ее угадать: ");

            //Получить символ с клавиатуры
           ch = (char) System.in.read();
           //Отбросить все остальные символы во входном буфере
            do {
                ignore = (char) System.in.read();
            }while(ignore != '\n');
            if(ch == answer) System.out.println(("!Правильно!!!"));
            else {
                System.out.print(" ...... Извините, нужная буква находится");
                if (ch < answer)
                    System.out.println("Ближе к концу алфавита");
                else System.out.println("Ближе к началу алфавита");
                System.out.println("Повторите попытку!\n");
            }

        }while (answer != ch);

    }
}
