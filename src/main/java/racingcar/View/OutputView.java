package racingcar.View;

import static racingcar.Constants.Constants.COLON;
import static racingcar.Constants.Constants.DASH;
import static racingcar.Constants.OutputMessages.FINAL_WINNER;
import static racingcar.Constants.OutputMessages.GAME_RESULT;

import java.util.List;
import racingcar.Model.Car;
import racingcar.Model.Cars;

public class OutputView {

    public static void printGameResult() {
        System.out.println(GAME_RESULT);
    }

    public static void printNameAndDistance(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getCarName() + COLON + DASH.repeat(car.getDistance()));
        }
        System.out.println();
    }

    public static void printFinalWinner(List<String> winners) {
        System.out.printf(FINAL_WINNER);
        for (int i = 0; i < winners.size(); i++) {
            System.out.printf(winners.get(i));
            if (i != winners.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
