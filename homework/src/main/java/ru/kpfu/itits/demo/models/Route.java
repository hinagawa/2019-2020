package ru.kpfu.itits.demo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="country")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String tocountry;
    @NotNull
    private String fromcountry;
    @NotNull
    private String transport;

    @NotNull
    private String time;
    @NotNull
    private Integer duration;
}
