package defpackage;

import android.os.Bundle;
import com.facebook.B;

/* renamed from: uk reason: default package and case insensitive filesystem */
/* compiled from: RCTCodelessLoggingEventListener */
class C1756uk implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ a c;

    C1756uk(a aVar, String str, Bundle bundle) {
        this.c = aVar;
        this.a = str;
        this.b = bundle;
    }

    public void run() {
        C1237dk.b(B.e()).a(this.a, this.b);
    }
}
