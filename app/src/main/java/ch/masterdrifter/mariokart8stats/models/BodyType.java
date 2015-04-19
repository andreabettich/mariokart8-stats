package ch.masterdrifter.mariokart8stats.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * @author Andrea Bettich
 */
public class BodyType extends RealmObject implements BasicStats {

    @PrimaryKey
    private long id;

    private String name;

    private boolean dlc;

    private boolean defaultPart;

    private boolean changesColor;

    private boolean changesColorKoopalings;

    private boolean changesColorDaisyAndRosalina;

    private boolean insideDrifts;

    private long groundSpeed;

    private long waterSpeed;

    private long airSpeed;

    private long antiGravitySpeed;

    private long acceleration;

    private long weight;

    private long groundHandling;

    private long waterHandling;

    private long airHandling;

    private long antiGravityHandling;

    private long traction;

    private long miniTurbo;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isDlc() {
        return dlc;
    }

    @Override
    public void setDlc(boolean dlc) {
        this.dlc = dlc;
    }

    @Override
    public long getGroundSpeed() {
        return groundSpeed;
    }

    @Override
    public void setGroundSpeed(long groundSpeed) {
        this.groundSpeed = groundSpeed;
    }

    @Override
    public long getWaterSpeed() {
        return waterSpeed;
    }

    @Override
    public void setWaterSpeed(long waterSpeed) {
        this.waterSpeed = waterSpeed;
    }

    @Override
    public long getAirSpeed() {
        return airSpeed;
    }

    @Override
    public void setAirSpeed(long airSpeed) {
        this.airSpeed = airSpeed;
    }

    @Override
    public long getAntiGravitySpeed() {
        return antiGravitySpeed;
    }

    @Override
    public void setAntiGravitySpeed(long antiGravitySpeed) {
        this.antiGravitySpeed = antiGravitySpeed;
    }

    @Override
    public long getAcceleration() {
        return acceleration;
    }

    @Override
    public void setAcceleration(long acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public long getWeight() {
        return weight;
    }

    @Override
    public void setWeight(long weight) {
        this.weight = weight;
    }

    @Override
    public long getGroundHandling() {
        return groundHandling;
    }

    @Override
    public void setGroundHandling(long groundHandling) {
        this.groundHandling = groundHandling;
    }

    @Override
    public long getWaterHandling() {
        return waterHandling;
    }

    @Override
    public void setWaterHandling(long waterHandling) {
        this.waterHandling = waterHandling;
    }

    @Override
    public long getAirHandling() {
        return airHandling;
    }

    @Override
    public void setAirHandling(long airHandling) {
        this.airHandling = airHandling;
    }

    @Override
    public long getAntiGravityHandling() {
        return antiGravityHandling;
    }

    @Override
    public void setAntiGravityHandling(long antiGravityHandling) {
        this.antiGravityHandling = antiGravityHandling;
    }

    @Override
    public long getTraction() {
        return traction;
    }

    @Override
    public void setTraction(long traction) {
        this.traction = traction;
    }

    @Override
    public long getMiniTurbo() {
        return miniTurbo;
    }

    @Override
    public void setMiniTurbo(long miniTurbo) {
        this.miniTurbo = miniTurbo;
    }
    public boolean isDefaultPart() {
        return defaultPart;
    }

    public void setDefaultPart(boolean defaultPart) {
        this.defaultPart = defaultPart;
    }

    public boolean isChangesColor() {
        return changesColor;
    }

    public void setChangesColor(boolean changesColor) {
        this.changesColor = changesColor;
    }

    public boolean isChangesColorKoopalings() {
        return changesColorKoopalings;
    }

    public void setChangesColorKoopalings(boolean changesColorKoopalings) {
        this.changesColorKoopalings = changesColorKoopalings;
    }

    public boolean isChangesColorDaisyAndRosalina() {
        return changesColorDaisyAndRosalina;
    }

    public void setChangesColorDaisyAndRosalina(boolean changesColorDaisyAndRosalina) {
        this.changesColorDaisyAndRosalina = changesColorDaisyAndRosalina;
    }

    public boolean isInsideDrifts() {
        return insideDrifts;
    }

    public void setInsideDrifts(boolean insideDrifts) {
        this.insideDrifts = insideDrifts;
    }

}
