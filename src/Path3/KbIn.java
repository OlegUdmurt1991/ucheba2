package Path3;
//Чтение символа с клавиатуры

public class KbIn {
    public static void main(String[]args)
        throws java.io.IOException{
        char ch;
        System.out.print("Нажмите нужную клавишу, а затем клавишу ENTER:");
        ch=(char)System.in.read();//Получить символ(ввод символа с клавиатуры)
        System.out.println("Вы нажали клавишу "+ch);

    }}
