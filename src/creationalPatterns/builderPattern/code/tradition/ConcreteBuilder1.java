package creationalPatterns.builderPattern.code.tradition;

public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildAttributeA() {
        product.setAttributeA("1");
    }

    @Override
    public void buildAttributeB() {
        product.setAttributeB("1");
    }

    @Override
    public void buildAttributeC() {
        product.setAttributeC("1");
    }

    @Override
    public void buildAttributeD() {
        product.setAttributeD("1");
    }

}
