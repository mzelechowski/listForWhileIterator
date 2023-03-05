import java.util.ArrayList;
import java.util.Iterator;

class Car{
    private String name;
    private int yearProduction;
    private String manufacturer;

    public Car() {
    }

    public Car(String name, int yearProduction, String manufacturer) {
        this.name = name;
        this.yearProduction = yearProduction;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearProduction=" + yearProduction +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
    ArrayList<Car> cars = new ArrayList<>();
    cars.add(new Car("500", 1980, "Fiat"));
    cars.add(new Car("i30", 2020, "Hyudnai"));
    cars.add(new Car("Fabia", 1999, "Skoda"));
    cars.add(new Car("Civic", 2005, "Honda"));

        System.out.println("Petla FOR");
        for (int i=0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(car);
        }
        System.out.println("\nPetla FOREACH\n");
        for ( Car c:cars) {
            System.out.println(c);
        }

        System.out.println("\nPetla WHILE\n");

        Iterator iterator = cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
