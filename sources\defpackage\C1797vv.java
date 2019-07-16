package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* renamed from: vv reason: default package and case insensitive filesystem */
public final class C1797vv implements FirebaseRemoteConfigInfo {
    private final long a;
    private final int b;
    private final FirebaseRemoteConfigSettings c;

    private C1797vv(long j, int i, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.a = j;
        this.b = i;
        this.c = firebaseRemoteConfigSettings;
    }

    public final FirebaseRemoteConfigSettings getConfigSettings() {
        return this.c;
    }

    public final long getFetchTimeMillis() {
        return this.a;
    }

    public final int getLastFetchStatus() {
        return this.b;
    }
}
