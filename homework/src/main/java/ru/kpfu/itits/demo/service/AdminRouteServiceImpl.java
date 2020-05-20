package ru.kpfu.itits.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itits.demo.dto.RouteDto;
import ru.kpfu.itits.demo.models.Route;
import ru.kpfu.itits.demo.repository.RouteRepository;

import java.util.List;

@Component
public class AdminRouteServiceImpl implements AdminRouteService {
    @Autowired
    private RouteRepository routeRepository;



    @Override
    public void AdminRoute(RouteDto form) {
        Route route = Route.builder()
                .tocountry(form.getTocountry())
                .fromcountry(form.getFromcountry())
                .transport(form.getTransport())
                .time(form.getTime())
                .duration(form.getDuration())
      .build();
        routeRepository.save(route);

    }

    @Override
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }
}
