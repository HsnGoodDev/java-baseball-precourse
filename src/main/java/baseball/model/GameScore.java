package baseball.model;

public class GameScore {
    private final int length;
    private final int ball;
    private final int strike;

    /**
     * GameScore 생성자
     *
     * @param length 길이
     * @param ball 볼
     * @param strike 스트라이크
     * */
    private GameScore(int length, int ball, int strike){
        this.length = length;
        this.ball = ball;
        this.strike = strike;
    }

    /**
     * GameScore 객체 생성
     * @param length 길이
     * @param ball 볼
     * @param strike 스트라이크
     * */
    static public GameScore of(int length, int ball, int strike){
        return new GameScore(length, ball, strike);
    }

    /**
     * Full Strike
     *
     * @return 승리여부
     * */
    public boolean isWin(){
        return strike == length;
    }

    /**
     * Strike 수
     *
     * @return strike 수
     * */
    public int countStrike(){
        return this.strike;
    }

    /**
     * ball 수
     *
     * @return ball 수
     */
    public int countBall(){
        return this.ball;
    }
}
