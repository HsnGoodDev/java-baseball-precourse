package baseball;

import baseball.model.BallMatcher;
import baseball.model.GameScore;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallMatcherTest {
    @Test
    void 점수계산기_3스트라이크_테스트(){
        //full strike
        GameScore score = BallMatcher.of(3).match("123", "123");
        assertThat(score.countBall()).isEqualTo(0);
        assertThat(score.countStrike()).isEqualTo(3);
        assertThat(score.isWin()).isTrue();
    }

    @Test
    void 점수계산기_2볼_테스트(){
        //full strike
        GameScore score = BallMatcher.of(3).match("345", "563");
        assertThat(score.countBall()).isEqualTo(2);
        assertThat(score.countStrike()).isEqualTo(0);
        assertThat(score.isWin()).isFalse();
    }

    @Test
    void 점수계산기_3볼_테스트(){
        //full strike
        GameScore score = BallMatcher.of(3).match("345", "534");
        assertThat(score.countBall()).isEqualTo(3);
        assertThat(score.countStrike()).isEqualTo(0);
        assertThat(score.isWin()).isFalse();
    }


    @Test
    void 점수계산기_1스트라이크_테스트(){
        //full strike
        GameScore score = BallMatcher.of(3).match("123", "198");
        assertThat(score.countBall()).isEqualTo(0);
        assertThat(score.countStrike()).isEqualTo(1);
        assertThat(score.isWin()).isFalse();
    }

    @Test
    void 점수계산기_2스트라이크_테스트(){
        //full strike
        GameScore score = BallMatcher.of(3).match("123", "128");
        assertThat(score.countBall()).isEqualTo(0);
        assertThat(score.countStrike()).isEqualTo(2);
        assertThat(score.isWin()).isFalse();
    }

    @Test
    void 점수계산기_0볼_0스트라이크_테스트(){
        //full strike
        GameScore score = BallMatcher.of(3).match("123", "456");
        assertThat(score.countBall()).isEqualTo(0);
        assertThat(score.countStrike()).isEqualTo(0);
        assertThat(score.isWin()).isFalse();
    }
}
