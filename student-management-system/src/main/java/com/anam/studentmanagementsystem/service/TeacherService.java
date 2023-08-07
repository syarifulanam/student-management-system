package com.anam.studentmanagementsystem.service;

import com.anam.studentmanagementsystem.entity.Teachers;

import java.util.List;

public interface TeacherService {
    List<Teachers> getAllTeachers();

    Teachers saveTeacher(Teachers teachers);

    Teachers getTeacherById(Long id);

    Teachers updateTeacher(Teachers teachers);

    void deleteTeacherById(Long id);
}
