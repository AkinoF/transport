// Определение класса Самолет
public class Airplane extends Trans {
    private double power;              // Мощность
    private double maxFlightHeight;    // Максимальная высота полета

    public Airplane(String number, String brand, double cost, double power, double maxFlightHeight) {
        super(number, brand, cost);
        this.power = power;
        this.maxFlightHeight = maxFlightHeight;
    }

    public double getPower() {
        return power;
    }

    public double getMaxFlightHeight() {
        return maxFlightHeight;
    }

    @Override
    public String info() {
        return "Самолет: " + brand + ", Номер: " + number + ", Стоимость: " + cost +
                ", Мощность: " + power + ", Макс. высота полета: " + maxFlightHeight;
    }
}