//
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.List;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
///**
// *
// * @author star_
// */
//public class Race  {
//
//    private int laps;
//   // private LocalTime finishingTime;
//    private List<Car> cars;
//    private Track tracks;
//
//    private List<RaceObserver> observers = new ArrayList<>();
//    private int lapCount = 0;
//
//    public Race(int laps) {
//        this.laps = laps;
//        this.cars = new ArrayList<>();
//
//    }
//
//    public int getLapCount() {
//        return lapCount;
//    }
//
//    public void setLapCount(int lapCount) {
//        this.lapCount = lapCount;
//    }
//
//    public int getLaps() {
//        return laps;
//    }
//
//    public void addCar(Car car) {
//        cars.add(car);
//    }
//
//    public void raceStarted() {
//        System.out.println("Race started");
//    }
//
//    public void raceFinished() {
//        System.out.println("Race finished");
//    }
//
//    public void raceEnding() {
//        System.out.println("Race ending...\n");
//    }
//
//    public void raceEnded() {
//        System.out.println("Race ended !!!.\n");
//    }
//
////    public void startRace() {
////        System.out.println("Race started");
////    }
////
////    public void endRace() {
////        System.out.println("Race ended");
////    }
////    public boolean isOver() {
////        // check if the race is over 
////        for (Car car : cars) {
////            if (car.getDistance() >= lapCount) {
////                car.setFinishTime(LocalTime.now());
////                return true;
////            }
////        }
////        return false;
////    }
//
//    public void addObserver(RaceObserver observer) {
//        observers.add(observer);
//    }
//
//    public void removeobserver(RaceObserver observer) {
//        observers.remove(observer);
//    }
//
////    public void notifyObservers() {
////        for (RaceObserver observer : observers) {
////            observer.update(this);
////        }
////    }
//
//    public void update(Race race) {
//        int currentLap = race.getLapCount();
//        if (currentLap > lapCount) {
//            lapCount = currentLap;
//            System.out.println("New lap completed " + lapCount);
//        }
//    }
//
////    public void start() {
////        // Notify the observers that the race is starting
////        for (RaceObserver observer : observers) {
////            observer.raceStarted();
////        }
//
//        // Perform the race logic here
//        for (int i = 0; i < laps; i++) {
//            for (Car car : cars) {
//                car.getDistance();
//            }
//        }
//
//        // Notify the observers that the race is finished
//        for (RaceObserver observer : observers) {
//            observer.raceFinished();
//        }
//    }
//
//    public void end() {
//        // Notify the observers that the race is ending
//        for (RaceObserver observer : observers) {
//            observer.raceEnding();
//        }
//
//        // Determine the winner of the race
//        Car winner = null;
//        float maxDistance = 0;
//        for (Car car : cars) {
//            float distance = car.getDistance();
//            System.out.println(distance + ">>>>>>" + car.name);
//            if (distance > maxDistance) {
//                maxDistance = distance;
//                winner = car;
//            }
//        }
//
//        // Notify the observers of the winner of the race
//        for (RaceObserver observer : observers) {
//            observer.raceWinner(winner);
//        }
//
//        // Notify the observers that the race has ended
//        for (RaceObserver observer : observers) {
//            observer.raceEnded();
//        }
//    }
//    // double check this
//    public Car getWinner() {
//        int maxLaps = -1;
//        Car winner = null;
//        for (Car car : cars) {
//            int laps = car.getDistance();
//            if (laps > maxLaps) {
//                maxLaps = laps;
//                winner = car;
//            }
//        }
//        return winner;
//    }
//    // sort this 
//    public void raceWinner(Car Winner) {
//        System.out.println("Winning");
//    }
//
//    void setTracks(Track tracks) {
//       this.tracks= new Track(tracks);
//   }
//    
//    public void getTrackDescription() {
//         this.tracks.build();
//    }
//}
