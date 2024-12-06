import java.util.*;
public class Transport {
    public static void main(String[] args) {
        // Коллекция автомобилей
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("A123BC", "Toyota", 20000, 150, 50000, true));
        cars.add(new Car("B456DE", "BMW", 30000, 200, 30000, false));
        cars.add(new Car("C789FG", "Mercedes", 50000, 250, 10000, true));

        // Коллекция самолетов
        List<Airplane> airplanes = new ArrayList<>();
        airplanes.add(new Airplane("P1234", "Boeing", 500000, 80000, 12000));
        airplanes.add(new Airplane("P5678", "Airbus", 600000, 85000, 13000));
        airplanes.add(new Airplane("P9101", "Cessna", 200000, 20000, 6000));

        // Найти стоимость и пробег заданного автомобиля
        String searchCarNumber = "B456DE";
        for (Car car : cars) {
            if (car.getNumber().equals(searchCarNumber)) {
                System.out.println("Стоимость: " + car.getCost() + ", Пробег: " + car.getMileage());
                break;
            }
        }

        // Подсчет налога с регистрации всех машин (5% стоимости)
        double carTax = 0;
        for (Car car : cars) {
            carTax += car.getCost() * 0.05;
        }
        System.out.println("Налог с регистрации всех машин: " + carTax);

        // Проверка, прошел ли техосмотр владелец самой дорогой машины
        Car mostExpensiveCar = cars.get(0);
        for (Car car : cars) {
            if (car.getCost() > mostExpensiveCar.getCost()) {
                mostExpensiveCar = car;
            }
        }
        System.out.println("Техосмотр пройден для самой дорогой машины: " + mostExpensiveCar.isTechInspectionPassed());

        // Найти мощность и максимальную высоту полета заданного самолета
        String searchAirplaneNumber = "P5678";
        for (Airplane airplane : airplanes) {
            if (airplane.getNumber().equals(searchAirplaneNumber)) {
                System.out.println("Мощность: " + airplane.getPower() + ", Макс. высота полета: " + airplane.getMaxFlightHeight());
                break;
            }
        }

        // Подсчет налога с регистрации всех самолетов (3% стоимости)
        double airplaneTax = 0;
        for (Airplane airplane : airplanes) {
            airplaneTax += airplane.getCost() * 0.03;
        }
        System.out.println("Налог с регистрации всех самолетов: " + airplaneTax);

        // Определить мощность, стоимость и марку самого дорогого самолета
        Airplane mostExpensiveAirplane = airplanes.get(0);
        for (Airplane airplane : airplanes) {
            if (airplane.getCost() > mostExpensiveAirplane.getCost()) {
                mostExpensiveAirplane = airplane;
            }
        }
        System.out.println("Самый дорогой самолет: " + mostExpensiveAirplane.getBrand() +
                ", Стоимость: " + mostExpensiveAirplane.getCost() +
                ", Мощность: " + mostExpensiveAirplane.getPower());

        // Получение полной информации обо всех автомобилях и самолетах
        System.out.println("\nИнформация обо всех автомобилях:");
        for (Car car : cars) {
            System.out.println(car.info());
        }

        System.out.println("\nИнформация обо всех самолетах:");
        for (Airplane airplane : airplanes) {
            System.out.println(airplane.info());
        }
    }
}