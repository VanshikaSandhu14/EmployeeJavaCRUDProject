package com.javaSqlProject.department.Repository;

import com.javaSqlProject.department.Entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
