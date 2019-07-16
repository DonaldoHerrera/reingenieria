package com.soundcloud.lightcycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

@TargetApi(11)
public class DefaultFragmentLightCycle<HostType> implements FragmentLightCycle<HostType> {
    public void onActivityCreated(HostType hosttype, Bundle bundle) {
    }

    public void onAttach(HostType hosttype, Activity activity) {
    }

    public void onAttach(HostType hosttype, Context context) {
    }

    public void onCreate(HostType hosttype, Bundle bundle) {
    }

    public void onDestroy(HostType hosttype) {
    }

    public void onDestroyView(HostType hosttype) {
    }

    public void onDetach(HostType hosttype) {
    }

    public boolean onOptionsItemSelected(HostType hosttype, MenuItem menuItem) {
        return false;
    }

    public void onPause(HostType hosttype) {
    }

    public void onResume(HostType hosttype) {
    }

    public void onSaveInstanceState(HostType hosttype, Bundle bundle) {
    }

    public void onStart(HostType hosttype) {
    }

    public void onStop(HostType hosttype) {
    }

    public void onViewCreated(HostType hosttype, View view, Bundle bundle) {
    }
}
