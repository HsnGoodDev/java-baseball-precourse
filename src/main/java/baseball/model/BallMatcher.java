package baseball.model;

import java.util.HashSet;
import java.util.Set;

public class BallMatcher {

    private final int lenght;

    /**
     * 내부 생성자
     *
     * @param lenght 매칭 숫자 길이
     */
    private BallMatcher(int lenght){
        this.lenght = lenght;
    }

    /**
     * 객체 생성 함수
     * @param lenght 매칭 숫자 길이
     * @return 생성된 객체
     */
    static public BallMatcher of(int lenght){
        return new BallMatcher(lenght);
    }

    public GameScore match(String computer, String player){
        int strike = getStrike(computer, player);
        int ball = getBall(getSameCharacterCount(computer, player), strike);
        return GameScore.of(lenght, ball, strike);
    }

    /**
     * str2개가 겹치는 숫자 갯수 반환
     * @param str1 비교 숫자
     * @param str2 비교 숫자
     * @return 겹치는 숫자 갯수
     */
    int getSameCharacterCount(String str1, String str2){
        Set<Character> set = new HashSet<>();
        for(int i=0; i<lenght; i++){
            set.add(str1.charAt(i));
            set.add(str2.charAt(i));
        }
        return str1.length() + str2.length() - set.size();
    }

    /**
     * ball 수
     * @param sameCharcterCount 겸치는 수
     * @param strike 스트라이크 수
     * @return ball 수
     */
    int getBall(int sameCharcterCount, int strike) {
        return sameCharcterCount-strike;
    }

    /**
     * strike 수
     * @param computer 컴퓨터
     * @param player 플레이어
     * @return strike 수
     */
    int getStrike(String computer, String player){
        return getPerfectMatching(computer, player);
    }

    /**
     * 자리와 숫자가 완벽하게 일치하는 수
     * @param computer 컴퓨터
     * @param player 플레이어
     * @return 수
     */
    private int getPerfectMatching(String computer, String player) {
        int strike = 0;
        int minLength = Math.min(computer.length(), player.length());
        for(int i = 0; i<minLength; i++){
            strike += isSameBall(computer.charAt(i), player.charAt(i)) ? 1: 0;
        }
        return strike;
    }

    /**
     * 동일한지 체크
     * @param ch1 볼
     * @param ch2 볼
     * @return 같으면 ture, 다르면 false
     */
    private boolean isSameBall(char ch1, char ch2) {
        return ch1 == ch2;
    }
}
