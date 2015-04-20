package ch.masterdrifter.mariokart8stats;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import java.io.InputStream;

import ch.masterdrifter.mariokart8stats.models.Body;
import ch.masterdrifter.mariokart8stats.models.Character;
import ch.masterdrifter.mariokart8stats.models.Glider;
import ch.masterdrifter.mariokart8stats.models.Tires;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * @author Andrea Bettich
 */
public class JsonTest extends ActivityInstrumentationTestCase2<MainActivity_> {

    private MainActivity activity;

    private Realm realm;

    public JsonTest() {
        super(MainActivity_.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

        activity = getActivity();
        realm = Realm.getInstance(activity);
    }

    @SmallTest
    public void testCharacterJson() throws Exception {
        importJson(Character.class, R.raw.mariokart_stats_characters);

        final RealmResults<Character> result = realm.where(Character.class).findAll();
        assertFalse(result.isEmpty());
        assertTrue(result.size() == 37);
    }

    @SmallTest
    public void testBodyJson() throws Exception {
        importJson(Body.class, R.raw.mariokart_stats_characters);

        final RealmResults<Character> result = realm.where(Character.class).findAll();
        assertFalse(result.isEmpty());
        assertTrue(result.size() == 37);
    }

    @SmallTest
    public void testTiresJson() throws Exception {
        importJson(Tires.class, R.raw.mariokart_stats_tires);

        final RealmResults<Character> result = realm.where(Character.class).findAll();
        assertFalse(result.isEmpty());
        assertTrue(result.size() == 37);
    }

    @SmallTest
    public void testGliderJson() throws Exception {
        importJson(Glider.class, R.raw.mariokart_stats_characters);

        final RealmResults<Character> result = realm.where(Character.class).findAll();
        assertFalse(result.isEmpty());
        assertTrue(result.size() == 37);
    }

    private void importJson(Class clazz, int jsonResourceId) throws Exception {
        realm.beginTransaction();
        final InputStream inputStream = activity.getResources().openRawResource(jsonResourceId);
        realm.createOrUpdateAllFromJson(clazz, inputStream);
        realm.commitTransaction();
    }

    @Override
    public void tearDown() throws Exception {
        assertTrue(activity.deleteFile("default.realm"));

        super.tearDown();
    }
}
