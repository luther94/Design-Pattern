package structuralPatterns.adapterPattern.code;

public class App {

    public static void main(String[] args) {
        ThinkPadComputer thinkPadComputer = new ThinkPadComputer();
        String s = thinkPadComputer.readTF(new TFCardImpl());
        System.out.println(s);

        // 类适配器
        s = thinkPadComputer.readTF(new SDClassAdapter());
        System.out.println(s);

        // 对象适配器
        s = thinkPadComputer.readTF(new SDObjectAdapter(new SDCardImpl()));
        System.out.println(s);
    }
}
