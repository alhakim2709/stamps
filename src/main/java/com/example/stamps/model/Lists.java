package com.example.stamps.model;

import lombok.Data;

import java.util.List;

@Data
public class Lists {
    private Main main;
    private List<Weather> weather;
    private Clouds clouds;
    private Wind wind;
    private Integer visibility;
    private Float pop;
    private Rain rain;
    private Sys sys;
    private String dt_txt;
}
