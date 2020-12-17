package structuralPatterns.adapterPattern.code;

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "read sd msg : hello world!";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println(msg);
    }
}
