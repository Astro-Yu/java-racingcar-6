package racingcar.Model;

import static racingcar.Constants.Constants.INITIAL_DISTANCE;
import static racingcar.Constants.ErrorMessages.INVALID_NAME_LENGTH_MESSAGES;

public class Car {
    private final String carName;
    private int distance;

    public Car(String carName) {
        carNameValidator(carName);
        this.carName = carName;
        this.distance = INITIAL_DISTANCE;
    }

    public void goOneStep() {
        ++distance;
    }

    public String getCarName() {
        return this.carName;
    }

    public int getDistance() {
        return this.distance;
    }

    private void carNameValidator(String input) {
        checkCarName(input);
    }

    private void checkCarName(String input) {
        if (!properNameLength(input)) {
            throw new IllegalArgumentException(INVALID_NAME_LENGTH_MESSAGES.getMessage());
        }
    }

    private boolean properNameLength(String input) {
        return !input.isEmpty() && input.length() <= 5;
    }
}
