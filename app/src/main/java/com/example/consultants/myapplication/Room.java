package com.example.consultants.myapplication;

public class Room {
    public final boolean isInfected;
    public static boolean visited = false;

    //size of the array for room
    boolean roomArray[][] = new boolean[10][10];

    public static void main(String[] args) {


    }


    public Room(boolean isInfected) {
        this.isInfected = isInfected;
    }

    public static boolean isOutBreak(Room[][] roomArray) {

        for (int x = 0; x < roomArray.length; x++) {

//            if(roomArray.)

        }


        return visited;
    }

    public static boolean checkOutbreak(Room[][] roomArray) {
        boolean infected = false;

        for (int x = 0; x < roomArray.length; x++) {

            for (int y = 0; y < roomArray.length; y++) {
                if (roomArray[x][y].isInfected == true) {
                    isOutBreak(roomArray);
                }
            }

        }

        return infected;
    }

}
