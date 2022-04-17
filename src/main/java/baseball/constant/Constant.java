package baseball.constant;

import static java.lang.String.format;

public class Constant {
    public static final int NUMBER_MIN = 1;
    public static final int NUMBER_MAX = 9;
    public static final int BALL_COUNT = 3;

    public static final String ZERO = "0";
    public static final String RANGE_ERROR = format("Ball은 %d 이상 %d 이하여야 합니다.", NUMBER_MIN, NUMBER_MAX);
    public static final String COUNT_ERROR = format("입력된 Ball은 %d개여야 합니다.", BALL_COUNT);
    public static final String DUPLICATE_ERROR = "Ball의 숫자는 중복될 수 없습니다.";
    public static final String DIGIT_ERROR = "Ball은 숫자만 입력가능합니다.";
    public static final String RESTART_END_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String INPUT_GUIDE = "숫자를 입력해주세요 : ";
    public static final String RESTART_END_WARNING = "입력은 1혹은 2여야 합니다.";
    public static final String NOTHING_MESSAGE = "낫싱";
    public static final String BALL_MESSAGE = "%d 볼";
    public static final String STRIKE_MESSAGE ="%d 스트라이크";
    public static final String GAME_END_MESSAGE = "\n3개의 숫자를 모두 맞히셨습니다 축하합니다. 게임종료";

}
