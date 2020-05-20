package ru.kpfu.itits.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itits.demo.models.Route;

import java.util.List;
@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
    List<Route> findAll();
    List<Route> findAllByFromcountry(String fromcountry);
}
