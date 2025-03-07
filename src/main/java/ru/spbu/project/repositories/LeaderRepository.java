package ru.spbu.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spbu.project.models.Leader;

@Repository
public interface LeaderRepository extends JpaRepository<Leader, Long> {
}
