package baseball.model;

import java.util.HashSet;
import java.util.Set;

import static baseball.constant.Constant.*;

public class BallValidator {
    private final int length;

    /**
     * 생성자
     * @param length 길이
     */
    private BallValidator(int length){
        this.length = length;
    }

    /**
     * 생성자 함수
     * @param length 받은 볼
     * @return validator 객체
     */
    static public BallValidator of(int length){
        return new BallValidator(length);
    }

    public void validateBall(String target){

        isNoZero(target);
        isLengthOk(target);
        isDigit(target);
        isDuplicate(target);
    }

    /**
     * 중복 체크
     * @param target 받은 볼
     */
    public void isDuplicate(String target){
        Set<Character> set = new HashSet<>();
        for(int i=0; i<target.length() ;i++){
            set.add(target.charAt(i));
        }

        if(set.size() != length){
            throw new IllegalArgumentException(DUPLICATE_ERROR);
        }
    }

    /**
     * 0 포함되어 있는 지 확인
     * @param target 받은 볼
     */
    public void isNoZero(String target){
        if(target.contains(ZERO)){
            throw new IllegalArgumentException(RANGE_ERROR);
        }
    }

    /**
     * 길이 확인
     * @param target 받은 볼
     */
    public void isLengthOk(String target){
        if(target.length() != length){
            throw new IllegalArgumentException(COUNT_ERROR);
        }
    }

    /**
     * 숫자 외 입력 확인
     * @param target 받은 볼
     */
    public void isDigit(String target){
        if(!target.chars().allMatch(Character::isDigit)){
            throw new IllegalArgumentException(DIGIT_ERROR);
        }
    }
}
