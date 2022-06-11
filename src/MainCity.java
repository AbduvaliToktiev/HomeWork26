import java.util.Scanner;

public class MainCity {
    public static void main(String[] args) {
        Locality bishkek = new Locality();
        Locality.Area area1 = new Locality.Area();
        Locality.Area area2 = new Locality.Area();
        Locality.Area[] areas = new Locality.Area[2];
        area1.setName("Свердловский");
        areas[0] = area1;
        area2.setName("Октябрьский");
        areas[1] = area2;
        bishkek.setArea(areas);

        Locality.Characteristic characteristic = new Locality.Characteristic();
        characteristic.setName("Бишкек");
        characteristic.setSquare(127);
        characteristic.setPopulation(1088900);
        characteristic.setSupervisor("Эмилбек");
        bishkek.setCharacteristic(characteristic);
        System.out.println(bishkek);

        System.out.println();

        Locality moscow = new Locality();
        Locality.Area area3 = new Locality.Area();
        Locality.Area area4 = new Locality.Area();
        Locality.Area[] areas2 = new Locality.Area[2];
        area3.setName("Петербургский");
        areas2[0] = area3;
        area4.setName("Чеченский");
        areas2[1] = area4;
        moscow.setArea(areas2);

        Locality.Characteristic characteristic2 = new Locality.Characteristic();
        characteristic2.setName("Москва");
        characteristic2.setSquare(2511);
        characteristic2.setPopulation(12636312);
        characteristic2.setSupervisor("Сергей");
        moscow.setCharacteristic(characteristic2);
        System.out.println(moscow);

        System.out.println();

        Locality nurSultan = new Locality();
        Locality.Area area5 = new Locality.Area();
        Locality.Area area6 = new Locality.Area();
        Locality.Area[] areas3 = new Locality.Area[2];
        area5.setName("Кордайский");
        areas3[0] = area5;
        area6.setName("Алматинский");
        areas3[1] = area6;
        nurSultan.setArea(areas3);

        Locality.Characteristic characteristic3 = new Locality.Characteristic();
        characteristic3.setName("Нур-Султан");
        characteristic3.setSquare(722);
        characteristic3.setPopulation(1228800);
        characteristic3.setSupervisor("Алтай");
        nurSultan.setCharacteristic(characteristic3);
        System.out.println(nurSultan);

        System.out.println();

        Village.Characteristic village1 = new Village.Characteristic();
        village1.setName("Комсомольское");
        village1.setSquare(8);
        village1.setPopulation(20000);
        village1.setSupervisor("Азамат");
        System.out.println(village1);
        System.out.println();
        Village.Characteristic village2 = new Village.Characteristic();
        village2.setName("Кара-Балта");
        village2.setSquare(5);
        village2.setPopulation(15000);
        village2.setSupervisor("Нурик");
        System.out.println(village2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя руководителя: ");
        String choice = sc.nextLine();
        switch (choice) {
            case "Эмилбек":
                System.out.println(bishkek);
                break;
            case "Сергей":
                System.out.println(moscow);
                break;
            case "Алтай":
                System.out.println(nurSultan);
                break;
            case "Азамат":
                System.out.println(village1);
                break;
            case "Нурик":
                System.out.println(village2);
                break;
            default:
        }
    }
}
