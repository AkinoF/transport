// Определение класса Автомобиль
public class Car extends Trans {
    private double power;           // Мощность
    private double mileage;         // Пробег
    private boolean techInspection;  // Пройден ли техосмотр

    public Car(String number, String brand, double cost, double power, double mileage, boolean techInspection) {
        super(number, brand, cost);
        this.power = power;
        this.mileage = mileage;
        this.techInspection = techInspection;
    }

    public double getPower() {
        return power;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isTechInspectionPassed() {
        return techInspection;
    }

    @Override
    public String info() {
        return "Автомобиль: " + brand + ", Номер: " + number + ", Стоимость: " + cost +
                ", Мощность: " + power + ", Пробег: " + mileage + ", Техосмотр пройден: " + (techInspection ? "Да" : "Нет");
    }
}