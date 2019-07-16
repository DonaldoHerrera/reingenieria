package com.soundcloud.lightcycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.soundcloud.lightcycle.util.LightCycleBinderHelper;
import com.soundcloud.lightcycle.util.Preconditions;
import java.util.HashSet;
import java.util.Set;

public class SupportFragmentLightCycleDispatcher<HostType> implements LightCycleDispatcher<SupportFragmentLightCycle<HostType>>, SupportFragmentLightCycle<HostType> {
    private final LightCycleBinderHelper binderHelper = new LightCycleBinderHelper(this);
    private final Set<SupportFragmentLightCycle<HostType>> fragmentLightCycles = new HashSet();

    public void onActivityCreated(HostType hosttype, Bundle bundle) {
        for (SupportFragmentLightCycle onActivityCreated : this.fragmentLightCycles) {
            onActivityCreated.onActivityCreated(hosttype, bundle);
        }
    }

    public void onAttach(HostType hosttype, Activity activity) {
        this.binderHelper.bindIfNecessary();
        for (SupportFragmentLightCycle onAttach : this.fragmentLightCycles) {
            onAttach.onAttach(hosttype, activity);
        }
    }

    public void onCreate(HostType hosttype, Bundle bundle) {
        for (SupportFragmentLightCycle onCreate : this.fragmentLightCycles) {
            onCreate.onCreate(hosttype, bundle);
        }
    }

    public void onDestroy(HostType hosttype) {
        for (SupportFragmentLightCycle onDestroy : this.fragmentLightCycles) {
            onDestroy.onDestroy(hosttype);
        }
    }

    public void onDestroyView(HostType hosttype) {
        for (SupportFragmentLightCycle onDestroyView : this.fragmentLightCycles) {
            onDestroyView.onDestroyView(hosttype);
        }
    }

    public void onDetach(HostType hosttype) {
        for (SupportFragmentLightCycle onDetach : this.fragmentLightCycles) {
            onDetach.onDetach(hosttype);
        }
    }

    public boolean onOptionsItemSelected(HostType hosttype, MenuItem menuItem) {
        for (SupportFragmentLightCycle onOptionsItemSelected : this.fragmentLightCycles) {
            if (onOptionsItemSelected.onOptionsItemSelected(hosttype, menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPause(HostType hosttype) {
        for (SupportFragmentLightCycle onPause : this.fragmentLightCycles) {
            onPause.onPause(hosttype);
        }
    }

    public void onResume(HostType hosttype) {
        for (SupportFragmentLightCycle onResume : this.fragmentLightCycles) {
            onResume.onResume(hosttype);
        }
    }

    public void onSaveInstanceState(HostType hosttype, Bundle bundle) {
        for (SupportFragmentLightCycle onSaveInstanceState : this.fragmentLightCycles) {
            onSaveInstanceState.onSaveInstanceState(hosttype, bundle);
        }
    }

    public void onStart(HostType hosttype) {
        for (SupportFragmentLightCycle onStart : this.fragmentLightCycles) {
            onStart.onStart(hosttype);
        }
    }

    public void onStop(HostType hosttype) {
        for (SupportFragmentLightCycle onStop : this.fragmentLightCycles) {
            onStop.onStop(hosttype);
        }
    }

    public void onViewCreated(HostType hosttype, View view, Bundle bundle) {
        for (SupportFragmentLightCycle onViewCreated : this.fragmentLightCycles) {
            onViewCreated.onViewCreated(hosttype, view, bundle);
        }
    }

    public void bind(SupportFragmentLightCycle<HostType> supportFragmentLightCycle) {
        Preconditions.checkBindingTarget((SupportFragmentLightCycle) supportFragmentLightCycle);
        this.fragmentLightCycles.add(supportFragmentLightCycle);
    }
}
