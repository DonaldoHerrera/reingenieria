package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.Mb;

@ShowFirstParty
public class Analytics {
    private static volatile Analytics a;
    private final Mb b;

    private Analytics(Mb mb) {
        Preconditions.checkNotNull(mb);
        this.b = mb;
    }

    @ShowFirstParty
    @Keep
    public static Analytics getInstance(Context context) {
        if (a == null) {
            synchronized (Analytics.class) {
                if (a == null) {
                    a = new Analytics(Mb.a(context, (zzx) null));
                }
            }
        }
        return a;
    }
}
