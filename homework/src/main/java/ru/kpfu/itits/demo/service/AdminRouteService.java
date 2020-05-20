package ru.kpfu.itits.demo.service;


import org.springframework.stereotype.Service;
import ru.kpfu.itits.demo.dto.RouteDto;
import ru.kpfu.itits.demo.models.Route;

import java.util.List;
@Service
public interface AdminRouteService {

    void AdminRoute(RouteDto form);
    List<Route> getAllRoutes();
}
