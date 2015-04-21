package ch.masterdrifter.mariokart8stats;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import ch.masterdrifter.mariokart8stats.models.Driver;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * @author cbalaguer, Namics AG
 */
@EBean
public class DriverSpinnerAdapter extends BaseAdapter {

    private RealmResults<Driver> characters;

    @RootContext
    Context context;

    @AfterInject
    protected void init() {
        characters = Realm.getInstance(context).where(Driver.class).findAll();
    }

    @Override
    public int getCount() {
        return characters.size();
    }

    @Override
    public Driver getItem(int position) {
        return characters.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DriverListItem listItem;
        if (convertView == null) {
            listItem = DriverListItem_.build(context);
        } else {
            listItem = (DriverListItem) convertView;
        }
        listItem.bind(getItem(position));

        return listItem;
    }
}
