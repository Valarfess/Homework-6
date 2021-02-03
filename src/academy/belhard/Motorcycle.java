package academy.belhard;

    public class Motorcycle extends Vehicle implements Costable{
        private int maxSpeed;
        private int b;

        public int getB() {
            return b;
        }

        public int setB(int b) {
            this.b = b;
            return b;
        }

        protected Motorcycle(int wheelCount, int maxSpeed) {
            super(wheelCount);
            this.maxSpeed = maxSpeed;
        }

        protected void printInfo() {
            System.out.println("Транспортное средство - Мотоцикл: " + "\n" + "Количество колес: " + wheelCount + "\n" + "Максимальная скорость: " + maxSpeed + "км/ч");
        }

        @Override
        public int price() {
            System.out.println(setB(2000));
            return getB();

        }
    }
