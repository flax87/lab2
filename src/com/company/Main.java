/*
 * @author  Oleksii Shevchenko KNUTE 1m
 *
 * Laboratory Work No.2. (6 points)
 *
 *@version 22.06.20
 *
 *
 * Topic: Object-oriented programming,  JavaCollectionFramework

Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.

Six methods must be written like in the following example. A point for each one.

Creative approaches are welcome.

EXAMPLE

 A company contains two types of employees:  full-time and  part-time ones.
1. Create two appropriate classes and 5 objects of each one.
2. Calculate   the total salary of a month.
3. Find the highest salary employee.
4. Find he lowest salary employee
5.  The average salary.
6. Who get more salary, part-time or full-time employees?

/----------------  Subjects according to your number ------------------
8. Hotel: only bed  and lux.
 *
 */

package com.company;

import mod.Lux;
import mod.OnlyBad;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        OnlyBad P1 = new OnlyBad("P1", 5000);           //Only Bad
        OnlyBad P2 = new OnlyBad("P2", 5000);
        OnlyBad P3 = new OnlyBad("P3", 5000);
        OnlyBad P4 = new OnlyBad("P4", 5000);


        Lux L1 = new Lux("Royal palace",30000,5);           //Luxary rooms
        Lux L2 = new Lux("Giant room",60000,4);
        Lux L3 = new Lux("Stone world",50000,5);
        Lux L4 = new Lux("Wild West",40000,3);
        Lux L5 = new Lux("Royal palace",70000,5);
        Lux L6 = new Lux("Garage",4000000,3);




        List<PRiceList> rooms = new ArrayList<>();
        rooms.add(P1);
        rooms.add(P2);
        rooms.add(P3);
        rooms.add(P4);

        rooms.add(L1);
        rooms.add(L2);
        rooms.add(L3);
        rooms.add(L4);
        rooms.add(L5);
        rooms.add(L6);


        int salary = rooms.stream().mapToInt(PRiceList::getPriceForTheDay).sum();


        PRiceList highestPriceRoom = rooms.stream()
                .max(Comparator.comparing(PRiceList::getPriceForTheDay))
                .orElse(null);

        PRiceList lowestPriceRoom = rooms.stream()
                .min(Comparator.comparingInt(PRiceList::getPriceForTheDay))
                .orElse(null);

        double average = rooms.stream().mapToInt(PRiceList::getPriceForTheDay)
                .average().orElse(0);

        int onlyBadPrice = rooms.stream().filter(el -> el instanceof OnlyBad)
                .mapToInt(PRiceList::getPriceForTheDay).sum();

        int luxPrice = rooms.stream().filter(el -> el instanceof Lux)
                .mapToInt(PRiceList::getPriceForTheDay).sum();

        if ( luxPrice > onlyBadPrice) {
            System.out.println("Luxury rooms bring more profit than " +
                    "rooms with one bed");
        } else {
            System.out.println("Luxury best");
        }



    }
}
