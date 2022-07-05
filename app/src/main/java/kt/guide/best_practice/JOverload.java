package kt.guide.best_practice;

public class JOverload {
    public String findBy(String name) {
        return findBy(name, true);
    }

    public String findBy(String name, boolean isJapanese) {
        return "";
    }
}