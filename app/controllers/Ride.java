package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Ride extends Controller {
    public Result showRides() {
        return ok(Json.toJson("Hello World"));
    }
}
