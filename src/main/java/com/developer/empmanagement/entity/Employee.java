package com.developer.empmanagement.entity;


import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="mt_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private long id;
    @Column(name="emp_name")
    private String name;
    @Column(name="emp_gender")
    private String Gender;
    @Column(name="emp_dob")
    private Date dateOfBirth;
    @Column(name="emp_address")
    private String address;

    public Employee() {
    }

    public Employee(long id, String name, String gender, Date dateOfBirth, String address) {
        this.id = id;
        this.name = name;
        Gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
