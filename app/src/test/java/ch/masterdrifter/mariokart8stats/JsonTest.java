package ch.masterdrifter.mariokart8stats;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import java.io.InputStream;

import ch.masterdrifter.mariokart8stats.models.Character;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * @author Andrea Bettich
 */
public class JsonTest extends ActivityInstrumentationTestCase2<MainActivity_> {

    private MainActivity activity;

    public JsonTest() {
        super(MainActivity_.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

        activity = getActivity();
    }

    @SmallTest
    public void testCharacterJson() throws Exception {
        final Realm realm = Realm.getInstance(activity);
        realm.beginTransaction();
        final InputStream inputStream = activity.getResources().openRawResource(R.raw.mariokart_stats_characters);
        realm.createAllFromJson(Character.class, inputStream);
        realm.commitTransaction();

        final RealmResults<Character> all = realm.where(Character.class).findAll();
        assertFalse(all.isEmpty());
    }
}
