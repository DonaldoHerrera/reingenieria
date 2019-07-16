package com.google.firebase.perf.internal;

import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.firebase-perf.C0848i;
import com.google.android.gms.internal.firebase-perf.C0915z;
import java.util.concurrent.TimeUnit;

@Keep
public class FeatureControl {
    private static final FeatureControl zzcf = new FeatureControl();
    private static final long zzci = TimeUnit.HOURS.toMinutes(4);
    private final RemoteConfigManager zzcg;
    private C0915z zzch;

    private FeatureControl() {
        this(RemoteConfigManager.zzbz(), null);
    }

    public static synchronized FeatureControl zzao() {
        FeatureControl featureControl;
        synchronized (FeatureControl.class) {
            featureControl = zzcf;
        }
        return featureControl;
    }

    private final long zzb(String str, long j) {
        int a = this.zzch.a(str, C0848i.a(this.zzcg.zzc(str, j)));
        return (a == Integer.MAX_VALUE || a == Integer.MIN_VALUE) ? j : (long) a;
    }

    public final void zza(C0915z zVar) {
        this.zzch = zVar;
    }

    public final boolean zzap() {
        return zzb("sessions_feature_enabled", 1) != 0;
    }

    public final boolean zzaq() {
        return zzb("sessions_cpu_capture_enabled", 1) != 0;
    }

    public final boolean zzar() {
        return zzb("sessions_memory_capture_enabled", 1) != 0;
    }

    public final float zzas() {
        String str = "sessions_sampling_percentage";
        return this.zzch.a(str, this.zzcg.zza(str, 1.0f));
    }

    public final long zzat() {
        return zzb("sessions_cpu_capture_frequency_fg_ms", 100);
    }

    public final long zzau() {
        return zzb("sessions_memory_capture_frequency_fg_ms", 100);
    }

    public final long zzav() {
        return zzb("sessions_cpu_capture_frequency_bg_ms", 0);
    }

    public final long zzaw() {
        return zzb("sessions_memory_capture_frequency_bg_ms", 0);
    }

    public final long zzax() {
        return zzb("sessions_max_length_minutes", zzci);
    }

    @VisibleForTesting
    private FeatureControl(RemoteConfigManager remoteConfigManager, C0915z zVar) {
        this.zzcg = remoteConfigManager;
        this.zzch = new C0915z();
    }
}
