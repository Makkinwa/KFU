import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        task5();
    }
    
    private static void task2() {
		int n=4;
		double sum = 1;
		while (n > 0) { 
			int tmp = n;
			double low = 0;
			while(tmp>0) {
				low+=Math.sin(Math.toRadians(n));
				--tmp;
			}
			sum+=1/low;
			
		--n;
		}
		System.out.println(sum);
	}

    private static void task3(){
        double n = 123;
        if (n>13){
            System.out.println("n>13");
            System.out.println(10-((Math.pow(-1, n)/(n*n + 1))));
        }
        else {
            int sum=0;
            while(n>0){
                sum += Math.pow(-1, n)/(Math.pow(Math.sin(5*n), 2));
                n--;
            }
            System.out.println("n<=13");
            System.out.println(sum);
        }
    }

    private static void task4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи количество чисел");
        int n = sc.nextInt();
        System.out.println("Вводи числа");

        int t1=0;
        int t2=0;
        int tmp=0;
        int zei=0;
        while(n>0){
            tmp=sc.nextInt();
            zei=tmp;
            if(tmp%7==0){
                t2++;
            }
            while(zei>100){
                zei/=10;
            }
            if(zei==100) {
                t1 += tmp;
            }
            zei = tmp;
            while(zei>11){
                zei/=10;
            }
            if(zei==11){
                System.out.println("Число начинается на 11, его порядковое число - " + n);
            }
            n--;
        }
        System.out.println("Сумма чисел, начинающийхся на 100: " + t1);
        System.out.println("Количество чисел, делящихся на 7 без остатка: " + t2);
    }









    private static String handleFace(String currentFace, String tmp){
        if (currentFace.equals("Север") & tmp.equals("0")) return "Запад";
        if (currentFace.equals("Север") & tmp.equals("1")) return "Восток";
        if (currentFace.equals("Восток") & tmp.equals("0")) return "Север";
        if (currentFace.equals("Восток") & tmp.equals("1")) return "Юг";
        if (currentFace.equals("Юг") & tmp.equals("0")) return "Восток";
        if (currentFace.equals("Юг") & tmp.equals("1")) return "Запад";
        if (currentFace.equals("Запад") & tmp.equals("0")) return "Юг";
        if (currentFace.equals("Запад") & tmp.equals("1")) return "Север";
        return "None";

    }

    private static void task5(){
        Scanner sc = new Scanner(System.in);
        String n="Север", s="Юг", w="Запад", e="Восток";
        String CurrentFace = n;
        int x=0;
        int y=0;
        String tmp;
        System.out.println("Начало работы. Вводите комманды!");
        System.out.println("x = " + x + " y = " + y);
        System.out.println(CurrentFace);
        while(!(tmp=sc.next()).equals("Stop")){
            if(tmp.equals("Status")){
                System.out.println("x = " + x + " y = " + y);
            }
            switch (tmp){
                case "0":
                    CurrentFace = handleFace(CurrentFace, tmp);
                    System.out.println(CurrentFace);
                    System.out.println("x = " + x + " y = " + y);
                    break;
                case "1":
                    CurrentFace = handleFace(CurrentFace, tmp);
                    System.out.println(CurrentFace);
                    System.out.println("x = " + x + " y = " + y);
                    break;

                case "2":
                    if (CurrentFace.equals(n)){
                        y++;
                    }
                    if (CurrentFace.equals(w)){
                        x--;
                    }
                    if (CurrentFace.equals(s)){
                        y--;
                    }
                    if (CurrentFace.equals(e)){
                        x++;
                    }
                    System.out.println(CurrentFace);
                    System.out.println("x = " + x + " y = " + y);
            }
        }
    }


}
