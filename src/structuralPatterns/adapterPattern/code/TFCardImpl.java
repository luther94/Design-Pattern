package structuralPatterns.adapterPattern.code;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "read tf msg : hello world!";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println(msg);
    }
}
