package com.miranda.observer.subject;

import com.miranda.observer.observer.CharObserver;

import java.util.ArrayList;
import java.util.List;

/* Segundo nossa regra de negócio , o nosso SummonerMagician pode controlar Chars e aumentar os
 * seus poderes . O padrão Observer será usado para que assim que os poderes forem adicionados ao
 * Summoner , os seus chars controlados recebem esse poder. */

public class SummonerMagician implements Subject {

    private List<CharObserver> listOfChars ;
    private int generatePower = 0 ;

    public SummonerMagician(){
        listOfChars = new ArrayList<>();
    }

    @Override
    public void registerObserver(CharObserver observer) {
        listOfChars.add(observer);
    }

    @Override
    public void removeObserver(CharObserver observer) {
        int i =  listOfChars.indexOf(observer);
        if(i>=0){
            listOfChars.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(CharObserver observer:listOfChars)
           observer.update(generatePower);
    }

    public int getGeneratePower() {
        return generatePower;
    }

    /*Aqui é onde a mágica acontece. Ao alterarmos o valor que esta sendo
    * monitorado pelos observers , chamamos o método notifyObservers , responsável
    * por chamar o método update de cada char registrado em nossa lista*/
    public void setGeneratePower(int generatePower) {
        this.generatePower += generatePower;
        notifyObservers();
    }
 }

