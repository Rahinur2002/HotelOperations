package com.pluralsight;

public class Reservation {
    getRoomType()
    setRoomType(String roomType)
    getPrice()
    getNumberOfNights()
    setNumberOfNights(int numberOfNights)
    isWeekend()
    setIsWeekend(boolean isWeekend)
    getReservationTotal()

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType.toLowerCase();
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice(){
        double pricePernight;
        if(this.roomType.equals("king")) {
            pricePernight = 139.00;
        }
        else if(this.roomType.equals("double")){
            pricePernight = 124.00;
        }
        if(this.isWeekend) {
            pricePernight *= 1.10;
        }
        return pricePernight;
    }
}
