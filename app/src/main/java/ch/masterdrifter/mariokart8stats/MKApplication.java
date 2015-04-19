package ch.masterdrifter.mariokart8stats;

import android.app.Application;
import android.os.Environment;

import org.androidannotations.annotations.EApplication;
import org.androidannotations.annotations.sharedpreferences.Pref;

import java.io.IOException;
import java.io.InputStream;

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

        if (prefs.firstAppStart().get()) {
            final Realm realm = Realm.getInstance(this);

            try {
                realm.beginTransaction();
                final InputStream charStream = getResources().openRawResource(R.raw.mariokart_stats_characters);
                realm.createAllFromJson(ch.masterdrifter.mariokart8stats.models.Character.class, charStream);
                realm.commitTransaction();
            } catch (IOException e) {
                realm.cancelTransaction();
            }
            prefs.firstAppStart().put(false);
        }

        try {
            Realm.getInstance(this);
        } catch (RealmMigrationNeededException e) {
            //this exception is thrown when the new data model does not match the existing db
            final String realmDbPath = getFilesDir().getAbsolutePath() + "/default.realm";
            Realm.migrateRealmAtPath(realmDbPath, new Migration(this));
        }
    }
}
