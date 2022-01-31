package Path3;
// Демонстрация использования оператора switch
public class SwitchDemo {
    public static void main(String []args){
        int i;

        for(i=0; i<10; i++)
        switch (i){
            case 0:
                System.out.println(" i равно нулю");
                break;
            case 1:
                System.out.println("i рано еденице");
                break;
            case 2:
                System.out.println("i рано двум");
                break;
            case 3:
                System.out.println("i рано трем");
                break;
            case 4:
                System.out.println("i рано четырем");
                break;
            default:
                System.out.println(" i равно или больше пяти");

        }
    }
}
