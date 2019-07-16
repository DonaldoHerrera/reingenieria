package com.soundcloud.lightcycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.soundcloud.lightcycle.util.Preconditions;

public abstract class LightCycleActivity<HostType> extends Activity implements LightCycleDispatcher<ActivityLightCycle<HostType>> {
    private final ActivityLightCycleDispatcher<HostType> lightCycleDispatcher = new ActivityLightCycleDispatcher<>();

    private HostType host() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActivityContentView();
        LightCycles.bind(this);
        ActivityLightCycleDispatcher<HostType> activityLightCycleDispatcher = this.lightCycleDispatcher;
        host();
        activityLightCycleDispatcher.onCreate(this, bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ActivityLightCycleDispatcher<HostType> activityLightCycleDispatcher = this.lightCycleDispatcher;
        host();
        activityLightCycleDispatcher.onDestroy(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ActivityLightCycleDispatcher<HostType> activityLightCycleDispatcher = this.lightCycleDispatcher;
        host();
        activityLightCycleDispatcher.onNewIntent(this, intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ActivityLightCycleDispatcher<HostType> activityLightCycleDispatcher = this.lightCycleDispatcher;
        host();
        return activityLightCycleDispatcher.onOptionsItemSelected(this, menuItem);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        ActivityLightCycleDispatcher<HostType> activityLightCycleDispatcher = this.lightCycleDispatcher;
        host();
        activityLightCycleDispatcher.onPause(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ActivityLightCycleDispatcher<HostType> activityLightCycleDispatcher = this.lightCycleDispatcher;
        host();
        activityLightCycleDispatcher.onRestoreInstanceState(this, bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        ActivityLightCycleDispatcher<HostType> activityLightCycleDispatcher = this.lightCycleDispatcher;
        host();
        activityLightCycleDispatcher.onResume(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ActivityLightCycleDispatcher<HostType> activityLightCycleDispatcher = this.lightCycleDispatcher;
        host();
        activityLightCycleDispatcher.onSaveInstanceState(this, bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        ActivityLightCycleDispatcher<HostType> activityLightCycleDispatcher = this.lightCycleDispatcher;
        host();
        activityLightCycleDispatcher.onStart(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        ActivityLightCycleDispatcher<HostType> activityLightCycleDispatcher = this.lightCycleDispatcher;
        host();
        activityLightCycleDispatcher.onStop(this);
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public abstract void setActivityContentView();

    public void bind(ActivityLightCycle<HostType> activityLightCycle) {
        Preconditions.checkBindingTarget((ActivityLightCycle) activityLightCycle);
        this.lightCycleDispatcher.bind(activityLightCycle);
    }
}
