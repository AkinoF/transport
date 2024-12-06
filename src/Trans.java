// Определение абстрактного класса Транспорт
public abstract class Trans {
    protected String number; // Номер
    protected String brand;   // Марка
    protected double cost;    // Стоимость

    public Trans(String number, String brand, double cost) {
        this.number = number;
        this.brand = brand;
        this.cost = cost;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public double getCost() {
        return cost;
    }

    public abstract String info();
}