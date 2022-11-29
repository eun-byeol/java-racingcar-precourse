package racingcar;

import static racingcar.utils.ErrorMessage.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.RacingcarGame;

public class RacingcarGameTest {

    @ParameterizedTest
    @DisplayName("자동차 이름 입력이 영문자가 아니면 예외가 발생한다.")
    @ValueSource(strings = {"p iv, df", "d1,33d", "ㄴ,ㄷ,a", "하하,abc"})
    void createLineUpByNotEnglish(String input) {
        assertThatThrownBy(() -> new RacingcarGame().createLineUp(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(CAR_NAME_NOT_ENGLISH);
    }
}
