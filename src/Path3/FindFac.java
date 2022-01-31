package Path3;
/*Использовать вложенные циклы для нахождени я
делителей чисел о т 2 до 100*/
public class FindFac {
    public static void main(String[]args){
        for ( int i =2; i <= 100; i++) {
            System.out.println("Делители " + i + ": ");
            for ( int j =2; j < i; j++){
            System.out.println(j + "vb");

        }
    }
}}

//if((i%j) == 0) System.out.print(j + " ");