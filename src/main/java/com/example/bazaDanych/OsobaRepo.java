package com.example.bazaDanych;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OsobaRepo extends JpaRepository<Osoba, Integer> {
    List<Osoba> findAllBynazwisko(String wyszukaj);
}
