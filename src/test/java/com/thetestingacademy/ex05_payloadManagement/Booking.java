package com.thetestingacademy.ex05_payloadManagement;

public class Booking {
    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean deapositpaid;
    private BookingDates bookingdates;

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }



    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    private String additionalneeds;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public Boolean getDeapositpaid() {
        return deapositpaid;
    }

    public void setDeapositpaid(Boolean deapositpaid) {
        this.deapositpaid = deapositpaid;
    }
}
