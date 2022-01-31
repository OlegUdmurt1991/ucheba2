package Path3;
//Игра в угадывание букв
public class Guess {
    public static void main(String []args)
        throws java.io.IOException{
        char ch,answer = 'S';

        System.out.println("Задуманна буква из диапозона A-Z. ");
        System.out.print("Попытайтесь её угадать: ");
        ch = (char) System.in.read(); //Получить символ с клавиатуры
        if(ch == answer) System.out.println("**Правильно");
    }
}
