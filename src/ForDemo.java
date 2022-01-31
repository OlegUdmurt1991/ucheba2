/*
Демонстрация применения цикла for.
 */
class ForDemo {
    public static void main (String [] args){
        int count;
        for(count=0; count<5;count++) //Этот цикл выполняет пять операций
            System.out.println("Значение счетчика:" +count);
        System.out.println("Готово!");
    }
}