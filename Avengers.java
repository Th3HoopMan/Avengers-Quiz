package com.example.joseph.avengersquiz;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by Joseph on 6/9/2015.
 */
public class Avengers implements Serializable{

    //0.Iron Man
    //1.Thor
    //2.Captain America
    //3.Hulk
    //4.Hawk Eye
    //5.Black Widow
    //6.Scarlet Witch
    //7.Quicksilver
    //8.Ultron

    int[] superheroScoreSheet = new int[9];
    String currentHero = "Iron Man";
    Random randInt = new Random();
    int num = 0;

    //Constructor
    public Avengers() {
    }

    //Sets current hero
    private void setCurrentHero(String currentHero) {
        this.currentHero = currentHero;
    }

    //Gets name of current hero
    public String getCurrentHero() {
        return currentHero;
    }

    //assigns a hero name based on num input
    private void heroAssignment(int x) {
        switch (x) {
            case 0:
                setCurrentHero("Iron Man");
                break;
            case 1:
                setCurrentHero("Thor");
                break;
            case 2:
                setCurrentHero("Captain America");
                break;
            case 3:
                setCurrentHero("Hulk");
                break;
            case 4:
                setCurrentHero("Hawk Eye");
                break;
            case 5:
                setCurrentHero("Black Widow");
                break;
            case 6:
                setCurrentHero("Scarlet Witch");
                break;
            case 7:
                setCurrentHero("Quicksilver");
                break;
            case 8:
                setCurrentHero("Ultron");
                break;
        }
    }

    //calculates your hero
    public void calculateHero(){
        int heroVotes= 0;

        for (int x = 0; x < superheroScoreSheet.length; x++) {
            if (superheroScoreSheet[x] > heroVotes) {
                heroAssignment(x);
                heroVotes = superheroScoreSheet[x];
            } else if (superheroScoreSheet[x] == heroVotes) {
                int evenOrOdd = randInt.nextInt(2);
                if ((evenOrOdd % 2) == 0) {
                    heroAssignment(x);
                }
            }
        }
    }

    //Increases the votes by a specified amounts for the hero at the specified position
    public void increaseVotesfor(int heroPos, int byHowMany) {
        superheroScoreSheet[heroPos]+= byHowMany;
        calculateHero();
    }

    public void zeroOut() {
        for (int item: superheroScoreSheet){
            superheroScoreSheet[item] = 0;
        }
    }
}
