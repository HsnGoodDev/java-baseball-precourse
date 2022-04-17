package baseball.model;

import java.util.HashSet;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class BallGenerator {

    private final int length;
    private final int min;
    private final int max;

    /**
     * Ball 생성자
     * @param length 길이
     * @param min 최소
     * @param max 최대
     * */
    private BallGenerator(int length, int min, int max){
        this.length = length;
        this.min = min;
        this.max = max;
    }

    /**
     * Ball 생성 객체 생성 함수
     * @param length 길이
     * @param min 최소
     * @param max 최대
     * @return 생성된 BallGenerator
     * */
    static public BallGenerator of(int length, int min, int max){
        return new BallGenerator(length, min, max);
    }

    /**
     * computer 숫자 생성
     * @return 숫자
     */
    public Integer getComputerNumber(){
        Set<Integer> computer = new HashSet<>();
        int reusltNumber = 0;
        while(computer.size() < length){
            Integer ball = pickNumber(computer, min, max);
            computer.add(ball);
            reusltNumber += Math.pow(10, (length - computer.size())) * ball;
        }
        return reusltNumber;
    }

    /**
     * number 추출
     * @param computer 컴퓨터
     * @param min 최소
     * @param max 최대
     * @return 컴퓨터 볼
     */
    private Integer pickNumber(Set<Integer> computer, int min, int max) {
        Integer pick;
        do{
            pick = pickNumberInRange(min, max);
        }while (computer.contains(pick));
        return pick;
    }
}
