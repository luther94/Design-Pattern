package structuralPatterns.compositePattern.code;

public class App {

    public static void main(String[] args) {
        Component leafA = new Leaf("叶子A");
        Component leafB = new Leaf("叶子B");
        Component component = new Composite("树节点");
        component.add(leafA);
        component.add(leafB);
        leafA.display();
        leafB.display();
        component.display();
    }

}
