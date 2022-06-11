public class Village {
    private Locality.Characteristic characteristic;


    public Locality.Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Locality.Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public String toString() {
        return "Информация о городе: " + characteristic;
    }

    static class Characteristic {
        private String name;
        private int square;
        private int population;
        private String supervisor;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSquare() {
            return square;
        }

        public void setSquare(int square) {
            this.square = square;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public String getSupervisor() {
            return supervisor;
        }

        public void setSupervisor(String supervisor) {
            this.supervisor = supervisor;
        }

        @Override
        public String toString() {
            return "Название села: " + name + "\n" +
                    "Площадь села: " + square + " (км^2)\n" +
                    "Население села: " + population + " (человек)\n" +
                    "Руководитель села: " + supervisor;
        }
    }
}