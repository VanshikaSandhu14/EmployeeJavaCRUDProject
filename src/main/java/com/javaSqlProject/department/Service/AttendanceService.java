package com.javaSqlProject.department.Service;

import com.javaSqlProject.department.Entity.Attendance;
import com.javaSqlProject.department.Repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;
    public Attendance saveEmployeeAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);

    }
}
