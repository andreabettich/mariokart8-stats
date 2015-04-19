package ch.masterdrifter.mariokart8stats;

import android.app.Application;

import org.androidannotations.annotations.EApplication;
import org.androidannotations.annotations.sharedpreferences.Pref;

import ch.masterdrifter.mariokart8stats.models.Migration;
import io.realm.Realm;
import io.realm.exceptions.RealmMigrationNeededException;

/**
 * @author cbalaguer, Namics AG
 */
@EApplication
public class MKApplication extends Application {

    @Pref
    MainPrefs_ prefs;

    @Override
    public void onCreate() {
        super.onCreate();

        final String realmDbPath = getFilesDir().getAbsolutePath() + "/default.realm";
        if (prefs.firstAppStart().get()) {
            Realm.migrateRealmAtPath(realmDbPath, new Migration(this));
            prefs.firstAppStart().put(false);
        }

        try {
            Realm.getInstance(this);
        } catch (RealmMigrationNeededException e) {
            //this exception is thrown when the new data model does not match the existing db
            Realm.migrateRealmAtPath(realmDbPath, new Migration(this));
        }
    }
}
