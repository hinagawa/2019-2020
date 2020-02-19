package ru.itis.kpfu.demo.dto;

import lombok.Data;

@Data
public class PostDto {
    private String title;
    private String text;

    public Object getName() {
        return title;
    }
}

