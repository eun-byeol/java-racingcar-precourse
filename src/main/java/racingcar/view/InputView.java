package racingcar.view;

import static racingcar.utils.ViewMessages.*;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readCarNames() {
    System.out.println(INPUT_CAR_NAMES);
    return Console.readLine();
    }

    public String readRacingCount() {
        System.out.println(INPUT_RACING_COUNT);
        return Console.readLine();
    }
}
