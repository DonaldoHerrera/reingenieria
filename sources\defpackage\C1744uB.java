package defpackage;

import android.os.IBinder.DeathRecipient;

/* renamed from: uB reason: default package and case insensitive filesystem */
final /* synthetic */ class C1744uB implements DeathRecipient {
    private final C1654rB a;

    C1744uB(C1654rB rBVar) {
        this.a = rBVar;
    }

    public final void binderDied() {
        this.a.c();
    }
}
