import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Поехали!");
        Scanner sc = new Scanner(System.in);
        Runner[] arr = new Runner[3];
        for(int i = 0;i<arr.length;i++){
            System.out.println("name:");
            arr[i].setName(sc.nextLine());
            System.out.println("lastname:");
            arr[i].setLastName(sc.nextLine());
            System.out.println("date:");
            arr[i].setDate(LocalDate.parse((sc.nextLine())));
            System.out.println("sex:");
            arr[i].setSex(sc.nextLine().charAt(0));
        }
    }
}
