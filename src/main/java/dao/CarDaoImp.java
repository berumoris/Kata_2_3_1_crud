package dao;

import model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao{

    private List<Car> getFiveCars() {
        List<Car> list = new ArrayList<>();
        Car car1 = new Car("Mazda", 921, 5000);
        Car car2 = new Car("Lada", 14, 1800);
        Car car3 = new Car("Moskvich", 412, 50000);
        Car car4 = new Car("Porshe", 911, 7000);
        Car car5 = new Car("Renaut", 21, 3000);

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        return list;
    }

    List<Car> carList = getFiveCars();

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getSeveralCars(int amount) {
        List<Car> carSubList = carList.subList(0, amount);
        return carSubList;
    }
}
