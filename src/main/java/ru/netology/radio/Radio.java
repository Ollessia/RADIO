package ru.netology.radio;

public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;
    private int maxCaunt;
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public  Radio(int Cnt) {
        if (Cnt>1) {  maxCaunt = Cnt-1;}
        else {maxCaunt = 9;
        }


    }
    public  Radio() {
        maxCaunt = 9;
     }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentStation < maxCaunt) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxCaunt;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxCaunt) {
            return;
        }
        this.currentStation = currentStation;
    }


}
