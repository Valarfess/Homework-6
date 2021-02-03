package academy.belhard;

    public class Car extends Vehicle implements Costable{
        private int doorsCount;
        private int a;

        public int getA() {
            return a;
        }

        public int setA(int a) {
            this.a = a;
            return a;
        }

        protected Car(int wheelCount, int doorsCount) {
            super(wheelCount);
            this.doorsCount = doorsCount;
        }

        protected void printInfo() {
            System.out.println("Транспортное средство - Машина: " + "\n" + "Количество колес: " + wheelCount + "\n" + "Количество дверей: " + doorsCount);
        }

        @Override
        public int price() {
            System.out.println(setA(6000));
            return getA();
        }
    }


