package ch.masterdrifter.mariokart8stats.models;

/**
 * @author Andrea Bettich
 */
public interface BasicStats {
    public long getId();

    public String getName();

    public void setName(String name);

    public boolean isDlc();

    public void setDlc(boolean dlc);

    public long getGroundSpeed();

    public void setGroundSpeed(long groundSpeed);

    public long getWaterSpeed();

    public void setWaterSpeed(long waterSpeed);

    public long getAirSpeed();

    public void setAirSpeed(long airSpeed);

    public long getAntiGravitySpeed();

    public void setAntiGravitySpeed(long antiGravitySpeed);

    public long getAcceleration();

    public void setAcceleration(long acceleration);

    public long getWeight();

    public void setWeight(long weight);

    public long getGroundHandling();

    public void setGroundHandling(long groundHandling);

    public long getWaterHandling();

    public void setWaterHandling(long waterHandling);

    public long getAirHandling();

    public void setAirHandling(long airHandling);

    public long getAntiGravityHandling();

    public void setAntiGravityHandling(long antiGravityHandling);

    public long getTraction();

    public void setTraction(long traction);

    public long getMiniTurbo();

    public void setMiniTurbo(long miniTurbo);
}
