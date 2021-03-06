package com.mechanicproject.controller;

import com.mechanicproject.entity.Car;
import com.mechanicproject.entity.Customer;
import com.mechanicproject.service.CarService;
import com.mechanicproject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private CustomerService customerService;

    private CarService carService;

    @Autowired
    public CustomerController(CustomerService customerService, CarService carService) {
        this.carService = carService;
        this.customerService = customerService;
    }

    @RequestMapping(value = "/fillbase", method = RequestMethod.POST)
    public void initializeDatabase(){
        List<Customer> customers = new ArrayList<>();
        List<Car> cars = new ArrayList<Car>();
        Car car1 = new Car("audi", "A1", 2000, "SL86878");
        cars.add(car1);
        Car car2 = new Car("vw", "passat", 2001, "SO80808");
        cars.add(car2);
        Car car3 = new Car("bmw", "serie3", 2010, "KR23456");
        cars.add(car3);
        Car car4 = new Car("renault", "Clio", 2008, "GD1K2UP3");
        cars.add(car4);
        Car car5 = new Car("mercedes", "A class", 1999, "S1JOKER");
        cars.add(car5);
        Car car6 = new Car("skoda", "fabia", 2012, "SO29SF");
        cars.add(car6);
        Car car7 = new Car("porsche", "panamera", 2015, "SK923DS1");
        cars.add(car7);
        Car car8 = new Car("peugeot", "306", 2010, "PO093JKI");
        cars.add(car8);
        Car car9 = new Car("opel", "astra", 2014, "SGL62901");
        cars.add(car9);
        Car car10 = new Car("seat", "ibiza", 2011, "SK2344P3");
        cars.add(car10);
        Car car11 = new Car("audi", "A5", 1999, "SR8902D");
        cars.add(car11);
        Car car12 = new Car("fiat", "multipla", 1999, "WAW201D2");
        cars.add(car12);

        Customer Customer1 = new Customer("Antek", "Hassan","666777666");
        customers.add(Customer1);
        Customer Customer2 = new Customer("Tomasz", "Wafel", "555444333");
        customers.add(Customer2);
        Customer Customer3 = new Customer("Jaroslaw", "Bugaj", "543765876");
        customers.add(Customer3);
        Customer Customer4 = new Customer("Roman", "Uniejowski", "765456888");
        customers.add(Customer4);
        Customer Customer5 = new Customer("Bartlomiej", "Oracz", "Pluta");
        customers.add(Customer5);
        Customer Customer6 = new Customer("Bogdan", "Frel", "707676444");
        customers.add(Customer6);
        Customer Customer7 = new Customer("Anna", "Rutkiewicz", "554665778");
        customers.add(Customer7);
        Customer Customer8 = new Customer("Aleksandra", "Smolik", "798090002");
        customers.add(Customer8);
        Customer Customer9 = new Customer("Andrzej", "Golota", "555777999");
        customers.add(Customer9);
        Customer Customer10 = new Customer("Milena", "Ociepka", "666879948");
        customers.add(Customer10);
        Customer Customer11 = new Customer("Eugeniusz", "Materna", "543622211");
        customers.add(Customer11);
        Customer Customer12 = new Customer("Roman", "Paska", "779800987");
        customers.add(Customer12);


        carService.saveCarsList(cars);
        customerService.saveCustomerList(customers);
    }
}
