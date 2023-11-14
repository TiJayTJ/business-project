package ru.spbu.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spbu.project.models.Practice;

@Repository
public interface PracticeRepository extends JpaRepository<Practice, Long> {
}
