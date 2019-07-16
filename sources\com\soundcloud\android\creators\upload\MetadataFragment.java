package com.soundcloud.android.creators.upload;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.l;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

public class MetadataFragment extends LightCycleSupportFragment<MetadataFragment> {
    @LightCycle
    MetadataPresenter a;

    public final class LightCycleBinder {
        public static void bind(MetadataFragment metadataFragment) {
            metadataFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) metadataFragment.a));
        }
    }

    public MetadataFragment() {
        SoundCloudApplication.f().a(this);
    }

    public static Fragment Qb() {
        return new MetadataFragment();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.a.a(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(l.sc_upload, viewGroup, false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.a.a(i, iArr);
    }
}
