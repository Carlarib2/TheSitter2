package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name="cli_id")
    private int cliId;

    @Column(name="cli_user_id")
    private int cliUserId;

    @Column(name="cli_sta_id")
    private int cliStaId;

    public Client(){

    }

    public int getCliId() {
        return cliId;
    }

    public int getCliUserId() {
        return cliUserId;
    }

    public int getCliStaId() {
        return cliStaId;
    }
}