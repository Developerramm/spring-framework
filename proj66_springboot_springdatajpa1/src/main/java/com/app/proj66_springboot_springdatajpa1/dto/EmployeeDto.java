package com.app.proj66_springboot_springdatajpa1.dto;

public class EmployeeDto {

    private Integer eid;
    private String ename;
    private String email;
    private Double salary;

    public EmployeeDto(Integer eid, String ename, String email, Double salary) {
        this.eid = eid;
        this.ename = ename;
        this.email = email;
        this.salary = salary;
    }

    public EmployeeDto() {

    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
