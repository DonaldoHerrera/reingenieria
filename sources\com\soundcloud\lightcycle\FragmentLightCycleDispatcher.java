package com.soundcloud.lightcycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.soundcloud.lightcycle.util.LightCycleBinderHelper;
import com.soundcloud.lightcycle.util.Preconditions;
import java.util.HashSet;
import java.util.Set;

@TargetApi(11)
public class FragmentLightCycleDispatcher<HostType> implements LightCycleDispatcher<FragmentLightCycle<HostType>>, FragmentLightCycle<HostType> {
    private final LightCycleBinderHelper binderHelper = new LightCycleBinderHelper(this);
    private final Set<FragmentLightCycle<HostType>> fragmentLightCycles = new HashSet();

    public void onActivityCreated(HostType hosttype, Bundle bundle) {
        for (FragmentLightCycle onActivityCreated : this.fragmentLightCycles) {
            onActivityCreated.onActivityCreated(hosttype, bundle);
        }
    }

    public void onAttach(HostType hosttype, Activity activity) {
        this.binderHelper.bindIfNecessary();
        for (FragmentLightCycle onAttach : this.fragmentLightCycles) {
            onAttach.onAttach(hosttype, activity);
        }
    }

    public void onCreate(HostType hosttype, Bundle bundle) {
        for (FragmentLightCycle onCreate : this.fragmentLightCycles) {
            onCreate.onCreate(hosttype, bundle);
        }
    }

    public void onDestroy(HostType hosttype) {
        for (FragmentLightCycle onDestroy : this.fragmentLightCycles) {
            onDestroy.onDestroy(hosttype);
        }
    }

    public void onDestroyView(HostType hosttype) {
        for (FragmentLightCycle onDestroyView : this.fragmentLightCycles) {
            onDestroyView.onDestroyView(hosttype);
        }
    }

    public void onDetach(HostType hosttype) {
        for (FragmentLightCycle onDetach : this.fragmentLightCycles) {
            onDetach.onDetach(hosttype);
        }
    }

    public boolean onOptionsItemSelected(HostType hosttype, MenuItem menuItem) {
        for (FragmentLightCycle onOptionsItemSelected : this.fragmentLightCycles) {
            if (onOptionsItemSelected.onOptionsItemSelected(hosttype, menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPause(HostType hosttype) {
        for (FragmentLightCycle onPause : this.fragmentLightCycles) {
            onPause.onPause(hosttype);
        }
    }

    public void onResume(HostType hosttype) {
        for (FragmentLightCycle onResume : this.fragmentLightCycles) {
            onResume.onResume(hosttype);
        }
    }

    public void onSaveInstanceState(HostType hosttype, Bundle bundle) {
        for (FragmentLightCycle onSaveInstanceState : this.fragmentLightCycles) {
            onSaveInstanceState.onSaveInstanceState(hosttype, bundle);
        }
    }

    public void onStart(HostType hosttype) {
        for (FragmentLightCycle onStart : this.fragmentLightCycles) {
            onStart.onStart(hosttype);
        }
    }

    public void onStop(HostType hosttype) {
        for (FragmentLightCycle onStop : this.fragmentLightCycles) {
            onStop.onStop(hosttype);
        }
    }

    public void onViewCreated(HostType hosttype, View view, Bundle bundle) {
        for (FragmentLightCycle onViewCreated : this.fragmentLightCycles) {
            onViewCreated.onViewCreated(hosttype, view, bundle);
        }
    }

    public void bind(FragmentLightCycle<HostType> fragmentLightCycle) {
        Preconditions.checkBindingTarget((FragmentLightCycle) fragmentLightCycle);
        this.fragmentLightCycles.add(fragmentLightCycle);
    }

    public void onAttach(HostType hosttype, Context context) {
        this.binderHelper.bindIfNecessary();
        for (FragmentLightCycle onAttach : this.fragmentLightCycles) {
            onAttach.onAttach(hosttype, context);
        }
    }
}
