package com.soundcloud.lightcycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class DefaultActivityLightCycle<HostType> implements ActivityLightCycle<HostType> {
    public void onCreate(HostType hosttype, Bundle bundle) {
    }

    public void onDestroy(HostType hosttype) {
    }

    public void onNewIntent(HostType hosttype, Intent intent) {
    }

    public boolean onOptionsItemSelected(HostType hosttype, MenuItem menuItem) {
        return false;
    }

    public void onPause(HostType hosttype) {
    }

    public void onRestoreInstanceState(HostType hosttype, Bundle bundle) {
    }

    public void onResume(HostType hosttype) {
    }

    public void onSaveInstanceState(HostType hosttype, Bundle bundle) {
    }

    public void onStart(HostType hosttype) {
    }

    public void onStop(HostType hosttype) {
    }
}
