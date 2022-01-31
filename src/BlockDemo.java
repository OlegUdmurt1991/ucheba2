/*Демонстрация применения блоков кода.*/
class BlockDemo {
    public static void main (String[] args){
     double i,j,d;
     i=5;
     j=10;
     //Телом этого оператора if является целый блок кода.
        if (i!=0){
            System.out.println("i не равно нулю");//являеется телом оператора if
            d=j/i;//являеется телом оператора if
            System.out.print("j/i равно"+d);//являеется телом оператора if
        }
    }
}
