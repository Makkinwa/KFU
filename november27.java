import java.time.LocalDate;
public class Runner {
    private String name;
    private String LastName;
    private char sex;
    private LocalDate date;

    public Runner() {
    }

    public Runner(String name, String lastName, LocalDate date, char sex) {
        this.name = name;
        this.LastName = lastName;
        this.date = date;
        this.sex = sex;
    }

    public LocalDate getDate() {
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


}

