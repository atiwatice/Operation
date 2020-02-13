package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
	    int result = 1+2;
        System.out.println(result);
        int previousValue = result;
        System.out.println("Previous value = "+previousValue);
        result = result-1;
        System.out.println(result);
        System.out.println("Previous value = "+previousValue);
        result = result*20;
        System.out.println(result);
        result = result/5;
        System.out.println(result);
        System.out.println("Previous Result = "+previousValue);
        result = result%3;
        System.out.println(result);
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result+=2;
        System.out.println(result);
        result*=2;
        System.out.println(result);
        result/=4;
        System.out.println(result);
        result-=2;
        System.out.println(result);
        boolean isAlien = false;
        if(isAlien==true) {
            System.out.println("is not Alien");
            System.out.println("-----");
        }else{
            System.out.println("ice");
        }
        int topScore = 80;
        if(topScore<=100){
            System.out.println("You got a high score");
        }
        int secondTopscore = 60;
        if((topScore>secondTopscore) && (topScore<100)){
            System.out.println("Greater than second top score");
        }

        if((topScore>90)||(secondTopscore<=90)){
            System.out.println("either or both are true");
        }
        int newValue = 50;
        if(newValue==50){
            System.out.println("This is true");
        }
        boolean isCar =false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true:false;
        
        if(wasCar){
            System.out.println("This is car");
        }


    }
}
