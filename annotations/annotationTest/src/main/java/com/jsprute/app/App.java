package com.jsprute.app;

import com.jsprute.models.Car;
import com.jsprute.serializer.JsonSerializeException;
import com.jsprute.serializer.JsonSerializer;


public class App {
    public static void main(String[] args) {
        Car car = new Car("Ford", "F150", "2018");
        JsonSerializer serializer = new JsonSerializer();
        try {
            serializer.serialize(car);
        } catch (JsonSerializeException e) {
            e.printStackTrace();
        }
    }
}
