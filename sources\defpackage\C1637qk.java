package defpackage;

import android.os.Bundle;
import com.facebook.B;

/* renamed from: qk reason: default package and case insensitive filesystem */
/* compiled from: CodelessLoggingEventListener */
class C1637qk implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ a c;

    C1637qk(a aVar, String str, Bundle bundle) {
        this.c = aVar;
        this.a = str;
        this.b = bundle;
    }

    public void run() {
        C1237dk.b(B.e()).a(this.a, this.b);
    }
}
