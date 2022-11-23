package com.example.stamps.model;

import lombok.Data;

import java.util.List;

@Data
public class Response {
    private String cod;
    private String message;
    private String cnt;
    private List<Lists> list;
}
