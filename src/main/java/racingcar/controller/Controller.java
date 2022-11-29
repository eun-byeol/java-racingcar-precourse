package racingcar.controller;

import racingcar.domain.CarLineUp;
import racingcar.domain.RacingCount;

import static racingcar.view.InputView.*;

public class Controller {

    public void runGame() {
        CarLineUp carLineUp = inputCars();
        final RacingCount gameCount = inputGameCount();
    }

    private CarLineUp inputCars() {
        while(true) {
            try {
                return new CarLineUp(readCarNames());
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private RacingCount inputGameCount() {
        while(true) {
            try {
                return new RacingCount(readRacingCount());
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

/*

1. input
2. run
3. print
4. repeat
5. winner
6. print

 */