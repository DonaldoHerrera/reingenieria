package com.soundcloud.android.creators.upload;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.ia.l;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

public class UploadMonitorFragment extends LightCycleSupportFragment<UploadMonitorFragment> {
    @LightCycle
    UploadMonitorPresenter a;

    public final class LightCycleBinder {
        public static void bind(UploadMonitorFragment uploadMonitorFragment) {
            uploadMonitorFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) uploadMonitorFragment.a));
        }
    }

    public UploadMonitorFragment() {
        SoundCloudApplication.f().a(this);
    }

    public static Fragment a(Recording recording) {
        UploadMonitorFragment uploadMonitorFragment = new UploadMonitorFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("recording", recording);
        uploadMonitorFragment.setArguments(bundle);
        return uploadMonitorFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(l.upload_monitor, viewGroup, false);
    }
}
