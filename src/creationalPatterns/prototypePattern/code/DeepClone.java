package creationalPatterns.prototypePattern.code;

import java.io.*;

public class DeepClone implements Cloneable, Serializable {
    private User user = new User(12, "张三");

    @Override
    protected DeepClone clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (DeepClone) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User getUser() {
        return user;
    }
}
