package structuralPatterns.proxyPattern.staticProxy;

public class SingStar implements Star {
    @Override
    public void sing() {
        System.out.println("歌星在唱歌");
    }

    @Override
    public void dance() {
        System.out.println("歌星不会跳舞");
    }
}
