package ua.goit.java;

/**
 * Created by 7 on 05.07.2016.
 */
public class PublicToilet {
    private volatile static int numberOfSeats = 6;

    public static int getNumberOfSeats() {
        return numberOfSeats;
    }
}
