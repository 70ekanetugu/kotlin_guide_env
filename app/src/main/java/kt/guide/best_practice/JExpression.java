package kt.guide.best_practice;

import java.lang.IllegalArgumentException;
import java.util.Locale;

public class JExpression {

    public Locale getDefaultLocale(String deliveryArea) {
        if (deliveryArea == null || deliveryArea.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (deliveryArea.equals("germany") || deliveryArea.equals("austria")) {
            return Locale.GERMAN;
        }
        if (deliveryArea.equals("usa") || deliveryArea.equals("great britain")) {
            return Locale.ENGLISH;
        }
        if (deliveryArea.equals("france")) {
            return Locale.FRENCH;
        }
        return Locale.ENGLISH;
    }
}