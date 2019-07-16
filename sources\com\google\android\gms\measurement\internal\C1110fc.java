package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fc reason: case insensitive filesystem */
final class C1110fc implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ long d;
    private final /* synthetic */ Nb e;

    C1110fc(Nb nb, String str, String str2, String str3, long j) {
        this.e = nb;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final void run() {
        String str = this.a;
        if (str == null) {
            this.e.a.q().A().a(this.b, (Uc) null);
            return;
        }
        this.e.a.q().A().a(this.b, new Uc(this.c, str, this.d));
    }
}
