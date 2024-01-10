public class Hotel {
    private int numRooms; // the total number of rooms available for the given Hotel
    private int numOccupied; // the number of rooms currently occupied
    private String hotelName;

    // No-arg constructor
    public Hotel() {
        hotelName = "Default Hotel";
        numRooms = 10;
        numOccupied = 0;
    }

    // Constructor with 3 parameters
    public Hotel(String hotelName, int numRooms, int numOccupied) {
        this.hotelName = hotelName;
        this.numRooms = numRooms;
        this.numOccupied = numOccupied;
    }

    // Define getter
    public String getHotelName() {
        return hotelName;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public int getNumOccupied() {
        return numOccupied;
    }

    // Define setter
    public void setHotelName(String name) {
        hotelName = name;
    }

    public void setNumRooms(int rooms) {
        numRooms = rooms;
    }

    public void setNumOccupied(int occupied) {
        numOccupied = occupied;
    }

    // Calculate occupancy rate
    public double getOccupancyRate() {
        return (double) numOccupied /numRooms;
    }
}
