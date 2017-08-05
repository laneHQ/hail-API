package controllers;

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
}
