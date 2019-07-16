package defpackage;

import com.facebook.internal.E;
import java.util.HashSet;

/* renamed from: fk reason: default package and case insensitive filesystem */
/* compiled from: AppEventsLoggerImpl */
class C1298fk implements Runnable {
    C1298fk() {
    }

    public void run() {
        HashSet<String> hashSet = new HashSet<>();
        for (Qj b : C0495bk.e()) {
            hashSet.add(b.b());
        }
        for (String a : hashSet) {
            E.a(a, true);
        }
    }
}
