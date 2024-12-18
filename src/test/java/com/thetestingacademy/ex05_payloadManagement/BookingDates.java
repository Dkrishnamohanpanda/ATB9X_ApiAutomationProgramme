package com.thetestingacademy.ex05_payloadManagement;

public class BookingDates {
private String checkin;
private String checkout;
private String additionalneeds;

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public String getCheckout() {
        return checkout;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
}
