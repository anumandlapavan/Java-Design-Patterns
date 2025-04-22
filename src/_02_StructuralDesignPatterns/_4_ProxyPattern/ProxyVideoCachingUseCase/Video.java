package _02_StructuralDesignPatterns._4_ProxyPattern.ProxyVideoCachingUseCase;

public class Video {
    private final String name;

    public Video(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
