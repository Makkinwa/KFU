public class Worker extends Runner {
    private int salary;
    private int bonus;

    public int getPayment(){
        return salary + salary * bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTaxes(){
        return (int)(getSalary() * 0.13);
    }

    public int finalSalary(){
        return getPayment()-getTaxes();
    }

}
