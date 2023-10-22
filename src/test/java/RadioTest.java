import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void changeStationToNextFromNine() { //Текущая радиостанция 9 => кнопка next => текущая 0
        Radio service = new Radio();
        service.setCurrentStation(9);

        service.next();

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeStationToNext() { //Текущая радиостанция 0 => кнопка next => текущая 1
        Radio service = new Radio();
        service.setCurrentStation(0);

        service.next();

        int expected = 1;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeStationToPrevFromZero() { //Текущая радиостанция 0 => кнопка prev => текущая 9
        Radio service = new Radio();
        service.setCurrentStation(0);

        service.prev();

        int expected = 9;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeStationToPrev() { //Текущая радиостанция 1 => кнопка prev => текущая 0
        Radio service = new Radio();
        service.setCurrentStation(1);

        service.prev();

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void manualStationChangeMiddleValue() { //Текущая радиостанция 1 => переключили на 5 => текущая 5
        Radio service = new Radio();
        service.setCurrentStation(1);

        service.setCurrentStation(5);

        int expected = 5;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void manualStationChangeBoundariesMin() { //Текущая радиостанция 1 => переключили на 0 => текущая 0
        Radio service = new Radio();
        service.setCurrentStation(1);

        service.setCurrentStation(0);

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void manualStationChangeBoundariesMax() {//Текущая радиостанция 1 => переключили на 9 => текущая 9
        Radio service = new Radio();
        service.setCurrentStation(1);

        service.setCurrentStation(9);

        int expected = 9;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void manualStationChangeValueOutOfRange() {//Текущая радиостанция 1 => переключили на 12 => текущая 1
        Radio service = new Radio();
        service.setCurrentStation(1);

        service.setCurrentStation(12);

        int expected = 1;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void manualStationChangeNegativeValue() {//Текущая радиостанция 1 => переключили на -1 => текущая 1
        Radio service = new Radio();
        service.setCurrentStation(1);

        service.setCurrentStation(-1);

        int expected = 1;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMiddleValue() { //Текущая громкость 50 => кнопка "+" => текущая 51
        Radio service = new Radio();
        service.setCurrentVolume(50);

        service.increaseVolume();

        int expected = 51;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMaxValue() { //Текущая громкость 100 => кнопка "+" => текущая 100
        Radio service = new Radio();
        service.setCurrentVolume(100);

        service.increaseVolume();

        int expected = 100;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMiddleValue() { //Текущая громкость 50 => кнопка "-" => текущая 49
        Radio service = new Radio();
        service.setCurrentVolume(50);

        service.decreaseVolume();

        int expected = 49;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMinValue() { //Текущая громкость 0 => кнопка "-" => текущая 0
        Radio service = new Radio();
        service.setCurrentVolume(0);

        service.decreaseVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}