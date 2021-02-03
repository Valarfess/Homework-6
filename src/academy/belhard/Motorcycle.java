package academy.belhard;

    public class Motorcycle extends Vehicle{
        private int maxSpeed;

        protected Motorcycle(int wheelCount, int maxSpeed) {
            super(wheelCount);
            this.maxSpeed = maxSpeed;
        }

        protected void printInfo() {
            System.out.println("Транспортное средство - Мотоцикл: " + "\n" + "Количество колес: " + wheelCount + "\n" + "Максимальная скорость: " + maxSpeed + "км/ч");
        }
    }
