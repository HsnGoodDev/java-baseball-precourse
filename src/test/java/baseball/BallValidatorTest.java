package baseball;

import baseball.model.BallValidator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallValidatorTest {
    @Test
    void 입력길이_테스트(){
        BallValidator ballValidator = BallValidator.of(3);
        assertThatThrownBy(()->ballValidator.validateBall("1234")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 중복_테스트(){
        BallValidator ballValidator = BallValidator.of(3);
        assertThatThrownBy(()->ballValidator.validateBall("111")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 영체크_테스트(){
        BallValidator ballValidator = BallValidator.of(3);
        assertThatThrownBy(()->ballValidator.validateBall("109")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자체크_테스트(){
        BallValidator ballValidator = BallValidator.of(3);
        assertThatThrownBy(()->ballValidator.validateBall("1t9")).isInstanceOf(IllegalArgumentException.class);
    }
}
