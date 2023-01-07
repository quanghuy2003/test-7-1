package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String fisrtName;
    private Date DateOfBirth;
    @ManyToOne
    private Gender gender;
    @ManyToOne
    private Room room;
    private Date startTime;
    private String title;
    private long income;


    public Staff() {
    }

    public Staff(Long id, String lastName, String fisrtName, Date dateOfBirth, Gender gender, Room room, Date startTime, String title, long income) {
        this.id = id;
        this.lastName = lastName;
        this.fisrtName = fisrtName;
        DateOfBirth = dateOfBirth;
        this.gender = gender;
        this.room = room;
        this.startTime = startTime;
        this.title = title;
        this.income = income;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }
}
