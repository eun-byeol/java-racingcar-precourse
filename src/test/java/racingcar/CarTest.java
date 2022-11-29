package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.Car;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static racingcar.utils.ErrorMessage.*;

public class CarTest {
    @ParameterizedTest
    @DisplayName("자동차 이름이 1자 이상 5자 이하가 아니면 예외가 발생한다.")
    @ValueSource(strings = {"abcdef", ""})
    void createLineUpByNotEnglish(String input) {
        assertThatThrownBy(() -> new Car(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(CAR_NAME_SIZE_OUT_OF_RANGE);
    }
}
