package com.anam.studentmanagementsystem.repository;

import com.anam.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository<T> extends JpaRepository<Student, Long> {

}
