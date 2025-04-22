package _02_StructuralDesignPatterns._4_ProxyPattern.ProxyVideoCachingUseCase;

import java.util.*;

public class ProxyVideoDownloader implements VideoDownloader {
    private final Map<String, Video> videoCache = new HashMap<>();
    private final VideoDownloader downloader = new RealVideoDownloader();

    public Video getVideo(String videoName) {
        if (!videoCache.containsKey(videoName)) {
            System.out.println("Video not in cache. Downloading...");
            videoCache.put(videoName, downloader.getVideo(videoName));
        } else {
            System.out.println("Video retrieved from cache: " + videoName);
        }
        return videoCache.get(videoName);
    }
}
