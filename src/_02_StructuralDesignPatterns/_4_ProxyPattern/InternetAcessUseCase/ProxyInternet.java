package _02_StructuralDesignPatterns._4_ProxyPattern.InternetAcessUseCase;

import java.util.*;

public class ProxyInternet implements Internet {
    private static final List<String> bannedSites = new ArrayList<>();
    private final Internet internet = new RealInternet();

    static {
        bannedSites.add("banned.com");
        bannedSites.add("badsite.com");
    }

    public void connectTo(String host) {
        if (bannedSites.contains(host)) {
            System.out.println("Access Denied to " + host);
        } else {
            internet.connectTo(host);
        }
    }
}
