package com.anam.studentmanagementsystem.repository;

import com.anam.studentmanagementsystem.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
