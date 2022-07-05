package kt.guide.qiita;

public class JSmartCast {

    public static void doSomething(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat)animal;
            cat.catMethod();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.dogMethod();
        } else {
            System.out.println("not support animal");
        }
    }
}