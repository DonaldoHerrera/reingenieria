package defpackage;

import com.soundcloud.android.playback.C4431ub;
import java.util.Collection;
import java.util.UUID;

/* renamed from: jO reason: default package and case insensitive filesystem */
/* compiled from: MobilePlaySessionBuilder.kt */
public class C3074jO {
    private C3131mO a;
    private boolean b;
    private C3217qO c = new C2301TN();
    private C2320UN d;
    private final C5694cGa e;

    public C3074jO(C5694cGa cga) {
        C7471uYa.b(cga, "dateProvider");
        this.e = cga;
    }

    private C3217qO e(C4431ub ubVar) {
        C2320UN un = this.d;
        if (un == null) {
            return f(ubVar);
        }
        if (un == null) {
            C7471uYa.a();
            throw null;
        } else if (!(!C7471uYa.a((Object) un.d(), (Object) ubVar.s().toString()))) {
            return a(this.e.a());
        } else {
            C2320UN un2 = this.d;
            if (un2 != null) {
                a(un2);
                return f(ubVar);
            }
            C7471uYa.a();
            throw null;
        }
    }

    private C3217qO f(C4431ub ubVar) {
        SDb.a("MobilePlay").d("Starting a new Play Session.", new Object[0]);
        long a2 = this.e.a();
        C3179oO oOVar = new C3179oO(a2, d(ubVar));
        String cda = ubVar.s().toString();
        C7471uYa.a((Object) cda, "playState.playingItemUrn.toString()");
        String uuid = UUID.randomUUID().toString();
        C7471uYa.a((Object) uuid, "UUID.randomUUID().toString()");
        C2320UN un = new C2320UN(cda, 0, uuid, C6850lWa.a(oOVar));
        this.d = un;
        return new C3198pO(a2);
    }

    public void a(C3131mO mOVar) {
        this.a = mOVar;
    }

    public C3131mO b() {
        return this.a;
    }

    public void c(C4431ub ubVar) {
        C7471uYa.b(ubVar, "playState");
        this.b = true;
        long a2 = this.e.a();
        C3217qO qOVar = this.c;
        if (qOVar instanceof C2301TN) {
            C2320UN un = this.d;
            if (un != null) {
                this.d = a(un, a2, d(ubVar));
            } else {
                C7471uYa.a();
                throw null;
            }
        } else if (qOVar instanceof C3198pO) {
            this.c = a(a2, (C3198pO) qOVar, ubVar);
        }
    }

    public void d() {
        this.b = false;
    }

    private C3217qO a(long j, C3198pO pOVar, C4431ub ubVar) {
        C3217qO b2 = b(j, pOVar, ubVar);
        if (ubVar.m()) {
            C2320UN un = this.d;
            if (un != null) {
                a(un);
                this.d = null;
            } else {
                C7471uYa.a();
                throw null;
            }
        }
        return b2;
    }

    private String d(C4431ub ubVar) {
        if (ubVar.f()) {
            return "BUFFERING";
        }
        return ubVar.j() ? "PLAYING" : "IDLE";
    }

    public void b(C4431ub ubVar) {
        C7471uYa.b(ubVar, "localPlay");
        this.b = true;
        C3217qO qOVar = this.c;
        if (qOVar instanceof C3198pO) {
            throw new IllegalStateException("Transition from Playing to Playing");
        } else if (qOVar instanceof C2301TN) {
            this.c = e(ubVar);
        }
    }

    public boolean c() {
        return this.b;
    }

    private C3217qO b(long j, C3198pO pOVar, C4431ub ubVar) {
        C2320UN un = this.d;
        if (un != null) {
            this.d = a(un, j, d(ubVar));
            long a2 = j - pOVar.a();
            b a3 = SDb.a("MobilePlay");
            StringBuilder sb = new StringBuilder();
            sb.append("Transition to Pause state. Listened for ");
            sb.append(a2 / ((long) 1000));
            sb.append("s.");
            a3.d(sb.toString(), new Object[0]);
            C2320UN un2 = this.d;
            if (un2 != null) {
                this.d = a(un2, a2);
                return new C2301TN();
            }
            C7471uYa.a();
            throw null;
        }
        C7471uYa.a();
        throw null;
    }

    public void a(C4431ub ubVar) {
        C7471uYa.b(ubVar, "playState");
        this.b = true;
        if (this.d != null) {
            long a2 = this.e.a();
            C2320UN un = this.d;
            if (un != null) {
                this.d = a(un, a2, "checkpoint");
            } else {
                C7471uYa.a();
                throw null;
            }
        } else {
            throw new IllegalStateException("Checkpoint received but don't have an active play session");
        }
    }

    public C2320UN a() {
        return this.d;
    }

    private C3217qO a(long j) {
        SDb.a("MobilePlay").d("Transitioning to Play State.", new Object[0]);
        return new C3198pO(j);
    }

    private void a(C2320UN un) {
        b a2 = SDb.a("MobilePlay");
        StringBuilder sb = new StringBuilder();
        sb.append("Sending MobilePlay for track ");
        sb.append(un.d());
        sb.append(" for ");
        sb.append(un.c());
        sb.append("ms (");
        sb.append(un.c() / ((long) 1000));
        sb.append("s) with ID: ");
        sb.append(un.b());
        sb.append('.');
        a2.d(sb.toString(), new Object[0]);
        C2320UN a3 = a(this, un, 0, "close", 1, null);
        this.d = a3;
        this.b = false;
        C3131mO b2 = b();
        if (b2 != null) {
            b2.a(a3);
        }
    }

    private C2320UN a(C2320UN un, long j) {
        return C2320UN.a(un, null, j + un.c(), null, null, 13, null);
    }

    static /* synthetic */ C2320UN a(C3074jO jOVar, C2320UN un, long j, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = jOVar.e.a();
            }
            return jOVar.a(un, j, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEvent");
    }

    private C2320UN a(C2320UN un, long j, String str) {
        return C2320UN.a(un, null, 0, null, C7676xWa.a((Collection) un.a(), (Object) new C3179oO(j, str)), 7, null);
    }
}
