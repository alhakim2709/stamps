package com.example.stamps;

import com.example.stamps.service.ApaBole;
import com.example.stamps.service.WheaterForcast;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StampsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StampsApplication.class, args);
        System.out.println("ApaBole");
        System.out.println("============================================");
        ApaBole apaBole = new ApaBole();
        apaBole.printApaBole();
        System.out.println();
        System.out.println();
        System.out.println("Weather");
        System.out.println("============================================");
        WheaterForcast wheaterForcast = new WheaterForcast();
        wheaterForcast.weatherForcastFunction();
    }
}
