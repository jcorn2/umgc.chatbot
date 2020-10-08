package com.chatbot.permit.municipal.model;

import javax.persistence.*;

@Entity
@Table(name = "maps")
public class Maps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    private int FK_POLYGON_ID;
    private double LAT;
    private double LON;
    int LAT_CORD;
    int LON_CORD;

    public Maps(int FK_POLYGON_ID, double LAT, double LON, int LAT_CORD, int LON_CORD) {
        this.setFK_POLYGON_ID(FK_POLYGON_ID);
        this.setLAT(LAT);
        this.setLON(LON);
        this.setLAT_CORD(LAT_CORD);
        this.setLON_CORD(LON_CORD);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getFK_POLYGON_ID() {
        return FK_POLYGON_ID;
    }

    public void setFK_POLYGON_ID(int FK_POLYGON_ID) {
        this.FK_POLYGON_ID = FK_POLYGON_ID;
    }

    public double getLAT() {
        return LAT;
    }

    public void setLAT(double LAT) {
        this.LAT = LAT;
    }

    public double getLON() {
        return LON;
    }

    public void setLON(double LON) {
        this.LON = LON;
    }

    public double getLAT_CORD() {
        return LAT_CORD;
    }

    public void setLAT_CORD(int LAT_CORD) {
        this.LAT_CORD = LAT_CORD;
    }

    public double getLON_CORD() {
        return LON_CORD;
    }

    public void setLON_CORD(int LON_CORD) {
        this.LON_CORD = LON_CORD;
    }
}
