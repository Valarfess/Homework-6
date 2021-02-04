package academy.belhard;

public abstract class Vehicle{
    protected int wheelCount;
    protected int price;

    public Vehicle (int wheelCount, int price){
        this.wheelCount = wheelCount; this.price = price;
    }

    protected abstract void printInfo();
}
