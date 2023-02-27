package com.example.frontapp.repos;

import com.example.frontapp.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepo extends JpaRepository<Session, Long> {
}
