package creationalPatterns.prototypePattern.code;

public class ShallowClone implements Cloneable {
    private User user = new User(12, "张三");

    @Override
    protected ShallowClone clone() throws CloneNotSupportedException {
        return (ShallowClone) super.clone();
    }

    public User getUser() {
        return user;
    }
}
