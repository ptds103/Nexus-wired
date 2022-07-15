package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long>{

}
