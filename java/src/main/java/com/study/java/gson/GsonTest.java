package com.study.java.gson;

import com.google.gson.Gson;
import com.study.java.Parent;

public class GsonTest {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Response<String> stringResponse = new Response<>(100, "haha", "data");
        String toJson = gson.toJson(stringResponse);
        final CustomTypeToken customTypeToken = new CustomTypeToken<Response<String>>() {
        };
//        Response<String> fromJson = gson.fromJson(toJson,
//                responseCustomTypeToken.getType());
        Response<String> fromJson = gson.fromJson(toJson,
                customTypeToken.getType());

        System.out.println(fromJson.toString());
    }

}
