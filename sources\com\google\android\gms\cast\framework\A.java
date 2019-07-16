package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.cast.framework.r;

public final class A<T extends r> extends Z {
    private final C0667t<T> a;
    private final Class<T> b;

    public A(C0667t<T> tVar, Class<T> cls) {
        this.a = tVar;
        this.b = cls;
    }

    public final int a() {
        return 12451009;
    }

    public final void a(Dr dr) throws RemoteException {
        r rVar = (r) Er.c(dr);
        if (this.b.isInstance(rVar)) {
            C0667t<T> tVar = this.a;
            if (tVar != null) {
                tVar.b((r) this.b.cast(rVar));
            }
        }
    }

    public final void b(Dr dr) throws RemoteException {
        r rVar = (r) Er.c(dr);
        if (this.b.isInstance(rVar)) {
            C0667t<T> tVar = this.a;
            if (tVar != null) {
                tVar.a((r) this.b.cast(rVar));
            }
        }
    }

    public final void c(Dr dr, int i) throws RemoteException {
        r rVar = (r) Er.c(dr);
        if (this.b.isInstance(rVar)) {
            C0667t<T> tVar = this.a;
            if (tVar != null) {
                tVar.c((r) this.b.cast(rVar), i);
            }
        }
    }

    public final void d(Dr dr, int i) throws RemoteException {
        r rVar = (r) Er.c(dr);
        if (this.b.isInstance(rVar)) {
            C0667t<T> tVar = this.a;
            if (tVar != null) {
                tVar.b((r) this.b.cast(rVar), i);
            }
        }
    }

    public final Dr f() {
        return Er.a(this.a);
    }

    public final void a(Dr dr, String str) throws RemoteException {
        r rVar = (r) Er.c(dr);
        if (this.b.isInstance(rVar)) {
            C0667t<T> tVar = this.a;
            if (tVar != null) {
                tVar.a((r) this.b.cast(rVar), str);
            }
        }
    }

    public final void b(Dr dr, String str) throws RemoteException {
        r rVar = (r) Er.c(dr);
        if (this.b.isInstance(rVar)) {
            C0667t<T> tVar = this.a;
            if (tVar != null) {
                tVar.b((r) this.b.cast(rVar), str);
            }
        }
    }

    public final void a(Dr dr, boolean z) throws RemoteException {
        r rVar = (r) Er.c(dr);
        if (this.b.isInstance(rVar)) {
            C0667t<T> tVar = this.a;
            if (tVar != null) {
                tVar.a((r) this.b.cast(rVar), z);
            }
        }
    }

    public final void b(Dr dr, int i) throws RemoteException {
        r rVar = (r) Er.c(dr);
        if (this.b.isInstance(rVar)) {
            C0667t<T> tVar = this.a;
            if (tVar != null) {
                tVar.a((r) this.b.cast(rVar), i);
            }
        }
    }

    public final void a(Dr dr, int i) throws RemoteException {
        r rVar = (r) Er.c(dr);
        if (this.b.isInstance(rVar)) {
            C0667t<T> tVar = this.a;
            if (tVar != null) {
                tVar.d((r) this.b.cast(rVar), i);
            }
        }
    }
}
