package models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Ride", schema ="hail")
public class Ride {

    private int ride_id;
    private String host_first_name;
    private String host_last_name;
    private String origin_city;
    private String origin_state;
    private String destination_city;
    private String destination_state;
    private Date ride_time;
    private String note;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ride_id")
    public int getRide_id() {
        return ride_id;
    }
    public void setRide_id(int ride_id) {
        this.ride_id = ride_id;
    }

    @Column(name = "host_first_name")
    public String getHost_first_name() {
        return host_first_name;
    }
    public void setHost_first_name(String host_first_name) {
        this.host_first_name = host_first_name;
    }

    @Column(name = "host_last_name")
    public String getHost_last_name() {
        return host_last_name;
    }
    public void setHost_last_name(String host_last_name) {
        this.host_last_name = host_last_name;
    }

    @Column(name = "origin_city")
    public String getOrigin_city() {
        return origin_city;
    }
    public void setOrigin_city(String origin_city) {
        this.origin_city = origin_city;
    }

    @Column(name = "origin_state")
    public String getOrigin_state() {
        return origin_state;
    }
    public void setOrigin_state(String origin_state) {
        this.origin_state = origin_state;
    }

    @Column(name = "destination_city")
    public String getDestination_city() {
        return destination_city;
    }
    public void setDestination_city(String destination_city) {
        this.destination_city = destination_city;
    }

    @Column(name = "destination_state")
    public String getDestination_state() {
        return destination_state;
    }
    public void setDestination_state(String desitnation_state) {
        this.destination_state = desitnation_state;
    }

    @Column(name = "ride_time")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getRide_time() {
        return ride_time;
    }
    public void setRide_time(Date ride_time) {
        this.ride_time = ride_time;
    }

    @Column(name = "note")
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
}
