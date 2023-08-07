package com.anam.studentmanagementsystem;

import com.anam.studentmanagementsystem.entity.Teachers;
import com.anam.studentmanagementsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeacherManagementSystemApplication implements CommandLineRunner {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void run(String... args) throws Exception {
    }
}
