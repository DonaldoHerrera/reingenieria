package com.soundcloud.lightcycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.soundcloud.lightcycle.util.Preconditions;
import java.util.HashSet;
import java.util.Set;

public class ActivityLightCycleDispatcher<HostType> implements LightCycleDispatcher<ActivityLightCycle<HostType>>, ActivityLightCycle<HostType> {
    private final Set<ActivityLightCycle<HostType>> activityLightCycles = new HashSet();

    public void onCreate(HostType hosttype, Bundle bundle) {
        LightCycles.bind(this);
        for (ActivityLightCycle onCreate : this.activityLightCycles) {
            onCreate.onCreate(hosttype, bundle);
        }
    }

    public void onDestroy(HostType hosttype) {
        for (ActivityLightCycle onDestroy : this.activityLightCycles) {
            onDestroy.onDestroy(hosttype);
        }
    }

    public void onNewIntent(HostType hosttype, Intent intent) {
        for (ActivityLightCycle onNewIntent : this.activityLightCycles) {
            onNewIntent.onNewIntent(hosttype, intent);
        }
    }

    public boolean onOptionsItemSelected(HostType hosttype, MenuItem menuItem) {
        for (ActivityLightCycle onOptionsItemSelected : this.activityLightCycles) {
            if (onOptionsItemSelected.onOptionsItemSelected(hosttype, menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPause(HostType hosttype) {
        for (ActivityLightCycle onPause : this.activityLightCycles) {
            onPause.onPause(hosttype);
        }
    }

    public void onRestoreInstanceState(HostType hosttype, Bundle bundle) {
        for (ActivityLightCycle onRestoreInstanceState : this.activityLightCycles) {
            onRestoreInstanceState.onRestoreInstanceState(hosttype, bundle);
        }
    }

    public void onResume(HostType hosttype) {
        for (ActivityLightCycle onResume : this.activityLightCycles) {
            onResume.onResume(hosttype);
        }
    }

    public void onSaveInstanceState(HostType hosttype, Bundle bundle) {
        for (ActivityLightCycle onSaveInstanceState : this.activityLightCycles) {
            onSaveInstanceState.onSaveInstanceState(hosttype, bundle);
        }
    }

    public void onStart(HostType hosttype) {
        for (ActivityLightCycle onStart : this.activityLightCycles) {
            onStart.onStart(hosttype);
        }
    }

    public void onStop(HostType hosttype) {
        for (ActivityLightCycle onStop : this.activityLightCycles) {
            onStop.onStop(hosttype);
        }
    }

    public void bind(ActivityLightCycle<HostType> activityLightCycle) {
        Preconditions.checkBindingTarget((ActivityLightCycle) activityLightCycle);
        this.activityLightCycles.add(activityLightCycle);
    }
}
