package com.miranda.observer;

import com.miranda.observer.observer.chars.FireWarrior;
import com.miranda.observer.observer.chars.IceMagician;
import com.miranda.observer.observer.chars.MagicianFairy;
import com.miranda.observer.subject.SummonerMagician;

public class Main {

    public static void main(String[] args) {

        SummonerMagician master = new SummonerMagician();

        FireWarrior char01 = new FireWarrior();
        IceMagician char02 = new IceMagician();
        MagicianFairy char03 = new MagicianFairy();

        master.registerObserver(char01);
        master.registerObserver(char02);
        master.registerObserver(char03);

        master.setGeneratePower(1);
        master.setGeneratePower(3);
        master.setGeneratePower(5);

        master.removeObserver(char01);
        master.setGeneratePower(1);
        master.setGeneratePower(3);
        master.setGeneratePower(5);

        master.removeObserver(char02);
        master.setGeneratePower(1);
        master.setGeneratePower(3);
        master.setGeneratePower(5);

        master.removeObserver(char03);
        master.setGeneratePower(1);
        master.setGeneratePower(3);
        master.setGeneratePower(5);

    }
}
