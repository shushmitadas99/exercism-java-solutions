package com.revature.annalyns_infiltration;

public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake){
            return false;
        } else{
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake || archerIsAwake || prisonerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(!archerIsAwake && prisonerIsAwake) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if((petDogIsPresent && !archerIsAwake)
                || (!petDogIsPresent && prisonerIsAwake && !archerIsAwake && !knightIsAwake)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.println(canFastAttack(true));
        System.out.println(canSpy(true, false, true));
        System.out.println(canSignalPrisoner(false, true));
        System.out.println(canFreePrisoner(true, false, false, true));
    }
}
