package com.soundcloud.lightcycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public interface SupportFragmentLightCycle<HostType> {
    void onActivityCreated(HostType hosttype, Bundle bundle);

    void onAttach(HostType hosttype, Activity activity);

    void onCreate(HostType hosttype, Bundle bundle);

    void onDestroy(HostType hosttype);

    void onDestroyView(HostType hosttype);

    void onDetach(HostType hosttype);

    boolean onOptionsItemSelected(HostType hosttype, MenuItem menuItem);

    void onPause(HostType hosttype);

    void onResume(HostType hosttype);

    void onSaveInstanceState(HostType hosttype, Bundle bundle);

    void onStart(HostType hosttype);

    void onStop(HostType hosttype);

    void onViewCreated(HostType hosttype, View view, Bundle bundle);
}
