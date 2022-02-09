package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCar {

    private int carDist;
가    private final String carName;
    private static final int INIT_DIST = 0;
    private static final int MOVABLE = 4;

    private static final MovingCar moveCar = new MovingCar();

    private RacingCar(String carName) {
        this.carName = carName;
        carDist = INIT_DIST;
    }

    public static List<RacingCar> setRacingCars(List<String> carNames) {
        return carNames.stream()
            .map(RacingCar::new)
            .collect(Collectors.toList());
    }

    public void moveCar(MoveStrategy moveStrategy) {
        if (moveStrategy.availMoveValue() >= MOVABLE) {
            carDist++;
        }
    }

    public String getCarName() {
        return carName;
    }

    public int getCarDist() {
        return carDist;
    }
}
