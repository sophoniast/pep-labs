package com.revature;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * Assignment: retrieve the variable "first" from the path parameter and send it in the response body. Produce
         * the response using:
         *      ctx.result(StringVariable);
         * 
         * Note: Please refer to the "PathParameters.MD" file for more assistance if needed.
         */
        app.get("/firstname/{first}", ctx -> {
            
            //write code here
            String firstname= ctx.pathParam("first");
            ctx.result(firstname);
        });


        return app;
    }
    
}
