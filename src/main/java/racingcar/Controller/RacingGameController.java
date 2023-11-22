package racingcar.Controller;

import static racingcar.Model.RacingGame.decideGoAndStop;
import static racingcar.Model.RacingGame.getFinalWinner;

import java.util.List;
import racingcar.Model.Car;
import racingcar.Model.Cars;
import racingcar.Utils.Utils;
import racingcar.View.InputView;
import racingcar.View.OutputView;

public class RacingGameController {

    public void runGame() {
        List<String> carNames = InputView.getCarNames();
        int tryNumber = InputView.getTryNumber();
        Cars cars = readyGame(carNames);

        OutputView.printGameResult();
        for (int index = 0; index < tryNumber; index++) {
            runSingleRound(cars);
            OutputView.printNameAndDistance(cars);
        }

        List<String> finalWinner = getFinalWinner(cars.getCars());
        OutputView.printFinalWinner(finalWinner);
    }

    private Cars readyGame(List<String> input) {
        List<Car> carSet = input.stream()
                .map(Car::new)
                .toList();
        return new Cars(carSet);
    }

    private void runSingleRound(Cars cars) {
        List<Car> carSet = cars.getCars();
        for (Car car : carSet) {
            int randomValue = Utils.randomNumberGenerator();
            decideGoAndStop(randomValue, car);
        }
    }
}
