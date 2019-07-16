package com.soundcloud.android.features.record;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.features.record.G.l;
import com.soundcloud.android.features.record.G.n;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import com.soundcloud.lightcycle.LightCycles;
import com.soundcloud.lightcycle.SupportFragmentLightCycle;

public class RecordFragment extends LightCycleSupportFragment<RecordFragment> {
    @LightCycle
    N a;

    public final class LightCycleBinder {
        public static void bind(RecordFragment recordFragment) {
            recordFragment.bind(LightCycles.lift((SupportFragmentLightCycle<Source>) recordFragment.a));
        }
    }

    public enum a {
        IDLE_RECORD(n.rec_title_idle_rec),
        RECORD(n.rec_title_recording),
        IDLE_PLAYBACK(n.rec_title_idle_play),
        PLAYBACK(n.rec_title_playing),
        EDIT(n.rec_title_editing),
        EDIT_PLAYBACK(n.rec_title_editing);
        
        private final int h;

        private a(int i) {
            this.h = i;
        }

        public int a() {
            return this.h;
        }

        public boolean b() {
            return this == EDIT || this == EDIT_PLAYBACK;
        }

        public boolean c() {
            return this == PLAYBACK || this == EDIT_PLAYBACK;
        }
    }

    public static Fragment Qb() {
        return new RecordFragment();
    }

    public void onAttach(Context context) {
        dagger.android.support.a.a(this);
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(l.sc_create, viewGroup, false);
    }
}
