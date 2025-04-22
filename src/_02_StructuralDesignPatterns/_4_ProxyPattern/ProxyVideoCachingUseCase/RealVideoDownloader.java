package _02_StructuralDesignPatterns._4_ProxyPattern.ProxyVideoCachingUseCase;

public class RealVideoDownloader implements VideoDownloader {
    public Video getVideo(String videoName) {
        System.out.println("Connecting to https://www.youtube.com/");
        System.out.println("Downloading Video: " + videoName);
        System.out.println("Retrieving video metadata...");
        return new Video(videoName);
    }
}
