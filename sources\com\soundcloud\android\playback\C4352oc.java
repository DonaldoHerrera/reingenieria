package com.soundcloud.android.playback;

import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.properties.j;

/* renamed from: com.soundcloud.android.playback.oc reason: case insensitive filesystem */
/* compiled from: PlaybackModuleLogger.kt */
public final class C4352oc implements d {
    public void a(String str, String str2) {
        C7471uYa.b(str, "tag");
        C7471uYa.b(str2, "message");
        if (j.g()) {
            b(str, str2);
        } else {
            SDb.a(str).a(Xla.b.a(str2), new Object[0]);
        }
    }

    public void b(String str, String str2) {
        C7471uYa.b(str, "tag");
        C7471uYa.b(str2, "message");
        SDb.a(str).d(Xla.b.a(str2), new Object[0]);
    }

    public void c(String str, String str2) {
        C7471uYa.b(str, "tag");
        C7471uYa.b(str2, "message");
        SDb.a(str).b(Xla.b.a(str2), new Object[0]);
    }

    public void a(Exception exc, String str) {
        C7471uYa.b(exc, "exception");
        if (str != null) {
            C7316sHa.a((Throwable) exc, Xla.b.a(str));
        } else {
            C7316sHa.d(exc);
        }
    }
}
