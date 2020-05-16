package ru.kpfu.itis.aspect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.kpfu.itis.aspect.model.Method;

import java.util.Optional;

public interface MethodRepository extends JpaRepository<Method, Long> {
    Optional<Method> findMethodByUuid(String uuid);

    Optional<Method> findMethodByName(String name);
}
