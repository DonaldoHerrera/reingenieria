package com.soundcloud.lightcycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public interface ActivityLightCycle<T> {
    void onCreate(T t, Bundle bundle);

    void onDestroy(T t);

    void onNewIntent(T t, Intent intent);

    boolean onOptionsItemSelected(T t, MenuItem menuItem);

    void onPause(T t);

    void onRestoreInstanceState(T t, Bundle bundle);

    void onResume(T t);

    void onSaveInstanceState(T t, Bundle bundle);

    void onStart(T t);

    void onStop(T t);
}
