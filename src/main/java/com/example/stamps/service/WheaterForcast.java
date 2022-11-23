package com.example.stamps.service;

import com.example.stamps.model.Lists;
import com.example.stamps.model.Response;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class WheaterForcast {
    public void weatherForcastFunction() {
        RestTemplate restTemplate = new RestTemplate();
        int count = 0;
        String url = "http://api.openweathermap.org/data/2.5/forecast?lat=6.2088&lon=106.8456&appid=10cc5fb88ff092f94be6f7242666db5e&units=metric";
        ResponseEntity<Response> response = restTemplate.exchange(url, HttpMethod.GET, null, Response.class);
        for (Lists responseList : Objects.requireNonNull(response.getBody()).getList()) {
            if (count % 8 == 0) { // Modulo 8 because i just need to get 1 data per day, there are 8 datas in one day
                Instant instant = Timestamp.valueOf(Objects.requireNonNull(response.getBody()).getList().get(count).getDt_txt()).toInstant();
                Date date = Date.from(instant);
                SimpleDateFormat simpleDateFormatDay = new SimpleDateFormat("EEE");
                SimpleDateFormat simpleDateFormatDate = new SimpleDateFormat("dd MMM YYYY");
                System.out.println(simpleDateFormatDay.format(date) + ", " + simpleDateFormatDate.format(date) + ": " + responseList.getMain().getTemp() + "°C");
            }
            count++;
        }


    }
}
