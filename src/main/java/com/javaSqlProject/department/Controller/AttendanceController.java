package com.javaSqlProject.department.Controller;

import com.javaSqlProject.department.Entity.Attendance;
import com.javaSqlProject.department.Service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/")
    public Attendance saveAttendance(@RequestBody Attendance attendance){
        return attendanceService.saveEmployeeAttendance(attendance);
    }

}
