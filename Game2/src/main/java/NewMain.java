
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author star_
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n-------Hello and welcome to Wacky car racer-----------\n");

        // Define an array of cars with their details
        CarSpecificationDetails[] carDetails = new CarSpecificationDetails[]{
            new CarSpecificationDetails("Audi R8", " coupe ", 200),
            new CarSpecificationDetails("Porsche 911", " hatchback ", 180),
            new CarSpecificationDetails("Mercedes-Benz", " coupe ", 190),
            new CarSpecificationDetails("BMW 8-Series", " coupe ", 190),
            new CarSpecificationDetails("Ferrari F40", " sports ", 210),};

        System.out.println("Enter the number of cars racing:...");
        //https://www.w3schools.com/java/java_user_input.asp
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // https://codegym.cc/groups/posts/scanner-nextint-method-in-java
        int numCars = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the number of circuits for the race:");
        int numCircuits = scanner.nextInt();
        scanner.nextLine();

        List<Car> cars = new ArrayList<>();
        //https://www.w3schools.com/java/java_hashmap.asp
        // https://www.javatpoint.com/java-map#:~:text=A%20map%20contains%20values%20on,the%20basis%20of%20a%20key.
        Map<Integer, Boolean> selectedCars = new HashMap<>();
        for (int i = 1; i <= numCars; i++) {
            System.out.printf("Enter the name of the driver %d:\n", i);

            String driverName = scanner.nextLine();

            // Display the list of cars to choose from
            for (int j = 0; j < carDetails.length; j++) {
                if (!selectedCars.containsKey(j)) {
                    System.out.printf("%d. %s (%s) - %d mph\n", j + 1, carDetails[j].getName(),
                            carDetails[j].getType(), carDetails[j].getSpeed());
                }
            }

            int carIndex;
            do {
                // Prompt the user to select a car from the list
                System.out.printf("%s, select your car:\n", driverName);
                carIndex = scanner.nextInt();
                scanner.nextLine(); // consume the newline character

                if (selectedCars.containsKey(carIndex - 1)) {
                    System.out.println("This car is already taken. Please select a different one.");
                    carIndex = 0;
                }
            } while (carIndex == 0);

            // Get the details of the selected car
            CarSpecificationDetails selectedCar = carDetails[carIndex - 1];

            // Mark the selected car as taken , true
            selectedCars.put(carIndex - 1, true);

            // creates a new car and add to the cars list
            cars.add(new Car(driverName + "'s " + selectedCar.getName() + " " + selectedCar.getType(), selectedCar.getSpeed()));
        }

        RaceStrategy raceStrategy = new SimpleRace(numCircuits, 1000);
        RaceObserver raceObserver = new RaceObserver() {
            @Override
            public void onCircuitCompleted(Car car, int circuitTime) {
                System.out.printf("%s completed a circuit in %d ms\n", car.getName(), circuitTime);
            }
        };

        for (Car car : cars) {
            raceStrategy.race(car, raceObserver);
        }

        int[] circuitTimes = ((SimpleRace) raceStrategy).getCircuitTimes();
        int winnerIndex = 0;
        int winnerTime = circuitTimes[0];
        for (int i = 1; i < circuitTimes.length; i++) {
            if (circuitTimes[i] < winnerTime) {
                winnerIndex = i;
                winnerTime = circuitTimes[i];
            }
        }

        System.out.printf("%s is the winner\n", cars.get(winnerIndex).getName());
    }
}
