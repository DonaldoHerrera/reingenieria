package com.soundcloud.android.playback.playqueue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.l;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

public class PlayQueueFragment extends LightCycleSupportFragment<PlayQueueFragment> {
    @LightCycle
    ArtworkView a;
    @LightCycle
    PlayQueueView b;

    public final class LightCycleBinder {
        public static void bind(PlayQueueFragment playQueueFragment) {
            playQueueFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) playQueueFragment.a));
            playQueueFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) playQueueFragment.b));
        }
    }

    public PlayQueueFragment() {
        setRetainInstance(true);
        SoundCloudApplication.f().a(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(l.player_play_queue, viewGroup, false);
    }
}
