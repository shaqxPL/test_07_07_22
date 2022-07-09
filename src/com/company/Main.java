package com.company;

public class Main {

    public static void main(String[] args) {
	helloWorld();
        System.out.println("wynik to: " + getSum(1,2,3));
        getSum_2(1,2,3);
        System.out.println("wynik to: " + getSum_3(1,2,3));
        System.out.println("wynik to: " + getSum_4(1,2,3));
    }


    public static int getSum(int one, int two, int three){
        int sum = one + two + three;
        return sum;
    }

    public static void getSum_2(int one, int two, int three){
        int sum = one + two + three;
        System.out.println("wynik to: " + sum);
    }

    public static int getSum_3(int one, int two, int three){
        return one + two + three;
    }

    public static int getSum_4(int ... numbers){
        int sum = 0;
        for (int x: numbers){
            sum = sum + x;
        }
        return sum;
    }



    public static void helloWorld(){
        System.out.println("hello");
    }

}
