import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Radio {
    private int stationsMaxQuantity;
    private int currentStation;
    private int currentVolume;


    public Radio() {
        this.stationsMaxQuantity = 10;
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