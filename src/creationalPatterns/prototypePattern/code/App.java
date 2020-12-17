package creationalPatterns.prototypePattern.code;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowClone shallowClone = new ShallowClone();
        ShallowClone shallowClone1 = shallowClone.clone();

        System.out.println(shallowClone.equals(shallowClone1));
        System.out.println(shallowClone.getUser().equals(shallowClone1.getUser()));

        System.out.println("--------------deep clone--------------");

        DeepClone deepClone = new DeepClone();
        DeepClone deepClone1 = deepClone.clone();
        System.out.println(deepClone.equals(deepClone1));
        System.out.println(deepClone.getUser().equals(deepClone1.getUser()));
    }

}
