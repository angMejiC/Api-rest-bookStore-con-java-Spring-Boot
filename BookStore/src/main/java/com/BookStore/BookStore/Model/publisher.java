package com.BookStore.BookStore.Model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class publisher {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
 
  private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private String website;
    private LocalDate establishedDate;
    private String contactPerson;



    @OneToMany(mappedBy= "publisher", cascade=CascadeType.ALL,orphanRemoval=true)
    private List <Book> books;



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public String getCity() {
        return city;
    }



    public void setCity(String city) {
        this.city = city;
    }



    public String getPostalCode() {
        return postalCode;
    }



    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }



    public String getCountry() {
        return country;
    }



    public void setCountry(String country) {
        this.country = country;
    }



    public String getWebsite() {
        return website;
    }



    public void setWebsite(String website) {
        this.website = website;
    }



    public LocalDate getEstablishedDate() {
        return establishedDate;
    }



    public void setEstablishedDate(LocalDate establishedDate) {
        this.establishedDate = establishedDate;
    }



    public String getContactPerson() {
        return contactPerson;
    }



    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }



    public List<Book> getBooks() {
        return books;
    }



    public void setBooks(List<Book> books) {
        this.books = books;
    }


    
}