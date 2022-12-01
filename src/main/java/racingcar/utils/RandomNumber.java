package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {
    public static final int MIN_NUMBER = 0;
    public static final int MAX_NUMBER = 9;

    public static int pickRandomNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }
}

