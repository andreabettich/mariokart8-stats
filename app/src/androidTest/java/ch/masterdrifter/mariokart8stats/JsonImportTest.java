package ch.masterdrifter.mariokart8stats;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

import java.io.InputStream;

import ch.masterdrifter.mariokart8stats.models.Body;
import ch.masterdrifter.mariokart8stats.models.Driver;
import ch.masterdrifter.mariokart8stats.models.Glider;
import ch.masterdrifter.mariokart8stats.models.Tires;
import io.realm.Realm;
import io.realm.RealmResults;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Andrea Bettich
 */
public class JsonImportTest extends AndroidTestCase {

    private Realm realm;

    @Override
    public void setUp() throws Exception {
        super.setUp();

        realm = Realm.getInstance(getContext());
    }

    @SmallTest
    public void testCharacterJson() throws Exception {
        importJson(Driver.class, R.raw.mariokart_stats_drivers);
        final RealmResults<Driver> result = realm.where(Driver.class).findAll();

        assertThat(result.isEmpty(), is(false));
        assertThat(result.size(), is(37));
    }

    @SmallTest
    public void testBodyJson() throws Exception {
        importJson(Body.class, R.raw.mariokart_stats_bodies);
        final RealmResults<Body> result = realm.where(Body.class).findAll();

        assertThat(result.isEmpty(), is(false));
        assertThat(result.size(), is(36));
    }

    @SmallTest
    public void testTiresJson() throws Exception {
        importJson(Tires.class, R.raw.mariokart_stats_tires);
        final RealmResults<Tires> result = realm.where(Tires.class).findAll();

        assertThat(result.isEmpty(), is(false));
        assertThat(result.size(), is(21));
    }

    @SmallTest
    public void ignoreTestGliderJson() throws Exception {
        //todo fill glider json
        importJson(Glider.class, R.raw.mariokart_stats_gliders);

        final RealmResults<Glider> result = realm.where(Glider.class).findAll();
        assertFalse(result.isEmpty());
        assertTrue(result.size() == 37);
    }

    private void importJson(Class clazz, int jsonResourceId) throws Exception {
        realm.beginTransaction();
        final InputStream inputStream = getContext().getResources().openRawResource(jsonResourceId);
        realm.createOrUpdateAllFromJson(clazz, inputStream);
        realm.commitTransaction();
    }

    @Override
    public void tearDown() throws Exception {

        super.tearDown();
    }
}
