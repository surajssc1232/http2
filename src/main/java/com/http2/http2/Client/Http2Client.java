package com.http2.http2.Client;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Http2Client {

    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient.Builder()
                .protocols(java.util.Collections.singletonList(okhttp3.Protocol.H2_PRIOR_KNOWLEDGE))
                .build();

        Request request = new Request.Builder()
                .url("http://localhost:8080/hello")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                System.out.println(response.body().string());
            } else {
                System.err.println("Request failed: " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}