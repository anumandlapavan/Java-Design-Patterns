package _02_StructuralDesignPatterns._4_ProxyPattern.InternetAcessUseCase;

public class RealInternet implements Internet {
    public void connectTo(String host) {
        System.out.println("Connecting to " + host);
    }
}
