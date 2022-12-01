package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import racingcar.domain.RacingCount;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static racingcar.utils.ErrorMessage.*;

public class RacingCountTest {

    @ParameterizedTest
    @DisplayName("시도 회수 입력이 정수가 아니면 예외가 발생한다.")
    @ValueSource(strings = {"abc", "12.4", "3.00"})
    void createRacingCountByNotInteger(String input) {
        assertThatThrownBy(() -> new RacingCount(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(RACING_COUNT_NOT_INTEGER);
    }

    @ParameterizedTest
    @DisplayName("시도 회수 입력이 0보다 큰 정수가 아니면 예외가 발생한다.")
    @ValueSource(strings = {"-4", "0"})
    void createRacingCountByOutOfRange(String input) {
        assertThatThrownBy(() -> new RacingCount(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(RACING_COUNT_OUT_OF_RANGE);
    }
}
