package racingcar.view;

import static racingcar.utils.ViewMessages.*;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String readCarNames() {
        System.out.println(INPUT_CAR_NAMES);
        return Console.readLine();
    }

    public static String readRacingCount() {
        System.out.println(INPUT_RACING_COUNT);
        return Console.readLine();
    }
}
