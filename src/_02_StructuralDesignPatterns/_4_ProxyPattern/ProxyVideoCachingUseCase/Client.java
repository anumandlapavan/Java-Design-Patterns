package _02_StructuralDesignPatterns._4_ProxyPattern.ProxyVideoCachingUseCase;

public class Client {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();

        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific"); // from cache
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub"); // from cache
        videoDownloader.getVideo("geekific"); // from cache
    }
}