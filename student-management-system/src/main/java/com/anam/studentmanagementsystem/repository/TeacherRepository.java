package com.anam.studentmanagementsystem.repository;

import com.anam.studentmanagementsystem.entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository<T> extends JpaRepository <Teachers, Long> {

}
