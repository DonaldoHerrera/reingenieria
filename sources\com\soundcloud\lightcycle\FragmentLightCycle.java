package com.soundcloud.lightcycle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public interface FragmentLightCycle<T> {
    void onActivityCreated(T t, Bundle bundle);

    void onAttach(T t, Activity activity);

    void onAttach(T t, Context context);

    void onCreate(T t, Bundle bundle);

    void onDestroy(T t);

    void onDestroyView(T t);

    void onDetach(T t);

    boolean onOptionsItemSelected(T t, MenuItem menuItem);

    void onPause(T t);

    void onResume(T t);

    void onSaveInstanceState(T t, Bundle bundle);

    void onStart(T t);

    void onStop(T t);

    void onViewCreated(T t, View view, Bundle bundle);
}
