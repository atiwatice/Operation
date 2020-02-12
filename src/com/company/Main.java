package com.company;

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

    }
}
