package defpackage;

import android.content.SharedPreferences;

/* renamed from: PGa reason: default package and case insensitive filesystem */
/* compiled from: AndroidUtils */
final class C5202PGa extends Thread {
    final /* synthetic */ Runnable a;
    final /* synthetic */ SharedPreferences b;
    final /* synthetic */ String c;

    public void run() {
        this.a.run();
        this.b.edit().putBoolean(this.c, true).apply();
    }
}
