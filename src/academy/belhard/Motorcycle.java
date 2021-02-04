package academy.belhard;

    public class Motorcycle extends Vehicle implements Costable{
        private int maxSpeed;

        protected Motorcycle(int wheelCount, int maxSpeed, int price) {
            super(wheelCount, price);
            this.maxSpeed = maxSpeed;
        }

        protected void printInfo() {
            System.out.println("Транспортное средство - Мотоцикл: " + "\n" + "Количество колес: " + wheelCount + "\n" + "Максимальная скорость: " + maxSpeed + "км/ч");
        }

        @Override
        public int price() {
            return price;
        }
    }
