package com.anam.studentmanagementsystem.controller;

import com.anam.studentmanagementsystem.entity.Teachers;
import com.anam.studentmanagementsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers")
    public String listTeacher(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "teachers"; // html ini namanya harus sama
    }

    @GetMapping("/teachers/new")
    public String createTeacherForm(Model model) {
        Teachers teacher = new Teachers();
        model.addAttribute("teacher", teacher);
        return "create_teacher";
    }

    @PostMapping("/teachers")
    public String saveTeacher(@ModelAttribute("teacher") Teachers teacher) {
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers"; // pindah ke halaman /teachers
    }

    @GetMapping("/teachers/edit/{id}")
    public String editTeacherForm(@PathVariable Long id, Model model) {
        model.addAttribute("teacher", teacherService.getTeacherById(id));
        return "edit_teacher";
    }

    @PostMapping("/teachers/{id}")
    public String updateTeacher(@PathVariable Long id, @ModelAttribute("teacher") Teachers teachers, Model model) {
        Teachers existingTeacher = teacherService.getTeacherById(id);
        existingTeacher.setName(teachers.getName());
        existingTeacher.setEmail(teachers.getEmail());
        teacherService.updateTeacher(existingTeacher);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacherById(id);
        return "redirect:/teachers";
    }
}
