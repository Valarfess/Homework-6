package academy.belhard;

    public class Car extends Vehicle implements Costable{
        private int doorsCount;

        protected Car(int wheelCount, int doorsCount) {
            super(wheelCount);
            this.doorsCount = doorsCount;
        }

        protected void printInfo() {
            System.out.println("Транспортное средство - Машина: " + "\n" + "Количество колес: " + wheelCount + "\n" + "Количество дверей: " + doorsCount);
        }

        @Override
        public void price() {
            System.out.println("Цена: $6000");

        }
    }


