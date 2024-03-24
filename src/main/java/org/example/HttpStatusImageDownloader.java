package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class HttpStatusImageDownloader {
    public void downloadStatusImage(int code) throws Exception {
        String url = new HttpStatusChecker().getStatusImage(code);
        try (InputStream in = new URL(url).openStream()) {
            String path = "src/main/java/org/example/images/" + code + ".jpg";
            if (!new File(path).exists()) {
                Files.copy(in, Paths.get(path));
                System.out.println("Image downloaded!");
            } else {
                System.out.println("File with " + code + " already exist");
            }
        } catch (Exception e) {
            System.out.println("There is not image for HTTP status " + code);
        }
    }
}
