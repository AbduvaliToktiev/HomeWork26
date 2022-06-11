import java.util.Arrays;

public class Locality {
    private Characteristic characteristic;
    private Area[] area;

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public Area[] getArea() {
        return area;
    }

    public void setArea(Area[] area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Информация о городе: " + characteristic + "\n" +
                "Названия районов в городе: " + Arrays.toString(area);
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
            return "Название города: " + name + "\n" +
                    "Площадь города: " + square + " (км^2)\n" +
                    "Население города: " + population + " (человек)\n" +
                    "Руководитель города: " + supervisor;
        }
    }

    static class Area {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Название района: " + name;
        }
    }
}
