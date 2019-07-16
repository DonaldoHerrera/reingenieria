package com.soundcloud.android.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.ads.C2633va;
import com.soundcloud.android.ads.Ca;
import com.soundcloud.android.playback.ui.ac;
import com.soundcloud.android.playback.ui.ac.b;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.ActivityLightCycleDispatcher;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class PlayerController extends ActivityLightCycleDispatcher<AppCompatActivity> {
    @LightCycle
    final ac a;
    @LightCycle
    final Ca b;
    @LightCycle
    final C2633va c;
    private final C5052KJa d;

    public final class LightCycleBinder {
        public static void bind(PlayerController playerController) {
            playerController.bind(LightCycles.lift((ActivityLightCycle<Source>) playerController.a));
            playerController.bind(LightCycles.lift((ActivityLightCycle<Source>) playerController.b));
            playerController.bind(LightCycles.lift((ActivityLightCycle<Source>) playerController.c));
        }
    }

    public PlayerController(ac acVar, Ca ca, C2633va vaVar, C5052KJa kJa) {
        this.a = acVar;
        this.b = ca;
        this.c = vaVar;
        this.d = kJa;
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        this.d.a();
        super.onPause(appCompatActivity);
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        super.onResume(appCompatActivity);
        this.d.a((FragmentActivity) appCompatActivity, this.a);
    }

    public boolean l() {
        return this.a.y();
    }

    public void a(b bVar) {
        this.a.a(bVar);
    }

    public void b(b bVar) {
        this.a.b(bVar);
    }
}
