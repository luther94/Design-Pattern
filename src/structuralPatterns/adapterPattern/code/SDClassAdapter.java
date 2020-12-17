package structuralPatterns.adapterPattern.code;

public class SDClassAdapter extends SDCardImpl implements TFCard {

    @Override
    public String readTF() {
        return this.readSD();
    }

    @Override
    public void writeTF(String msg) {
        this.writeSD(msg);
    }
}
