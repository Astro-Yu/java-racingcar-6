package racingcar.Model;

import static racingcar.Constants.ErrorMessages.INVALID_DUPLICATED_MESSAGE;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {
    List<Car> cars;

    public Cars(List<Car> cars) {
        carsValidator(cars);
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    private void carsValidator(List<Car> input) {
        checkDuplicatedName(input);
    }

    private void checkDuplicatedName(List<Car> input) {
        if (isDuplicated(input)) {
            throw new IllegalArgumentException(INVALID_DUPLICATED_MESSAGE.getMessage());
        }
    }

    private boolean isDuplicated(List<Car> input) {
        Set<String> compareCars = input.stream()
                .map(Car::getCarName)
                .collect(Collectors.toSet());

        return compareCars.size() != input.size();
    }
}
