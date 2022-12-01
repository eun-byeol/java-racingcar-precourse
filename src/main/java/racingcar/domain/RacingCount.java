package racingcar.domain;

import static racingcar.utils.ErrorMessage.*;

public class RacingCount {
    private final int count;

    public RacingCount(String input) {
        validateInteger(input);
        int count = Integer.parseInt(input);
        validateRange(count);
        this.count = count;
    }
    private void validateInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException(RACING_COUNT_NOT_INTEGER);
        }
    }

    private void validateRange(int count) {
        if (count < 1) {
            throw new IllegalArgumentException(RACING_COUNT_OUT_OF_RANGE);
        }
    }

    public int getCount() {
        return count;
    }
}
