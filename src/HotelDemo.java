
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // Define a file object
        File file = new File("input.txt");
        Scanner fileReader = new Scanner(file);

        ArrayList<Hotel> hotelList = new ArrayList<>(); // hotel list to store all hotel info
        int totalRooms = 0; // sum of valid rooms in the hotels
        int totalOccupied = 0; // sum of valid occupied rooms

        // Start reading from the file
        while (fileReader.hasNextLine()) {
            String text = fileReader.nextLine();
            String[] words = text.split(", ");
            // If there is one value
            if (words.length == 1 ) {
                Hotel emptyHotel = new Hotel();
                hotelList.add(emptyHotel);
            }
            // If there are 3 values
            // Validation
            else if (Integer.parseInt(words[1]) < 5) {
                continue;
            }
            else if (Integer.parseInt(words[2]) > Integer.parseInt(words[1])) {
                continue;
            }
            // Traverse through the input text
            else {
                Hotel newHotel = new Hotel(
                        words[0], Integer.parseInt(words[1]), Integer.parseInt(words[2]));
                hotelList.add(newHotel);
            }
        }

        // Display hotel information
        for (Hotel myHotel : hotelList) {
            System.out.printf("%s: %.2f%s\n",
                    myHotel.getHotelName(), myHotel.getOccupancyRate()*100, "%");
            totalRooms += myHotel.getNumRooms();
            totalOccupied += myHotel.getNumOccupied();
        }

        System.out.printf("\nTotal occupancy: %.2f%s",
                (double) 100 * totalOccupied / totalRooms, "%");

        // Close file reader
        fileReader.close();

    }
}