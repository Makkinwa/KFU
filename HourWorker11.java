public class HourWorker extends Worker {
    private int hours;
    private int salary;
    @Override
    public int getPayment() {
        return hours * salary;
    }
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
