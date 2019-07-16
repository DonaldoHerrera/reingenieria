package com.soundcloud.android.playback.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.playback.ui.view.PlayerTrackPager;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;
import dagger.android.support.a;

public class PlayerFragment extends LightCycleSupportFragment<PlayerFragment> implements C4451fb {
    @LightCycle
    PlayerPresenter a;

    public final class LightCycleBinder {
        public static void bind(PlayerFragment playerFragment) {
            playerFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) playerFragment.a));
        }
    }

    public PlayerTrackPager Bb() {
        View view = getView();
        if (view != null) {
            return (PlayerTrackPager) view.findViewById(i.player_track_pager);
        }
        return null;
    }

    public boolean Sa() {
        return this.a.v();
    }

    public void a(float f) {
        this.a.a(f);
    }

    public void onAttach(Activity activity) {
        a.a(this);
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(l.player_fragment, viewGroup, false);
    }
}
