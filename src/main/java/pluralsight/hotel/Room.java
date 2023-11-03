package pluralsight.hotel;

import pluralsight.hotel.ui.RoomStatus;

public class Room {
    private int number;
    private boolean available;
    private boolean isClean;
    private RoomType roomType;
    private RoomStatus roomStatus;

    // <---CONSTRUCTORS--->
    public Room() {
    }

    public Room(int number, boolean available, boolean isClean, RoomType roomType) {
        this.number = number;
        this.available = available;
        this.isClean = isClean;
        this.roomType = roomType;

        if(available == true) {this.isClean = true;}
        // if(available == false) { this.isClean = false; }
    }

    public Room(int number, RoomType roomType, RoomStatus roomStatus) {
        this.number = number;
        this.roomType = roomType;
        this.roomStatus = roomStatus;

        if (roomStatus == RoomStatus.DIRTY) {
            this.available = false;
            this.isClean = false;
        }
        else if (roomStatus == RoomStatus.AVAILABLE) {
            this.available = true;
            this.isClean = true;
        }
        else if (roomStatus == RoomStatus.UNDER_MAINTENENCE) {
            this.available = false;
            this.isClean = false;
        }
    }

    // <---GETTERS & SETTERS--->
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
}
