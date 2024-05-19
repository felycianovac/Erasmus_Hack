package org.example.Specialization;

import org.example.University.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {

    List<Specialization> findSpecializationsByUniversityId(University university);
}
