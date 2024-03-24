package org.example;

import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter HTTP status code: ");
        try {
            int code = in.nextInt();
            HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
            httpStatusImageDownloader.downloadStatusImage(code);
        } catch (Exception e) {
            Scanner into = new Scanner(System.in);
            System.out.print("Please enter valid number: ");
            int code = into.nextInt();
            HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
            httpStatusImageDownloader.downloadStatusImage(code);
        }
    }
}
