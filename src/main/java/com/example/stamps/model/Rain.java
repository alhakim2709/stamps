package com.example.stamps.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;


@Data
public class Rain {
    @JsonAlias("3h")
    private Float rain;
}
