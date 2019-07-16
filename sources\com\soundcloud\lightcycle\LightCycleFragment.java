package com.soundcloud.lightcycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.soundcloud.lightcycle.util.LightCycleBinderHelper;
import com.soundcloud.lightcycle.util.Preconditions;

@TargetApi(11)
public abstract class LightCycleFragment<HostType> extends Fragment implements LightCycleDispatcher<FragmentLightCycle<HostType>> {
    private final LightCycleBinderHelper binderHelper = new LightCycleBinderHelper(this);
    private final FragmentLightCycleDispatcher<HostType> lifeCycleDispatcher = new FragmentLightCycleDispatcher<>();

    private HostType host() {
        return this;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onActivityCreated(this, bundle);
    }

    @TargetApi(23)
    public void onAttach(Context context) {
        super.onAttach(context);
        this.binderHelper.bindIfNecessary();
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onAttach(this, context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onCreate(this, bundle);
    }

    public void onDestroy() {
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onDestroy(this);
        super.onDestroy();
    }

    public void onDestroyView() {
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onDestroyView(this);
        super.onDestroyView();
    }

    public void onDetach() {
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onDetach(this);
        super.onDetach();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        return fragmentLightCycleDispatcher.onOptionsItemSelected(this, menuItem);
    }

    public void onPause() {
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onPause(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onResume(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onSaveInstanceState(this, bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onStart(this);
    }

    public void onStop() {
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onStop(this);
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onViewCreated(this, view, bundle);
    }

    public void bind(FragmentLightCycle<HostType> fragmentLightCycle) {
        Preconditions.checkBindingTarget((FragmentLightCycle) fragmentLightCycle);
        this.lifeCycleDispatcher.bind(fragmentLightCycle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.binderHelper.bindIfNecessary();
        FragmentLightCycleDispatcher<HostType> fragmentLightCycleDispatcher = this.lifeCycleDispatcher;
        host();
        fragmentLightCycleDispatcher.onAttach(this, activity);
    }
}
