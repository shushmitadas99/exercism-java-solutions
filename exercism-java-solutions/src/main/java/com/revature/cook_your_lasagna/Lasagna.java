package com.revature.cook_your_lasagna;

public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven() {
        int expectedTime = 40;
        return expectedTime;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int minutes) {
        int elapsedTime = minutes;
        int expectedTime = expectedMinutesInOven();
        int remainingTime = expectedTime - elapsedTime;

        if(remainingTime >= 0) {
            return remainingTime;
        } else{
            return 0;
        }
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layers) {
        if (layers > 0) {
            int prepTime = layers * 2;
            return prepTime;
        } else{
            return 0;
        }
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layers, int elapsedTime) {
        int totalTime = preparationTimeInMinutes(layers) + elapsedTime;
        if (totalTime >= 0) {
            return totalTime;
        } else {
            return 0;
        }
    }

    //TODO: Driver method
    public static void main(String args[]) {
        System.out.println(expectedMinutesInOven());
        System.out.println(remainingMinutesInOven(30));
        System.out.println(preparationTimeInMinutes(3));
        System.out.println(totalTimeInMinutes(3, 21));
    }
}
