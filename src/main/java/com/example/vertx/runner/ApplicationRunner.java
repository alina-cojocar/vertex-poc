package com.example.vertx.runner;

import com.example.vertx.verticles.HelloWorldVerticle;
import io.vertx.core.Vertx;

/**
 * Created by alinac on 10/24/16.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle(new HelloWorldVerticle());
        System.out.println("Deployment done");
    }
}
