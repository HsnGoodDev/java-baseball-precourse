package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import static baseball.constant.Constant.*;

public class BaseballView {

    private final int length;

    /**
     * 생성자
     * @param length 길이
     */
    private BaseballView(int length){
        this.length = length;
    }

    /**
     * 생성 함수
     * @param length 길이
     * @return Baseball view
     */
    static public BaseballView of(int length){
        return new BaseballView(length);
    }

    /**
     * 결과 출력
     * @param ball 볼
     * @param strike 길이
     */
    public void matchResult(int ball, int strike){
        if(ball >0){
            System.out.printf((BALL_MESSAGE) + "%n", ball);
        }
        if(strike >0){
            System.out.printf((STRIKE_MESSAGE) + "%n", strike);
        }
        if(ball < 1 && strike < 1){
            System.out.println(NOTHING_MESSAGE);
        }
        System.out.println();
    }

    /**
     * 게임 승리 후 엔딩
     */
    public void winEnding(){
        System.out.println(GAME_END_MESSAGE);
    }

    /**
     * 새로 시작할지 답
     * @return 사용자 입력
     */
    public String restartQuestion(){
        System.out.println(RESTART_END_MESSAGE);
        return Console.readLine();
    }

    /**
     * 입력 가이드 후 입력
     * @return 사용자 입력
     */
    public String inputPlayer(){
        System.out.println(INPUT_GUIDE);
        return Console.readLine();
    }
}
