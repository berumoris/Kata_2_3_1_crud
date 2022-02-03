package service;

import dao.CarDaoImp;
import model.Car;
import java.util.List;

public class CarServiceImp implements CarService{
    CarDaoImp carDao = new CarDaoImp();

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getSeveralCars(int amount) {
        return carDao.getSeveralCars(amount);
    }
}
