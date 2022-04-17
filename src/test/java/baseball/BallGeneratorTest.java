package baseball;

import baseball.model.BallGenerator;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallGeneratorTest {
    @Test
    void 볼_생성_테스트(){
        Integer computer = BallGenerator.of(3,1,9).getComputerNumber();
        assertThat(computer > 100 && computer < 1000).isTrue(); //3자리
        String computerString = String.valueOf(computer);
        assertThat(!computerString.contains("0")).isTrue();// 0포함

    }
    @Test
    void 컴퓨터_볼_중복_테스트(){
        Integer computer = BallGenerator.of(3,1,9).getComputerNumber();
        String target = String.valueOf(computer);
        Set<Character> set = new HashSet<>();
        for(int i=0; i<target.length() ;i++){
            set.add(target.charAt(i));
        }
        assertThat(set.size() == 3).isTrue();
    }
}
