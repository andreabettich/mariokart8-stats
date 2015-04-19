package ch.masterdrifter.mariokart8stats.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * @author Andrea Bettich
 */
public class BodyType extends RealmObject implements BasicStats {

    @PrimaryKey
    private long id;

    private String type;

    private String name;

    private boolean dlc;

    private boolean defaultPart;

    private boolean changesColor;

    private boolean changesColorKoopalings;

    private boolean changesColorDaisyAndRosalina;

    private boolean insideDrifts;

    private double groundSpeed;

    private double waterSpeed;

    private double airSpeed;

    private double antiGravitySpeed;

    private double acceleration;

    private double weight;

    private double groundHandling;

    private double waterHandling;

    private double airHandling;

    private double antiGravityHandling;

    private double traction;

    private double miniTurbo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    public double getGroundSpeed() {
        return groundSpeed;
    }

    @Override
    public void setGroundSpeed(double groundSpeed) {
        this.groundSpeed = groundSpeed;
    }

    @Override
    public double getWaterSpeed() {
        return waterSpeed;
    }

    @Override
    public void setWaterSpeed(double waterSpeed) {
        this.waterSpeed = waterSpeed;
    }

    @Override
    public double getAirSpeed() {
        return airSpeed;
    }

    @Override
    public void setAirSpeed(double airSpeed) {
        this.airSpeed = airSpeed;
    }

    @Override
    public double getAntiGravitySpeed() {
        return antiGravitySpeed;
    }

    @Override
    public void setAntiGravitySpeed(double antiGravitySpeed) {
        this.antiGravitySpeed = antiGravitySpeed;
    }

    @Override
    public double getAcceleration() {
        return acceleration;
    }

    @Override
    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getGroundHandling() {
        return groundHandling;
    }

    @Override
    public void setGroundHandling(double groundHandling) {
        this.groundHandling = groundHandling;
    }

    @Override
    public double getWaterHandling() {
        return waterHandling;
    }

    @Override
    public void setWaterHandling(double waterHandling) {
        this.waterHandling = waterHandling;
    }

    @Override
    public double getAirHandling() {
        return airHandling;
    }

    @Override
    public void setAirHandling(double airHandling) {
        this.airHandling = airHandling;
    }

    @Override
    public double getAntiGravityHandling() {
        return antiGravityHandling;
    }

    @Override
    public void setAntiGravityHandling(double antiGravityHandling) {
        this.antiGravityHandling = antiGravityHandling;
    }

    @Override
    public double getTraction() {
        return traction;
    }

    @Override
    public void setTraction(double traction) {
        this.traction = traction;
    }

    @Override
    public double getMiniTurbo() {
        return miniTurbo;
    }

    @Override
    public void setMiniTurbo(double miniTurbo) {
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
