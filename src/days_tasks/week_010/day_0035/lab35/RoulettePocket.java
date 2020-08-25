package days_tasks.week_010.day_0035.lab35;
/*On a roulette wheel, the pockets are numbered from 0 to 36.

The colors of the pockets are as follows:Pocket 0 is green.
For pockets 1 through 10, the odd-numbered pockets are red and the even-numbered pockets are black.
For pockets 11 through 18, the odd-numbered pockets are black and the even-numbered pockets are red.
For pockets 19 through 28, the odd-numbered pockets are red and the even-numbered pockets are black.
For pockets 29 through 36, the odd-numbered pockets are black and the even-numbered pockets are red.
 */

/*
Write a class named RoulettePocket.

The class's constructor should accept a pocket number.
The class should have a method named getPocketColor that returns the pocket's color, as a string.
Demonstrate the class in a program that asks the user to enter a pocket number, and displays whether the pocket is green, red, or black.
The program should display an error message if the user enters a number that is outside the range of 0 and 36.
 */

import java.util.Scanner;

public class RoulettePocket {
    private String color;
    private int number;

    public RoulettePocket(){
//        Scanner numScan = new Scanner(System.in);
//        System.out.println("Input a number");
//        setNumber(numScan.nextInt());
        setColor(this.color,this.number);
        System.out.println(getPocketColor());
    }
    public String getColor() {
        if(number==0){
            this.color = "green";
        }
        else if ((number > 0  && number< 11)||(number > 18  && number< 29)) {
            if(number%2==0){
                this.color = "black";
            }else {this.color = "red";}
        }
        else if ((number > 10  && number< 19)||(number > 28  && number< 36)){
            if(number%2==0){
                this.color = "red";
            }else {this.color = "black";}
        }
        return color;
    }

    private void setColor(String color,int number) {
        if(number==0){
            this.color = "green";
        }
        else if ((number > 0  && number< 11)||(number > 18  && number< 29)) {
            if(number%2==0){
                this.color = "black";
            }else {this.color = "red";}
        }
        else if ((number > 10  && number< 19)||(number > 28  && number< 36)){
            if(number%2==0){
                this.color = "red";
            }else {this.color = "black";}
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number<0||number>36){
            System.out.println("Error, please input again");
            new RoulettePocket();
        }else{
            this.number = number;
        }
    }

    public String getPocketColor(){
        setColor("",number);
        return "for your number "+ this.number +" Color is "+this.color;
    }
}
