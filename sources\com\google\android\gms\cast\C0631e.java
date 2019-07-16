package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Surface;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.cast.C0704fa;
import com.google.android.gms.internal.cast.C0710ia;
import com.google.android.gms.internal.cast.wa;
import com.google.android.gms.internal.cast.za;

@TargetApi(19)
/* renamed from: com.google.android.gms.cast.e reason: case insensitive filesystem */
public class C0631e extends GoogleApi<NoOptions> {
    private static final AbstractClientBuilder<wa, NoOptions> a = new V();
    private static final Api<NoOptions> b = new Api<>("CastRemoteDisplay.API", a, C0704fa.c);
    /* access modifiers changed from: private */
    public final C0710ia c = new C0710ia("CastRemoteDisplay");
    private VirtualDisplay d;

    /* renamed from: com.google.android.gms.cast.e$a */
    private static class a extends za {
        private a() {
        }

        public void a(int i, int i2, Surface surface) throws RemoteException {
            throw new UnsupportedOperationException();
        }

        public void zzd() throws RemoteException {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ a(V v) {
            this();
        }
    }

    C0631e(Context context) {
        super(context, b, null, Settings.DEFAULT_SETTINGS);
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    public final void b() {
        VirtualDisplay virtualDisplay = this.d;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                C0710ia iaVar = this.c;
                int displayId = this.d.getDisplay().getDisplayId();
                StringBuilder sb = new StringBuilder(38);
                sb.append("releasing virtual display: ");
                sb.append(displayId);
                iaVar.a(sb.toString(), new Object[0]);
            }
            this.d.release();
            this.d = null;
        }
    }

    public Wy<Void> a() {
        return doWrite((TaskApiCall<A, TResult>) new X<A,TResult>(this));
    }
}
