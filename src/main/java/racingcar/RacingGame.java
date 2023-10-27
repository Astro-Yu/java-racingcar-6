package racingcar;

import java.util.ArrayList;

public class RacingGame {
    private final GameModel gameModel;
    private final InputView inputView;
    private final OutputView outputView;

    public RacingGame() {
        this.gameModel = new GameModel();
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    private void initializeGame() {
        OutputView.printStartMessage();
    }

    public ArrayList<Cars> insertPlayer() {
        ArrayList<Cars> players = new ArrayList<>();
        ArrayList<String> cars = inputView.getCarsName();
        for (String car : cars) {
            Cars user = new Cars(car);
            players.add(user);
        }
        return players;
    }

    private void runRacing(ArrayList<Cars> racingPlayers, int tryNumber) {
        for (int i = 0; i < tryNumber; i++) {
            gameModel.tryOneCycle(racingPlayers); // 한번 반복할때마다 나아갈지 말지 결정
            outputView.printSingleGame(racingPlayers);
            System.out.println(); // 개행
        }
    }

    public void racingGame() {
        initializeGame();

        ArrayList<Cars> racingPlayers = insertPlayer();

        OutputView.printAskTryNumber();

        int tryNumber = Integer.parseInt(inputView.getTryNumber());

        outputView.printResultMessage();

        runRacing(racingPlayers, tryNumber);

        ArrayList<String> finalWinner = gameModel.decideFinalWinner(racingPlayers);

        outputView.printFinalWinner(finalWinner);
    }
}
