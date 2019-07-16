package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* renamed from: yv reason: default package and case insensitive filesystem */
public final class C1887yv {
    private long a;
    private int b;
    private FirebaseRemoteConfigSettings c;

    private C1887yv() {
    }

    public final C1887yv a(long j) {
        this.a = j;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final C1887yv a(int i) {
        this.b = i;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final C1887yv a(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.c = firebaseRemoteConfigSettings;
        return this;
    }

    public final C1797vv a() {
        C1797vv vvVar = new C1797vv(this.a, this.b, this.c);
        return vvVar;
    }
}
