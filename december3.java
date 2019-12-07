public class Boot extends Vehicle {
    @Override
    void in() {

    }


    @Override
    void start() {
        if(this.speed==0){
            this.speed=5;
            System.out.println("Поплыли");
        }
    }

    @Override
    void stop() {
        if(this.speed>0){
            this.speed=0;
            System.out.println("Суши весла. Стоим.");
        }
    }

    @Override
    String out() {
        return "Boot{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", maxAcceleration=" + maxAcceleration +
                '}';
    }


}



abstract public class Vehicle {
    protected String name;
    protected int speed;
    protected int maxSpeed=120;
    protected int maxAcceleration=10;
    public Vehicle(){

    }

    public Vehicle(String name, int speed, int maxSpeed, int maxAcceleration) {
        this.name = name;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.maxAcceleration = maxAcceleration;
    }

    public void faster(int speed){
        if(this.speed+speed<maxSpeed){
            this.speed+=speed;
            System.out.println("Еще быстрее");
        }
        else {
            System.out.println("Быстрее нельзя");
        }
    }

    public void slower(int speed){
        if(this.speed-speed>0){
            this.speed-=speed;
            System.out.println("Тормозим");
        }
        else {
            System.out.println("Уже и так стоим");
        }
    }

    abstract void start();
    abstract void stop();
    abstract String out();
    abstract void in();

}



public class Horse extends Vehicle{
    private String mast;
    private int age;
    @Override
    void in() {

    }

    @Override
    void stop() {

    }

    @Override
    String out() {
        return null;
    }

    @Override
    void start() {
        if(this.speed==0){
            this.speed=5;
            System.out.println("igogo");
        }
    }

}
