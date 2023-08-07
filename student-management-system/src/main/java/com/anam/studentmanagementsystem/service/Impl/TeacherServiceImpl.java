package com.anam.studentmanagementsystem.service.Impl;

import com.anam.studentmanagementsystem.entity.Teachers;
import com.anam.studentmanagementsystem.repository.TeacherRepository;
import com.anam.studentmanagementsystem.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        super();
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teachers> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teachers saveTeacher(Teachers teachers) {
        return (Teachers) teacherRepository.save(teachers);
    }

    @Override
    public Teachers getTeacherById(Long id) {
        return (Teachers) teacherRepository.findById(id).get();
    }

    @Override
    public Teachers updateTeacher(Teachers teachers) {
        return (Teachers) teacherRepository.save(teachers);
    }

    @Override
    public void deleteTeacherById(Long id) {
        teacherRepository.deleteById(id);
    }
}
