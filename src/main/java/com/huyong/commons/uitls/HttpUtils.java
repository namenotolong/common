package com.huyong.commons.uitls;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpUtils {


//    HttpClient client = HttpClient.newBuilder()
//            .version(HttpClient.Version.HTTP_1_1)
//            .connectTimeout(Duration.ofSeconds(20))
//            .build();

    static HttpClient clientSimple = HttpClient.newHttpClient();

    public static void get() throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.baidu.com"))
                .GET()
                .build();
        HttpResponse<String> response = clientSimple.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        //get();
        String a = "123";
        String content = """
                123
                123
                123
                123
                """;

    }
    public static String switchJava13(String month) {
        return switch (month) {
            case "march", "april", "may":
                yield "春天";
            case "june", "july", "august":
                yield "夏天";
            case "september", "october", "november":
                yield "秋天";
            case "december", "january", "february":
                yield "冬天";
            default:
                yield "month error";
        };
    }


}
