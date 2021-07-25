package web.service;

import org.springframework.stereotype.Component;
import web.Dao.CarDao;
import web.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Component
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
