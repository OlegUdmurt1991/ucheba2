package Path3;
//Игра в угадывание букв часть 2
public class Gues2 {
    public static void main(String[]args)
        throws java.io.IOException{
        char ch,anser='S';
        System.out.println("Задуманна буква из диапозона A-Z.");
        System.out.print("Попытайтесь ее угадать:");

        ch = (char)System.in.read(); //Получить символ с клавиатуры

        if(ch == anser) System.out.println("** Правильно! **");
        else System.out.println("Извините, вы не угадали.");
    }
}
