package com.manda.agenda.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotEmpty;



public class UserDTO {
    private Integer id;

    @NotEmpty(message = "Last name not be empty")
    private String lastName;

    @NotEmpty(message = "First name not be empty")
    private String firstName;

    @NotEmpty(message = "Username not be empty")
    private String username;

    @NotEmpty(message = "Password not be empty")
    private String password;

    private String role;

    @NotEmpty(message = "Who created not be empty")
    private String whoCreated;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateCreated;

    private String whoModified;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateModified;

    private String firstConnection;

    private String statut;

    public UserDTO() {
    }

    public UserDTO(Integer id, @NotEmpty(message = "Last name not be empty") String lastName,
            @NotEmpty(message = "First name not be empty") String firstName,
            @NotEmpty(message = "Username not be empty") String username,
            @NotEmpty(message = "Password not be empty") String password, String role,
            @NotEmpty(message = "Who created not be empty") String whoCreated, LocalDate dateCreated,
            String whoModified, LocalDate dateModified, String firstConnection, String statut) {
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
