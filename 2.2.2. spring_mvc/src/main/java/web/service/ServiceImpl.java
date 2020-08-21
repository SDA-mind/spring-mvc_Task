package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceImpl implements Service {
    public ServiceImpl() {
    }

    @Override
    public List<Car> getCarList() {
        ArrayList<Car> arrayList = new ArrayList<>();
        arrayList.add(new Car("Ford",2202,"V6"));
        arrayList.add(new Car("Opel",1999,"V4"));
        arrayList.add(new Car("BMW",5,"V8"));
        arrayList.add(new Car("Mercedes",40,"V8"));
        arrayList.add(new Car("Shkoda",10,"V3"));
        arrayList.add(new Car("Lada",2205,"V4"));
        arrayList.add(new Car("Lotus",3000,"V3"));
        return arrayList;
    }
}
