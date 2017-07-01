package com.excitinglab.kakaobot;

import static spark.Spark.*;

public class EngineServer {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}