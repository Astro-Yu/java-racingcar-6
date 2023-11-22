package racingcar.Model;

import static racingcar.Constants.Constants.BOUNDARY_VALUE;

import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    public static List<String> getFinalWinner(List<Car> input) {
        int maxDistance = input.stream()
                .map(Car::getDistance)
                .mapToInt(x -> x)
                .max()
                .orElseThrow();

        return input.stream()
                .filter(x -> x.getDistance() == maxDistance)
                .map(Car::getCarName)
                .collect(Collectors.toList());

    }

    public static void decideGoAndStop(int input, Car car) {
        if (movable(input)) {
            car.goOneStep();
        }
    }

    private static boolean movable(int input) {
        return input >= BOUNDARY_VALUE;
    }
}
