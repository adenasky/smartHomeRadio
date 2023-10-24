public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsMaxQuantity;

    public Radio() {
        this.stationsMaxQuantity = 10;
    }

    public Radio(int stationsQuantity) {
        this.stationsMaxQuantity = stationsQuantity;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= 0 && newCurrentStation < stationsMaxQuantity) {
            currentStation = newCurrentStation;
        }
    }

    public void next() {
        if (currentStation == (stationsMaxQuantity - 1)) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationsMaxQuantity - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}