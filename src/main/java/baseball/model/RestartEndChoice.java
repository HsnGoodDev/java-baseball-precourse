package baseball.model;

import static baseball.constant.Constant.RESTART_END_WARNING;

public enum RestartEndChoice {
    RESSTART("1"),
    END("2");

    String str;

    RestartEndChoice(String str){
        this.str = str;
    }
    /**
     *
     */
    public static RestartEndChoice parse(String str){
        if(RESSTART.str.equals(str)){
            return RESSTART;
        }
        if(END.str.equals(str)){
            return END;
        }
        throw new IllegalArgumentException(RESTART_END_WARNING);
    }
}
