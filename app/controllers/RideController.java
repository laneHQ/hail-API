package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.db.jpa.JPAApi;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import models.Ride;

import javax.inject.Inject;
import javax.persistence.Query;

public class RideController extends Controller {

    private final JPAApi jpaApi;

    @Inject
    public RideController(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    @play.db.jpa.Transactional
    public Result showRides() {
        Query q = jpaApi.em().createQuery("select r from Ride r");
        return ok(Json.toJson(q.getResultList()));
    }

    @play.db.jpa.Transactional
    public Result createRide() {
        JsonNode json = request().body().asJson();
        Ride ride = Json.fromJson(json, Ride.class);
        jpaApi.em().persist(ride);
        return ok(Json.toJson(ride));
    }
}
