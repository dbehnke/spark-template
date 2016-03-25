package com.github.dbehnke.sparktemplate;

import static spark.Spark.*;

public class WebApp {
    public static void main(String[] args) {
        HelloWorld app = new HelloWorld();
        app.init();
    }
}

