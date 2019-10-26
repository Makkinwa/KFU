

import java.util.Scanner;

public class Runner {

    public static void main(String args[]){
        System.out.println("Start");
        task2c(2.0, 3.1, 4.1, 12.3, 12.4, 1.1);
        System.out.println(task3b(2.2, 2.4, 7.1));
        System.out.println(task3c(3.1, 2.1, 13.1, 4.1));
        task4d(2, 3);
    }

    private static void main1(){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(mul(5,sum(dif(a, 2), b)),mul(1000, a)));
    }

    private static int sum(int a, int b){
        return  a+b;
    }
    private static int dif(int a, int b){
        return a-b;
    }
    private static int mul(int a, int b){
        return a*b;
    }


    private static double task2(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    private static void task2b(double x1, double y1, double x2, double y2){
        System.out.println("Первая точка");
        System.out.println(Math.sqrt((x1*x1)+(y1*y1)));
        System.out.println("Вторая точка");
        System.out.println(Math.sqrt((x2*x2)+(y2*y2)));

    }

    private static double task2c(double x1, double y1, double x2, double y2, double x3, double y3){
        double sum = 0;
        double a = task2(x1,y1,x2,y2);
        double b = task2(x2,y2,x3,y3);
        double c = task2(x1,y1,x3,y3);
        sum = a+b+c;
        System.out.println(sum);
        double p = sum/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь: " + area);
        return area;
    }

    private static double task3(double x, double y){
        if (x>=y) return x;
        else return y;
    }


    private static double task3b(double x, double y, double z){
        return task3(task3(x, y), z);
    }
    private static double task3c(double x1, double y1, double x2, double y2){
        return task3(task2(0, 0, x1, y1), task2(0, 0, x2, y2));
    }

    private static void task4(){
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
    }
    private static void task4a(int n){
        for (int i=0; i<n; i++){
            System.out.println();
            for (int j=0; j<n; j++){
                System.out.print('*');
            }
        }
    }

    private static void task4b(int n, int m){
        for (int i=0; i<n; i++){
            System.out.println();
            for(int k=0; k<m; k++){
                System.out.print(' ');
            }
            for (int j=0; j<n; j++){
                System.out.print('*');
            }
        }
    }

    private static void task4d(int n, int m) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.println();
                for (int k = 0; k < m; k++) {
                    System.out.print('*');
                }
            }
        }
    }
    
    private static int factorial(int n){
        if(n>0){
            return n * factorial(n-1);
        }
        return 1;
    }

    private static int task5(int m, int n){
        return (factorial(n)*factorial(m))/factorial(n+m);
    }


    private static double task6(double x, int m){
        double sum=1;
        while(m > 0){
            sum*=x;
            --m;
        }
        System.out.println(sum);
        return sum;
    }

    private static double f (double x){
        if(x<3.0 | ((x >= 3.0) & (x < 2*Math.PI))){
            if (x<3.0){
                return 7/3;
            }
            else {
                return x*x-3;
            }
        }
        else {
            return ((1+x*x*x)/(2*x));
        }
    }
    private static double main7(double a, double b){
        return 12.5 + f(2)-f(4)*f(10)+ f(a)-f(b)+f(a*b);
    }
    
    private static int task7b(int x){
        try{
            if (x <= 2 | ((x>2) & (x<= 5))){
                if (x<=2){
                    return (2*x+(1/(1-x)))/(3*x);
                }
                else return 72/7;
            }
            else return (-3-x);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("False");
            System.exit(0);
        }
        return -1;
    }

}
