package structuralPatterns.adapterPattern.code;

public class SDObjectAdapter implements TFCard {
    private SDCard sdCard;

    public SDObjectAdapter(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public String readTF() {
        return sdCard.readSD();
    }

    @Override
    public void writeTF(String msg) {
        sdCard.writeSD(msg);
    }
}
