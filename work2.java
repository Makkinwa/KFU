import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Runner {

  public static void main(String args[]){
    System.out.println("Start");
    task9();
  }

  private static void task1() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введи свое число");
    int day = sc.nextInt();
    System.out.println("Введи номер дня недели");
    int weekday = sc.nextInt();
    if (day == 13 & (weekday == 2 | weekday == 5)){
        System.out.println("Be careful, my dude!");
        }
    if(day == 17 & weekday == 5){
      System.out.print("Stai attento, amigo!");
    }
  }

  private static void task2(int x, int y,int a,int b,int z,int c) {
    if ((x > a & y > b & z > c) | (x > b & y > a & z > c)) {
      System.out.println("Влезет");
    }
    else System.out.println("Не влезет");
  }
  private static void task4(){
        int x1=5;
        int y1=3;
        int x2=-7;
        int y2=2;
        int x3=6;
        int y3=12;
        double z1 = Math.sqrt((double)(x1*x1 + y1*y1));
        double z2 = Math.sqrt((double)(x2*x2 + y2*y2)) ;
        double z3= Math.sqrt((double)(x3*x3 + y3*y3));
        System.out.println("Первый элемент: " + z1);
        System.out.println("Второй элемент: " + z2);
        System.out.println("Третий элемент: " + z3);
        if (z1 < z2 & z1 < z3){
            System.out.println("Перввя точка ближе всего к центру");
        }
        if (z2 < z1 & z2 < z3){
            System.out.println("Вторая точка ближе всех к началу координат");
        }
        if(z3 < z1 & z3 < z2){
            System.out.println("Третья точка ближе всех к началу координат");
        }
    }
  private static void task5(){
        int x = 5;
        int y = 4;
        int z = 3;
        if (x+y<z | y+z<x | z+x<y ){
            System.out.println("Такой треугольник существовать не может");
        }
        else System.out.println("Такой треугольник может сущуствовать");
        
        if(x==y & x==z){
            System.out.println("Равносторонний треугольник");
        }
        else {
            if ( (x == y & x != z) | (z == x & z !=y) | (z == y & z != x) ){
                System.out.println("Треугольник равнобедренный");
            }
            else {
                System.out.println("Треугольниак обычный");
            }
        }
    }
  private static void task7(){
        int a = 1;
        int b = 4;
        int c = 2;
        int x;
        int D = b*b - 4*a*c;
        if (D == 0){
            System.out.println("1 корень:");
            System.out.println((-b + Math.sqrt(D))/2*a);
        }
        if (D > 0){
            System.out.println("2 корня:");
            System.out.println((-b + Math.sqrt(D))/2*a);
            System.out.println((-b - Math.sqrt(D))/2*a);
        }
        if (D < 0){
            System.out.println("Нет действительных корней");
        }
        
    }  

  private static void task9(){
    Scanner sc = new Scanner(System.in);
    int days = sc.nextInt();
    int month = sc.nextInt();
    int year = sc.nextInt();
    LocalDate now = LocalDate.now();
    LocalDate born = LocalDate.of(year, month, days);
    System.out.println(Period.between(now, born).toString());
  }
}
