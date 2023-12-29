package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "boo_id")
    private int booId;

    @Column(name = "boo_data")
    private LocalDate booData;

    @Column(name = "boo_cli_id")
    private int booCliId;

    @Column(name = "boo_endTime")
    private Time booEndTime;

    @Column(name = "boo_sta_id")
    private int booStaId;

    @Column(name = "boo_startTime")
    private Time booStartTime;

    public Booking(){

    }

    public int getBooId() {
        return booId;
    }

    public LocalDate getBooData() {
        return booData;
    }

    public int getBooCliId() {
        return booCliId;
    }

    public Time getBooEndTime() {
        return booEndTime;
    }

    public int getBooStaId() {
        return booStaId;
    }

    public Time getBooStartTime() {
        return booStartTime;
    }
}
