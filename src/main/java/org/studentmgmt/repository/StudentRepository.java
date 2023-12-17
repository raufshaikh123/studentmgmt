package org.studentmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.studentmgmt.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
