package defpackage;

import com.google.firebase.FirebaseApp;
import com.google.firebase.d;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: QN reason: default package and case insensitive filesystem */
/* compiled from: FirebaseModule */
public abstract class C2244QN {
    static d a() {
        return FirebaseApp.getInstance().d();
    }

    static FirebaseRemoteConfig b() {
        return FirebaseRemoteConfig.getInstance();
    }
}
