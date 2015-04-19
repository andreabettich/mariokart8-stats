package ch.masterdrifter.mariokart8stats.models;

/**
 * @author Andrea Bettich
 */
public interface BasicStats {

    public String getName();

    public void setName(String name);

    public boolean isDlc();

    public void setDlc(boolean dlc);

    public double getGroundSpeed();

    public void setGroundSpeed(double groundSpeed);

    public double getWaterSpeed();

    public void setWaterSpeed(double waterSpeed);

    public double getAirSpeed();

    public void setAirSpeed(double airSpeed);

    public double getAntiGravitySpeed();

    public void setAntiGravitySpeed(double antiGravitySpeed);

    public double getAcceleration();

    public void setAcceleration(double acceleration);

    public double getWeight();

    public void setWeight(double weight);

    public double getGroundHandling();

    public void setGroundHandling(double groundHandling);

    public double getWaterHandling();

    public void setWaterHandling(double waterHandling);

    public double getAirHandling();

    public void setAirHandling(double airHandling);

    public double getAntiGravityHandling();

    public void setAntiGravityHandling(double antiGravityHandling);

    public double getTraction();

    public void setTraction(double traction);

    public double getMiniTurbo();

    public void setMiniTurbo(double miniTurbo);
}
