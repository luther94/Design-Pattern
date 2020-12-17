package creationalPatterns.builderPattern.code.tradition;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product getProduct() {
        builder.buildAttributeA();
        builder.buildAttributeB();
        builder.buildAttributeC();
        builder.buildAttributeD();
        return builder.getProduct();
    }
}
