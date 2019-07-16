package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.hardware.display.VirtualDisplay;
import com.google.android.gms.cast.C0630d;
import com.google.android.gms.common.api.Api;

@Deprecated
/* renamed from: com.google.android.gms.internal.cast.ra reason: case insensitive filesystem */
public final class C0727ra implements C0630d {
    /* access modifiers changed from: private */
    public static final C0710ia a = new C0710ia("CastRemoteDisplayApiImpl");
    private Api<?> b;
    private VirtualDisplay c;
    private final Aa d = new ua(this);

    public C0727ra(Api api) {
        this.b = api;
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    public final void b() {
        VirtualDisplay virtualDisplay = this.c;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                C0710ia iaVar = a;
                int displayId = this.c.getDisplay().getDisplayId();
                StringBuilder sb = new StringBuilder(38);
                sb.append("releasing virtual display: ");
                sb.append(displayId);
                iaVar.a(sb.toString(), new Object[0]);
            }
            this.c.release();
            this.c = null;
        }
    }
}
