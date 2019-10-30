import java.util.Scanner;

public class Runner {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(task6(4, 3));
    }

    private static void task1(int n){
        if(n>0){
            task1(n-1);
            System.out.println(n);
        }
    }

    private static void task2(Scanner sc){
        int tmp = sc.nextInt();
        if(tmp!=0){
            task2(sc);
            System.out.println(tmp);
        }

    }

    private static void task5(int a, int b){
        if(b!=0){
            a++;
            b--;
            task5(a,b);
        }
        else System.out.println(a +" " + b);
    }

    private static int task6(int a, int b){
        if(b==0){
            return 0;
        }
        return a + task6(a, --b);
    }

    private static void task7(){
        
    }

}
