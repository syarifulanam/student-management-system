package com.anam.studentmanagementsystem.controller;

import com.anam.studentmanagementsystem.entity.Member;
import com.anam.studentmanagementsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    // controller untuk tampilin FORM html simpan data member
    // method get, URL /members/new
    @GetMapping("/members/new")
    public String saveMemberPage(Model model) {
        model.addAttribute("member", new Member());
        return "members/create-member"; // nama folder & nama file html
    }

}
