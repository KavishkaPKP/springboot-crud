package com.q4.crudapp.Repository;

import com.q4.crudapp.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}