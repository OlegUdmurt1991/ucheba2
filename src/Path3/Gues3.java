package Path3;
//Игра в угадывание букв третья версия
public class Gues3 {
    public static void main(String[]args)
        throws java.io.IOException{

        char ch,answer='S';
        System.out.println("Задуманна буква от A-Z.");
        System.out.print("Попытайтесь её угадать:");

        ch=(char) System.in.read();//Получить символ с клавитуры
        if (ch == answer) System.out.println("**YOU WINNER**");
        else {
            System.out.println("...Извините, нужная буква находится");

            if (ch<answer)
                System.out.println("Букква ближе к концу алфавита");

            else System.out.println("Букква ближе к началу алфавита");
        }
    }
}
