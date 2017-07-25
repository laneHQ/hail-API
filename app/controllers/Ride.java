package controllers;

public class Ride extends controllers {
    public Result showRides() {
        return ok(Json.toJson("Hello World"));
    }
}
