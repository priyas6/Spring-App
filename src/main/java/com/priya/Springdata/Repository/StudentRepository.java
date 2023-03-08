package com.priya.Springdata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priya.Springdata.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository< Student, Integer> {

}
