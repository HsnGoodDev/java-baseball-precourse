package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class RestartEndChoice {

    @Test
    void 타입_정합성_테스트(){
        assertThatThrownBy(() -> baseball.model.RestartEndChoice.parse("종료하시게나")).isInstanceOf(IllegalArgumentException.class);
    }
}
