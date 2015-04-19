package ch.masterdrifter.mariokart8stats;

import org.androidannotations.annotations.sharedpreferences.DefaultBoolean;
import org.androidannotations.annotations.sharedpreferences.SharedPref;

/**
 * @author cbalaguer, Namics AG
 */
@SharedPref(SharedPref.Scope.UNIQUE)
public interface MainPrefs {

    @DefaultBoolean(true)
    boolean firstAppStart();
}
