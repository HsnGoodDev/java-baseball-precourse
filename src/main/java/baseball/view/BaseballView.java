package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import static baseball.constant.Constant.*;
import static java.lang.String.format;

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

        if(ball > 0 && strike > 0){
            printTwo(ball, strike);
        }
        if(ball < 1 && strike < 1){
            System.out.println(NOTHING_MESSAGE);
        }
        print(ball, BALL_MESSAGE);
        print(strike, STRIKE_MESSAGE);
        System.out.println();
    }

    /**
     * ball 과 strike 출력
     * @param count 수
     * @param unit  단위
   위 */
    private void print(int count, String unit) {
        if(count > 0){
            System.out.println(count + unit +" ");
        }
    }

    /**
     * ball 과 strike 출력
     * @param ball 볼 수
     * @param strike 스트라이크 수
     */
    private void printTwo(int ball, int strike) {
        System.out.println(ball + BALL_MESSAGE + " " + strike + STRIKE_MESSAGE + " ");
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
