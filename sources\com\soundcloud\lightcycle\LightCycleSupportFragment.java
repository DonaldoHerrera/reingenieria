package com.soundcloud.lightcycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.soundcloud.lightcycle.util.LightCycleBinderHelper;
import com.soundcloud.lightcycle.util.Preconditions;

public abstract class LightCycleSupportFragment<HostType> extends Fragment implements LightCycleDispatcher<SupportFragmentLightCycle<HostType>> {
    private final LightCycleBinderHelper binderHelper = new LightCycleBinderHelper(this);
    private final SupportFragmentLightCycleDispatcher<HostType> lifeCycleDispatcher = new SupportFragmentLightCycleDispatcher<>();

    private HostType host() {
        return this;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onActivityCreated(this, bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.binderHelper.bindIfNecessary();
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onAttach(this, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onCreate(this, bundle);
    }

    public void onDestroy() {
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onDestroy(this);
        super.onDestroy();
    }

    public void onDestroyView() {
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onDestroyView(this);
        super.onDestroyView();
    }

    public void onDetach() {
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onDetach(this);
        super.onDetach();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        return supportFragmentLightCycleDispatcher.onOptionsItemSelected(this, menuItem);
    }

    public void onPause() {
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onPause(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onResume(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onSaveInstanceState(this, bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onStart(this);
    }

    public void onStop() {
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onStop(this);
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SupportFragmentLightCycleDispatcher<HostType> supportFragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        supportFragmentLightCycleDispatcher.onViewCreated(this, view, bundle);
    }

    public void bind(SupportFragmentLightCycle<HostType> supportFragmentLightCycle) {
        Preconditions.checkBindingTarget((SupportFragmentLightCycle) supportFragmentLightCycle);
        this.lifeCycleDispatcher.bind(supportFragmentLightCycle);
    }
}
