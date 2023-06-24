package Entities;
import Database.CarOperations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Car {
    private String plate;
    private String model;
    private Integer year;
    private Double price;
    private Double totalTax;
    private String ownerName;
    private Date firstDate;
    private Date lastDate;

    public Car(){
    }
    public Car(String plate, String model, Integer year, Double price, Double totalTax) {
        this.plate = plate;
        this.model = model;
        this.year = year;
        this.price = price;
        this.totalTax = totalTax;
        firstDate = null;
        lastDate = null;
    }

    public static List<Car> setList() {
        CarOperations sl = new CarOperations();
        return sl.setList();
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(Double totalTax) {
        this.totalTax = totalTax;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public Object[] getObjects() {
        String x;
        if(ownerName == null) x = "Yok";
        else x = ownerName;
        Object[] data = {plate,model,year,price,totalTax,x};
        return data;
    }

    public Object[] getRentalObjects() {
        if(ownerName != null) return null;
        Object[] data = {plate,model,year,price};
        return data;
    }
}
