import java.io.*;
import java.util.*;

public class Transport {
    public static void main(String[] args) {
        // Коллекция автомобилей и самолетов
        List<Car> cars = new ArrayList<>();
        List<Airplane> airplanes = new ArrayList<>();

        // Чтение автомобилей из файла
        readCarsFromFile("C:\\Project\\nikit2-2IS\\TransportFile\\RF\\cars.txt", cars);

        // Чтение самолетов из файла
        readAirplanesFromFile("C:\\Project\\nikit2-2IS\\TransportFile\\RF\\airplanes.txt", airplanes);

        // Получение информации обо всех автомобилях, которые не прошли техосмотр
        List<Car> carsNotPassedTechInspection = new ArrayList<>();
        for (Car car : cars) {
            if (!car.isTechInspectionPassed()) {
                carsNotPassedTechInspection.add(car);
            }
        }

        // Запись информации о непрошедших техосмотр автомобилях в файл
        writeCarsNotPassedTechInspectionToFile("cars_not_passed_tech_inspection.txt", carsNotPassedTechInspection);

        // Вывод общего количества прочитанных автомобилей и самолетов
        System.out.println("Количество автомобилей: " + cars.size());
        System.out.println("Количество самолетов: " + airplanes.size());
    }

    private static void readCarsFromFile(String filename, List<Car> cars) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String number = parts[0];
                String brand = parts[1];
                double cost = Double.parseDouble(parts[2]);
                double power = Double.parseDouble(parts[3]);
                double mileage = Double.parseDouble(parts[4]);
                boolean techInspection = Boolean.parseBoolean(parts[5]);
                cars.add(new Car(number, brand, cost, power, mileage, techInspection));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAirplanesFromFile(String filename, List<Airplane> airplanes) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String number = parts[0];
                String brand = parts[1];
                double cost = Double.parseDouble(parts[2]);
                double power = Double.parseDouble(parts[3]);
                double maxFlightHeight = Double.parseDouble(parts[4]);
                airplanes.add(new Airplane(number, brand, cost, power, maxFlightHeight));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeCarsNotPassedTechInspectionToFile(String filename, List<Car> cars) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Car car : cars) {
                bw.write(car.info());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}