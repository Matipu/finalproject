package com.mechanicproject.controller;

import com.mechanicproject.entity.Car;
import com.mechanicproject.entity.Customer;
import com.mechanicproject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    //private ClientService clientService;

    private CarService carService;

    @Autowired
    public CustomerController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(value = "/fillbase", method = RequestMethod.POST)
    public void initializeDatabase(){
        List<Customer> Customers = new ArrayList<>();
        List<Car> cars = new ArrayList<Car>();
        Car car1 = new Car("audi", "a3", 2000, "SL86878");
        cars.add(car1);
        Car car2 = new Car("vw", "passat", 2001, "SO80808");
        cars.add(car2);
        Car car3 = new Car("bmw", "serie3", 2010, "KR23456");
        cars.add(car3);
        Car car4 = new Car("mercedes", "A class", 1999, "S1 JOKER");
        cars.add(car4);

        Customer Customer1 = new Customer("Antek", "Hassan","666777666");
        Customers.add(Customer1);
        Customer Customer2 = new Customer("Tomasz", "Wafel", "555444333");
        Customers.add(Customer2);
        Customer Customer3 = new Customer("Jaroslaw", "Bugaj", "543765876");
        Customers.add(Customer3);
        Customer Customer4 = new Customer("Roman", "Uniejowski", "765456888");
        Customers.add(Customer4);
        Customer Customer5 = new Customer("Bartlomiej", "Oracz", "Pluta");
        Customers.add(Customer5);
        Customer Customer6 = new Customer("Bogdan", "Frel", "707676444");
        Customers.add(Customer6);
        Customer Customer7 = new Customer("Anna", "Rutkiewicz", "554665778");
        Customers.add(Customer7);
        Customer Customer8 = new Customer("Aleksandra", "Smolik", "798090002");
        Customers.add(Customer8);
        Customer Customer9 = new Customer("Andrzej", "Golota", "555777999");
        Customers.add(Customer9);
        Customer Customer10 = new Customer("Milena", "Ociepka", "666879948");
        Customers.add(Customer10);
        Customer Customer11 = new Customer("Eugeniusz", "Materna", "543622211");
        Customers.add(Customer11);
        Customer Customer12 = new Customer("Roman", "Paska", "779800987");
        Customers.add(Customer12);


        carService.saveCarsList(cars);
        //CustomerService.saveCustomerList(Customers);
    }
}