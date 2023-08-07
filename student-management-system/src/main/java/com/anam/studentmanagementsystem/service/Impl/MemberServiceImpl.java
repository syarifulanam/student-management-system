package com.anam.studentmanagementsystem.service.Impl;

import com.anam.studentmanagementsystem.entity.Member;
import com.anam.studentmanagementsystem.repository.MemberRepository;
import com.anam.studentmanagementsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveOrUpdate(Member member) {
        return memberRepository.save(member);
    }
}
