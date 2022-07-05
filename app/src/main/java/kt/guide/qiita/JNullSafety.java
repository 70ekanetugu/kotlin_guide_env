package kt.guide.qiita;


public class JNullSafety {
    public static String notNull() {
        String s = "nonNull";
        int len = s.length();
        return s + len;
    }
    
    public static String nullable() {
        String s = null;
        int len = s.length();
        return s + len;
    }
}