package com.example.stamps.model;

import lombok.Data;

@Data
public class Main {
    private Float temp;
    private Float feels_like;
    private Float temp_min;
    private Float temp_max;
    private Integer pressure;
    private Integer sea_level;
    private Integer grnd_level;
    private Integer humidity;
    private Integer temp_kf;
}
