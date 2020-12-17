package creationalPatterns.builderPattern.code.tradition;

public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildAttributeA();
    public abstract void buildAttributeB();
    public abstract void buildAttributeC();
    public abstract void buildAttributeD();

    public Product getProduct() {
        return product;
    }

}
