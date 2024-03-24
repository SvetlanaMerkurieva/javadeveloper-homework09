package org.example;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {
    public String getStatusImage(int code) throws Exception {
        String url = "https://http.cat/" + code + ".jpg";
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        int responseCode = conn.getResponseCode();
        if (responseCode == 404) {
            System.out.println("File with code " + code + " not found");
        }
        return url;
    }
}
