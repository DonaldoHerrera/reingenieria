package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.C0710ia;
import com.google.android.gms.internal.cast.ta;

public abstract class r {
    private static final C0710ia a = new C0710ia("Session");
    private final U b;
    private final a c = new a();

    private class a extends C0671x {
        private a() {
        }

        public final int a() {
            return 12451009;
        }

        public final void b(Bundle bundle) {
            r.this.a(bundle);
        }

        public final void c(Bundle bundle) {
            r.this.c(bundle);
        }

        public final void e(Bundle bundle) {
            r.this.d(bundle);
        }

        public final void f(Bundle bundle) {
            r.this.b(bundle);
        }

        public final long w() {
            return r.this.a();
        }

        public final Dr z() {
            return Er.a(r.this);
        }

        public final void c(boolean z) {
            r.this.a(z);
        }
    }

    protected r(Context context, String str, String str2) {
        this.b = ta.a(context, str, str2, (C0672y) this.c);
    }

    public long a() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return 0;
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public void b(Bundle bundle) {
    }

    public boolean b() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return this.b.isConnected();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "isConnected", U.class.getSimpleName());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(Bundle bundle);

    public boolean c() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return this.b.isConnecting();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "isConnecting", U.class.getSimpleName());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void d(Bundle bundle);

    public boolean d() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return this.b.r();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "isResuming", U.class.getSimpleName());
            return false;
        }
    }

    public final Dr e() {
        try {
            return this.b.d();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedObject", U.class.getSimpleName());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        try {
            this.b.g(i);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", U.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public final void b(int i) {
        try {
            this.b.l(i);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "notifyFailedToStartSession", U.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public final void c(int i) {
        try {
            this.b.k(i);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "notifySessionEnded", U.class.getSimpleName());
        }
    }
}
