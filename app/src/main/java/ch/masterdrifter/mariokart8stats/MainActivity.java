package ch.masterdrifter.mariokart8stats;

import android.support.v7.app.ActionBarActivity;
import android.widget.Spinner;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends ActionBarActivity {

    @ViewById(R.id.spinner)
    Spinner spinner;

    @Bean
    DriverSpinnerAdapter adapter;

    @AfterViews
    protected void afterViews() {
        spinner.setAdapter(adapter);
    }


}
