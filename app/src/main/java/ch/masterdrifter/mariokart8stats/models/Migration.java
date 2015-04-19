package ch.masterdrifter.mariokart8stats.models;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

import ch.masterdrifter.mariokart8stats.R;
import hugo.weaving.DebugLog;
import io.realm.Realm;
import io.realm.RealmMigration;

/**
 * @author Andrea Bettich
 */
public class Migration implements RealmMigration {

    private static final String TAG = Migration.class.getName();
    private Context context;

    public Migration(Context context) {
        this.context = context;
    }

    @Override
    @DebugLog
    public long execute(Realm realm, long version) {
        if (version == -1) {
            realm.beginTransaction();
            try {
                final InputStream charStream = context.getResources().openRawResource(R.raw.mariokart_stats_characters);
                realm.createAllFromJson(Character.class, charStream);
                realm.commitTransaction();
            } catch (IOException e) {
                Log.e(TAG, "Failed to migrate from version 0 to 1");
                realm.cancelTransaction();
            }

            /*
            final InputStream bodyTypeStream = context.getResources().openRawResource(R.raw.mariokart_stats_bodytypes);
                realm.createAllFromJson(BodyType.class, bodyTypeStream);

                final InputStream gliderStream = context.getResources().openRawResource(R.raw.mariokart_stats_glider);
                realm.createAllFromJson(Glider.class, gliderStream);

                final InputStream tireStream = context.getResources().openRawResource(R.raw.mariokart_stats_tires);
                realm.createAllFromJson(Tires.class, tireStream);
             */
            version++;
        }
        return version;
    }
}
