package ch.masterdrifter.mariokart8stats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import ch.masterdrifter.mariokart8stats.models.Driver;

/**
 * @author cbalaguer, Namics AG
 */
@EViewGroup(R.layout.list_item)
public class DriverListItem extends LinearLayout {

    @ViewById(R.id.list_item)
    TextView textView;

    public DriverListItem(Context context) {
        super(context);
    }

    public DriverListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DriverListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void bind(Driver character) {
        textView.setText(character.getName());
    }

}
