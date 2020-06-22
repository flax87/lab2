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
package mod;

import com.company.PRiceList;

public class OnlyBad implements PRiceList {

    private String name;
    private int price;



    //constructor


    public OnlyBad() {
    }

    public OnlyBad(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //get & set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //toString
    @Override
    public String toString() {
        return "OnlyBad{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    //interface "PRiceList"
    @Override
    public int getPriceForTheDay() {
        return this.getPrice();
    }
}
