package com.filthy.gnomes.dto;

/**
 * Created by User on 11/21/2015.
 */
public class GreetingDTO {
    private String visitorName;
    private String roomName;
    private String roomDetails;

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(String roomDetails) {
        this.roomDetails = roomDetails;
    }

    public GreetingDTO(String visitorName, String roomName, String roomDetails) {
        this.visitorName = visitorName;
        this.roomName = roomName;
        this.roomDetails = roomDetails;
    }

    public GreetingDTO(){}
}
