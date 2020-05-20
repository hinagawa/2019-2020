package ru.kpfu.itits.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RouteDto {
    @NotNull
    private String fromcountry;
    @NotNull
    private String tocountry;
    private String transport;
    private String time;
    private Integer duration;
}
