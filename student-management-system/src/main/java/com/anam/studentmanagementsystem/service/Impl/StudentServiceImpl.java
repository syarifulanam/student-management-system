package com.anam.studentmanagementsystem.service.Impl;

import com.anam.studentmanagementsystem.entity.Student;
import com.anam.studentmanagementsystem.repository.StudentRepository;
import com.anam.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return (Student) studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return (Student) studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return (Student) studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
