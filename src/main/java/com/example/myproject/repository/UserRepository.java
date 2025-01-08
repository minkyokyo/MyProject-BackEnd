package com.example.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myproject.entity.Member;

public interface UserRepository extends JpaRepository<Member,Long>
{    
    Member findByMembername(String membername);
}
