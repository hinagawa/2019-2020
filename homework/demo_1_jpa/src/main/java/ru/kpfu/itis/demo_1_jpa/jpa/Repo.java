package ru.kpfu.itis.demo_1_jpa.jpa;


import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.demo_1_jpa.data.PostDB;
@Repository
public interface Repo extends JpaRepository<PostDB, Long> {
    Page<PostDB> findAllByTitle(String title, PageRequest page);

}
