package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.C0710ia;

/* renamed from: com.google.android.gms.cast.framework.s reason: case insensitive filesystem */
public class C0666s {
    private static final C0710ia a = new C0710ia("SessionManager");
    private final Y b;
    private final Context c;

    public C0666s(Y y, Context context) {
        this.b = y;
        this.c = context;
    }

    public C0636d a() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        r b2 = b();
        if (b2 == null || !(b2 instanceof C0636d)) {
            return null;
        }
        return (C0636d) b2;
    }

    public r b() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            return (r) Er.c(this.b.e());
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", Y.class.getSimpleName());
            return null;
        }
    }

    public final Dr c() {
        try {
            return this.b.i();
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "getWrappedThis", Y.class.getSimpleName());
            return null;
        }
    }

    public void a(boolean z) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            this.b.a(true, z);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "endCurrentSession", Y.class.getSimpleName());
        }
    }

    public <T extends r> void b(C0667t<T> tVar, Class cls) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (tVar != null) {
            try {
                this.b.a((aa) new A(tVar, cls));
            } catch (RemoteException e) {
                a.a(e, "Unable to call %s on %s.", "removeSessionManagerListener", Y.class.getSimpleName());
            }
        }
    }

    public <T extends r> void a(C0667t<T> tVar, Class<T> cls) throws NullPointerException {
        Preconditions.checkNotNull(tVar);
        Preconditions.checkNotNull(cls);
        Preconditions.checkMainThread("Must be called from the main thread.");
        try {
            this.b.b(new A(tVar, cls));
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "addSessionManagerListener", Y.class.getSimpleName());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(C0638f fVar) throws NullPointerException {
        Preconditions.checkNotNull(fVar);
        try {
            this.b.a((P) new F(fVar));
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "addCastStateListener", Y.class.getSimpleName());
        }
    }
}
