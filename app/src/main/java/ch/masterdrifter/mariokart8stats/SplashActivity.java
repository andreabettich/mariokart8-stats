package ch.masterdrifter.mariokart8stats;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.sharedpreferences.Pref;

import java.io.IOException;
import java.io.InputStream;

import ch.masterdrifter.mariokart8stats.models.Body;
import ch.masterdrifter.mariokart8stats.models.Driver;
import ch.masterdrifter.mariokart8stats.models.Tires;
import hugo.weaving.DebugLog;
import io.realm.Realm;

/**
 * @author cbalaguer, Namics AG
 */
@EActivity(R.layout.activity_splash)
public class SplashActivity extends ActionBarActivity {

    private static final String TAG = SplashActivity.class.getName();

    @Pref
    MainPrefs_ prefs;

    @AfterViews
    protected void afterViews() {
        if (prefs.firstAppStart().get()) {
            importJson(Driver.class, R.raw.mariokart_stats_drivers);
            importJson(Body.class, R.raw.mariokart_stats_bodies);
            //importJson(Glider.class, R.raw.mariokart_stats_gliders);
            importJson(Tires.class, R.raw.mariokart_stats_tires);
            prefs.firstAppStart().put(false);
        }

        startActivity(new Intent(this, MainActivity_.class));
    }

    @DebugLog
    private void importJson(Class clazz, int jsonResourceId) {
        final Realm realm = Realm.getInstance(this);
        realm.beginTransaction();
        final InputStream inputStream = getResources().openRawResource(jsonResourceId);
        try {
            realm.createOrUpdateAllFromJson(clazz, inputStream);
            realm.commitTransaction();
        } catch (IOException e) {
            realm.cancelTransaction();
            throw new IllegalStateException("Failed to import " + clazz.getSimpleName() + " data", e);
        }
    }
}
