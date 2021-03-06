package sample.image.sharpen.actions;

import sample.image.sharpen.cache.SharpenedImagesCache;
import sample.image.sharpen.fs.FileManagementFacade;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by kopelevi on 07/09/2015.
 */
public class ImageLoad implements Runnable {

    private final BlockingQueue<String> loadedImagesQueue;

    public ImageLoad(BlockingQueue<String> loadedImagesQueue) {
        this.loadedImagesQueue = loadedImagesQueue;
    }

    public void run() {
        for (String filename : FileManagementFacade.getInstance().getFilenamesToProcess()) {
            byte[] imageBytes = loadImage(filename);
            try {
                SharpenedImagesCache.getInstance().add(filename, imageBytes);
                loadedImagesQueue.put(filename);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private byte[] loadImage(String filename) {

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        byte[] b = new byte[20];
        new Random().nextBytes(b);
        System.out.println("Loaded File: " + filename + " - " + b[1]);
        return b;
    }
}
