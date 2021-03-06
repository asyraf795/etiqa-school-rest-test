package com.test.etiqa.schoolrest.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Student implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String ic;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    private String gender;

    private String phoneNumber;

    private String email;

    private Date dateOfBirth;

    private String address;

    private String postcode;

    private String state;

    private String country;

//    @ManyToOne
    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="course_id")
    @JsonIgnoreProperties("students")
    private Course course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student() {
    }

    public Student(int id, @NotBlank String ic, @NotBlank String firstName, @NotBlank String lastName, String gender, String phoneNumber, String email, Date dateOfBirth, String address, String postcode, String state, String country, Course course) {
        this.id = id;
        this.ic = ic;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.postcode = postcode;
        this.state = state;
        this.country = country;
        this.course = course;
    }

//    public Student(@NotBlank String ic, @NotBlank String firstName, @NotBlank String lastName, String gender, String phoneNumber, String email, Date dateOfBirth, String address, String postcode, String state, String country, Course course) {
//        this.ic = ic;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.gender = gender;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//        this.dateOfBirth = dateOfBirth;
//        this.address = address;
//        this.postcode = postcode;
//        this.state = state;
//        this.country = country;
//        this.course = course;
//    }
}