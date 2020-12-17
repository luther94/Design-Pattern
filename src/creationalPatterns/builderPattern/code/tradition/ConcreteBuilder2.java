package creationalPatterns.builderPattern.code.tradition;

public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildAttributeA() {
        product.setAttributeA("2");
    }

    @Override
    public void buildAttributeB() {
        product.setAttributeB("2");
    }

    @Override
    public void buildAttributeC() {
        product.setAttributeC("2");
    }

    @Override
    public void buildAttributeD() {
        product.setAttributeD("2");
    }

}
