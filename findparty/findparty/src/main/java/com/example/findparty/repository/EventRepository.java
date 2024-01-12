package com.example.findparty.repository;

import com.example.findparty.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByName(String name);

    void deleteById(Long id);
}
