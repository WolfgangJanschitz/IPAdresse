package com.company;

import java.net.NetworkInterface;
import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {
        //IP Config nachbauen
        try {
            //Ausgabe des Rechnernamens
            String rechner_name=InetAddress.getLocalHost().getHostName();
            System.out.println("Meine IP Adrese ist:" + rechner_name);

            //Ausgabe der IP Adressen und MAC Adressen über den Local Host Name
            InetAddress[] alle_adressen;
            alle_adressen=InetAddress.getAllByName(rechner_name);

            for(InetAddress feld : alle_adressen) {
                System.out.println("Meine IP Adrese ist:" +feld.getHostAddress());

                //System.out.println("Meine MAC Adresse ist:" + mac.getName());
            }
            //NetworkInterface mac = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
