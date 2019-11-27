import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    private String name;
    private String LastName;
    private char sex;
    private LocalDate date;

    public Runner(String name, String lastName, LocalDate date, char sex) {
        this.name = name;
        this.LastName = lastName;
        this.date = date;
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex=='m' | sex=='f'){
            this.sex = sex;
        }
        else {
            System.out.println("This name is not allowed");
        }
    }

    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", date='" + date + '\'' +
                ", sex=" + sex +
                '}';
    }

    public int getYears(){
        return LocalDate.now().getYear() - date.getYear();
    }

    public static void main(String args[]) {
        System.out.println("Поехали!");
        Scanner sc = new Scanner(System.in);
        Runner[] arr = new Runner[3];
        for(int i = 0;i<arr.length;i++){
            System.out.println("name:");
            arr[i].name = sc.nextLine();
            System.out.println("lastname:");
            
            System.out.println("date:");
            System.out.println("sex:");
        }
    }
}
