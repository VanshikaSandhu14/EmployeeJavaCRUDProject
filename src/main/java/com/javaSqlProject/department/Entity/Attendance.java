package com.javaSqlProject.department.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "emp_id")
    private int employeeId;

    private String date;
    @Column(name="entry_time")
    private String entryTime;
    @Column(name="exit_time")
    private String exitTime;

    public Attendance() {

    }

    public Attendance(int employeeId, String date, String entryTime, String exitTime) {
        this.employeeId = employeeId;
        this.date = date;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", date='" + date + '\'' +
                ", entryTime='" + entryTime + '\'' +
                ", exitTime='" + exitTime + '\'' +
                '}';
    }
}
