package defpackage;

import android.annotation.SuppressLint;

/* renamed from: Gxa reason: default package and case insensitive filesystem */
/* compiled from: ClearMediaStreamStorageMigration.kt */
public final class C4946Gxa implements C5040Jxa {
    /* access modifiers changed from: private */
    public final C4797CDa a;
    private final HPa b;
    /* access modifiers changed from: private */
    public final C3469VY c;

    public C4946Gxa(C4797CDa cDa, HPa hPa, C3469VY vy) {
        C7471uYa.b(cDa, "mediaStreamsStorage");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(vy, "errorReporter");
        this.a = cDa;
        this.b = hPa;
        this.c = vy;
    }

    @SuppressLint({"CheckResult"})
    public void a() {
        C6979nPa.b((C6368eQa) new C4853Dxa(this)).b(this.b).a(C4884Exa.a, new C4915Fxa(this));
    }
}
