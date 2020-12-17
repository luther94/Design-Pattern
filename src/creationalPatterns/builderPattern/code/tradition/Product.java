package creationalPatterns.builderPattern.code.tradition;

public class Product {
    private String attributeA;
    private String attributeB;
    private String attributeC;
    private String attributeD;

    public void setAttributeA(String attributeA) {
        this.attributeA = attributeA;
    }

    public void setAttributeB(String attributeB) {
        this.attributeB = attributeB;
    }

    public void setAttributeC(String attributeC) {
        this.attributeC = attributeC;
    }

    public void setAttributeD(String attributeD) {
        this.attributeD = attributeD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "attributeA='" + attributeA + '\'' +
                ", attributeB='" + attributeB + '\'' +
                ", attributeC='" + attributeC + '\'' +
                ", attributeD='" + attributeD + '\'' +
                '}';
    }
}
