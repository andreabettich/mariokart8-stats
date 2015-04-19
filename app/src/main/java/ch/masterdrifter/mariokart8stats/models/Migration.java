package ch.masterdrifter.mariokart8stats.models;

import io.realm.Realm;
import io.realm.RealmMigration;

/**
 * @author Andrea Bettich
 */
public class Migration implements RealmMigration {
    @Override
    public long execute(Realm realm, long version) {
        // Migrate from version 0 to version 1
        if (version == 0) {

        }
        return version;
    }
}
