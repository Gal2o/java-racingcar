package racingcar;

import racingcar.Console;
import java.util.List;

public class ApplicationRacingCar {
    public static void main(String[] args) {
        Console console = new Console();

        RacingCarGame racingCarGame = new RacingCarGame(console.getTryCount(),
            console.getCarNames());

        racingCarGame.playRacingCarGame();
    }

}
