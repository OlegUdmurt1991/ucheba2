package Path3;
// Применение запятых в операторе цикла for
public class Comma {
    public static void main(String[]args){
        int i, j ;

        for (i=0, j=10; i<j; i++, j--) //Для управления этим циклом используются две переменные
            System.out.println("i и j:"+i+" "+j);
    }

}
