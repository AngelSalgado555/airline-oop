package org.ies.airline.components;

import java.util.Scanner;

public class AirlineApp1 {
    private final Scanner scanner;
    private final AirlineReader airlineReader;
    private final PassengerReader passengerReader;

    public AirlineApp1(Scanner scanner, AirlineReader airlineReader, PassengerReader passengerReader) {
        this.scanner = scanner;
        this.airlineReader = airlineReader;
        this.passengerReader = passengerReader;

}

    public void run(){
        System.out.println("Introduce los datos de la Aerolinea");
        var airline = airlineReader.read();

        System.out.println("Introduce el número de vuelo");
        int num = scanner.nextInt();
        airline.findFlight(num);

        System.out.println("Introduce un pasajero");
        var passenger = passengerReader.read();

    }
}
