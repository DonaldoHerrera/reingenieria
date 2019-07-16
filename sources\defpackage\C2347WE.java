package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: WE reason: default package and case insensitive filesystem */
/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class C2347WE {
    private static volatile C2347WE a;
    private final Set<C2365XE> b = new HashSet();

    C2347WE() {
    }

    public static C2347WE a() {
        C2347WE we = a;
        if (we == null) {
            synchronized (C2347WE.class) {
                we = a;
                if (we == null) {
                    we = new C2347WE();
                    a = we;
                }
            }
        }
        return we;
    }

    /* access modifiers changed from: 0000 */
    public Set<C2365XE> b() {
        Set<C2365XE> unmodifiableSet;
        synchronized (this.b) {
            unmodifiableSet = Collections.unmodifiableSet(this.b);
        }
        return unmodifiableSet;
    }
}
