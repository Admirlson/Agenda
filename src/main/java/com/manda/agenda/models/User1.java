package com.manda.agenda.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;



@Entity
public class User1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // @Column(name = "lastname")
    @NotEmpty(message = "Last name not be empty")
    private String lastName;

    // @Column(name = "firstname")
    @NotEmpty(message = "First name not be empty")
    private String firstName;

    // @Column(name = "username")
    @NotEmpty(message = "Username not be empty")
    @Column(unique = true)
    private String username;

    // @Column(name = "password")
    private String password;

    // @Column(name = "role")
    private String role;

    // @Column(name = "whocreated")
    private String whoCreated;

    // @Temporal(TemporalType.DATE)
    // @Column(name = "datecreated")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateCreated;

    // @Column(name = "whomodified")
    private String whoModified;

    // @Temporal(TemporalType.DATE)
    // @Column(name = "datemodified")
    private LocalDate dateModified;

    private String firstConnection;

    private String statut;

    

    public User1() {
    }

    public User1(Integer id, @NotEmpty(message = "Last name not be empty") String lastName,
            @NotEmpty(message = "First name not be empty") String firstName,
            @NotEmpty(message = "Username not be empty") String username, String password, String role,
            String whoCreated, LocalDate dateCreated, String whoModified, LocalDate dateModified,
            String firstConnection, String statut) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.username = username;
        this.password = password;
        this.role = role;
        this.whoCreated = whoCreated;
        this.dateCreated = dateCreated;
        this.whoModified = whoModified;
        this.dateModified = dateModified;
        this.firstConnection = firstConnection;
        this.statut = statut;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getWhoCreated() {
        return whoCreated;
    }

    public void setWhoCreated(String whoCreated) {
        this.whoCreated = whoCreated;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getWhoModified() {
        return whoModified;
    }

    public void setWhoModified(String whoModified) {
        this.whoModified = whoModified;
    }

    public LocalDate getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDate dateModified) {
        this.dateModified = dateModified;
    }

    public String getFirstConnection() {
        return firstConnection;
    }

    public void setFirstConnection(String firstConnection) {
        this.firstConnection = firstConnection;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    

}
