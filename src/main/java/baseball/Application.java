package baseball;

import baseball.controller.BaseballController;
import baseball.model.BallGenerator;
import baseball.model.BallMatcher;
import baseball.model.BallValidator;
import baseball.view.BaseballView;

import static baseball.constant.Constant.*;
import static baseball.constant.Constant.BALL_COUNT;

public class Application {
    public static void main(String[] args) {

        BaseballController controller = new BaseballController.BaseballControllerBuilder()
                .matcher(BallMatcher.of(BALL_COUNT))
                .validator(BallValidator.of(BALL_COUNT))
                .generator(BallGenerator.of(BALL_COUNT, NUMBER_MIN, NUMBER_MAX))
                .view(BaseballView.of(BALL_COUNT))
                .build();

        controller.run();
    }
}
