/*
Демонстрация различий между типами int и douЫe.
Присвойте файлу с исходным кодом имя ExampleЗ.java.
*/
class Example3 {
    public static void main(String[] args){
        int var;//объявить целочисленную переменную
        double x;//объявить переменную с плавающей точкой
        var=10;//присвоить переменной var значение 10
        x=10.0;//присвоить переменной x значение 10.0
        System.out.println("Haчaльнoe значение переменной var: " + var);
        System.out.println("Haчaльнoe значение переменной х: " + x);
        System. out. println (); //вывести пустую строку Вывод пустой строки
// Разделить значения обеих переменных на 4
        var=var / 4;
        x = x / 4;
        System.out.println("Знaчeниe переменной var после деления: " +var);
        System.out.println("Знaчeниe переменной х после деления: " + x);
    }
}
