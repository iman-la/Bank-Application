package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Checking checking = new Checking("im_imanafshar", "321425313", 1500);
        Saving saving = new Saving("@iman3mun", "321768313", 5500);


        saving.showInfo();
        System.out.println("********");
        checking.showInfo();
        System.out.println("********");
        saving.compound();


    }


}
