package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.UserPlan;

@Repository
public interface UserPlanRepository extends JpaRepository<UserPlan, Long>{

}
