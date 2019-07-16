package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.iid.f reason: case insensitive filesystem */
public final class C2499f {
    private static C2499f a;
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService c;
    private C2501h d = new C2501h(this);
    private int e = 1;

    private C2499f(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized C2499f a(Context context) {
        C2499f fVar;
        synchronized (C2499f.class) {
            if (a == null) {
                a = new C2499f(context, Ds.a().a(1, new NamedThreadFactory("MessengerIpcClient"), Is.a));
            }
            fVar = a;
        }
        return fVar;
    }

    public final Wy<Bundle> b(int i, Bundle bundle) {
        return a((C2506m<T>) new C2508o<T>(a(), 1, bundle));
    }

    public final Wy<Void> a(int i, Bundle bundle) {
        return a((C2506m<T>) new C2507n<T>(a(), 2, bundle));
    }

    private final synchronized <T> Wy<T> a(C2506m<T> mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(mVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.d.a((C2506m) mVar)) {
            this.d = new C2501h(this);
            this.d.a((C2506m) mVar);
        }
        return mVar.b.a();
    }

    private final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }
}
