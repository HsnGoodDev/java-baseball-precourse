package baseball.controller;

import baseball.model.*;
import baseball.view.BaseballView;

public class BaseballController {
    final private BallGenerator ballGenerator;
    final private BallMatcher ballMatcher;
    final private BallValidator ballValidator;
    final private BaseballView baseballView;

    /**
     * 내부 생성자
     * @param gameControllerBuilder 빌더
     */
    private BaseballController(BaseballControllerBuilder gameControllerBuilder){
        this.ballGenerator = gameControllerBuilder.ballGenerator;
        this.ballMatcher = gameControllerBuilder.ballMatcher;
        this.ballValidator = gameControllerBuilder.ballValidator;
        this.baseballView = gameControllerBuilder.baseballView;
    }

    /**
     * 빌더 클래스
     */
    public static class BaseballControllerBuilder{
        private BallMatcher ballMatcher;
        private BallValidator ballValidator;
        private BallGenerator ballGenerator;
        private BaseballView baseballView;

        public BaseballControllerBuilder matcher(BallMatcher ballMatcher){
            this.ballMatcher = ballMatcher;
            return this;
        }
        public BaseballControllerBuilder validator(BallValidator ballValidator){
            this.ballValidator = ballValidator;
            return this;
        }
        public BaseballControllerBuilder generator(BallGenerator ballGenerator){
            this.ballGenerator = ballGenerator;
            return this;
        }
        public BaseballControllerBuilder view(BaseballView baseballView){
            this.baseballView = baseballView;
            return this;
        }

        public BaseballController build(){
            return new BaseballController(this);
        }
    }

    /**
     * game 진행
     */
    public void run(){
        do{
            play(ballGenerator.getComputerNumber());
        }while (!RestartEndChoice.END.equals(RestartEndChoice.parse(baseballView.restartQuestion())));
    }

    /**
     *  game play
     * @param computer 랜덤값
     */
    private void play(Integer computer) {
        GameScore gameScore;
        do{
            String player = baseballView.inputPlayer();
            ballValidator.validateBall(player);
            gameScore= ballMatcher.match(computer.toString(), player);
            baseballView.matchResult(gameScore.countBall(), gameScore.countStrike());
        }while (!gameScore.isWin());
        baseballView.winEnding();
    }
}
