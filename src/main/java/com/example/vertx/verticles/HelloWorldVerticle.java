package com.example.vertx.verticles;

import io.vertx.core.AbstractVerticle;

/**
 * Created by alinac on 10/24/16.
 */
public class HelloWorldVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> req.response().end("Hello World!")).listen(8080);
    }
}
