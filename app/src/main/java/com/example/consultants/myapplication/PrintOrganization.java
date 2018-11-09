package com.example.consultants.myapplication;

import java.lang.reflect.Array;

public class PrintOrganization {

    static String[][] manager = {{"A1,B2,C3,D4"},
            {"B2,E5,F6"},
            {"D4,G7,I9"},
            {"G7,H8"}};

    public static void main(String[] args) {

        organizeManager(manager);
    }

    public static void organizeManager(String manager[][]) {

        for (int x = 0; x < manager.length; x++) {

            for (int y = 0; y < manager.length; y++) {

                String employee = manager[x][y];
                String[] level = employee.split(",");
                //TODO calling B2 again
                for (int i = 0; i < level.length; i++) {
                    System.out.println(level[i]);
                }
                break;
            }


        }

    }


}
