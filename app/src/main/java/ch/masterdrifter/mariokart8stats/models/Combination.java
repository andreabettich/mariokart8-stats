package ch.masterdrifter.mariokart8stats.models;

import io.realm.RealmObject;

/**
 * @author Andrea Bettich
 */
public class Combination extends RealmObject {
    private long id;

    private Character character;

    private BodyType bodyType;

    private Glider glider;

    private Tires tires;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Glider getGlider() {
        return glider;
    }

    public void setGlider(Glider glider) {
        this.glider = glider;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

}
