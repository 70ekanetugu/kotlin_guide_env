package kt.guide.best_practice;

public class JValueObjectMail {
    private final String value;

    public JValueObjectMail(String mail) {
        this.value = mail;
    }

    public String getMail() {
        return this.mail;
    }

    /**
     * ディープコピーの返却
     */
    public JValueObjectMail copy() {
        return new JValueObjectMail(this.mail);
    }

    /** ValueObjectとしての等価チェック */
    public boolean equals(JValueObjectMail otherMail) {
        return this.mail.equals(otherMail.getMail());
    }

    public int hashCode() {
        return this.mail.hashCode();
    }
}