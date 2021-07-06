package com.miranda.observer.observer.chars;

import com.miranda.observer.geral.Character;
import com.miranda.observer.observer.CharObserver;

/*Registramos nossos Characters como Observadores , permitindo que esses sejam
 * adicionados a lista de Subject , implementada por SummonerMagician */
public class FireWarrior extends Character implements CharObserver {

    @Override
    public void update(int power) {
        setPower(power);
        System.out.println("O poder do FireWarrior subiu para "+getPower()+" pontos!");
    }
}
