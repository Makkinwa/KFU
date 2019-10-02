import java.util.Scanner;

public class Runner {

    public static void main(String args[]){
        System.out.println("Start");
        task1a();
    }

    private static void task1a(){
        int i = 0;
        while(i <= 100){
            System.out.println(i + "Градусов Цельсия," + (9*i/5 + 32) + " градусов Фаренгейта");
            i+=10;
        }
    }

    private static void task1b(){
        int i=0;
        do {
            System.out.println(i + "Градусов Цельсия," + (9*i/5 + 32) + " градусов Фаренгейта");
            i+=10;
        } while (i != 0);
    }

    private static void task1c(){
        for (float i =0; i <= 3.14*2; i += (3.14/6)){
            System.out.println(Math.cos(i));
        }
    }

    private static void task2(){
        Scanner sc = new Scanner(System.in);
        int counter=0;
        int sum=0;
        int max=-255236236;
        for (int i=0; i<7; i++){
            int tmp = sc.nextInt();
            if(i==0) max=tmp;
            if(tmp>max) max = tmp;
            if (tmp > 0){
1               counter++;
            }
            else{
                sum += tmp;
            }
        }
    }

    private static void task3(){
        String tmp;
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int evenNumbers = 0;
        do {
            counter++;
            tmp = sc.next();
            if(Integer.parseInt(tmp)%2 == 0){
                evenNumbers++;
            }

        } while (!tmp.equals("End") | !tmp.equals("Stop"));
        System.out.println("Количество чисел: " + counter + " Среди них четных: " + evenNumbers);
    }

    private static void task4a(){
        double n = 4.0;
        double sum = 0.0;
        while (n != 0) {
            sum = 1/(2*n);
        }
        System.out.println(sum);
    }

    private static void task4b() {

    }

    private static void task5(){
        int p = 14;
        int q = 812;
        if (p == q){
            System.out.println(p);
        }
        else {
            if (p>q){
                
            }
        }
    }
}
