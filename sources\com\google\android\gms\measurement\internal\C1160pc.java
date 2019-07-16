package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzx;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.pc reason: case insensitive filesystem */
public final class C1160pc {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    zzx g;
    boolean h = true;

    @VisibleForTesting
    public C1160pc(Context context, zzx zzx) {
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.a = applicationContext;
        if (zzx != null) {
            this.g = zzx;
            this.b = zzx.f;
            this.c = zzx.e;
            this.d = zzx.d;
            this.h = zzx.c;
            this.f = zzx.b;
            Bundle bundle = zzx.g;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
