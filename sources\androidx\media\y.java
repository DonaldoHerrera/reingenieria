package androidx.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;

/* compiled from: MediaSessionManager */
public final class y {
    z a;

    public y(String str, int i, int i2) {
        if (VERSION.SDK_INT >= 28) {
            this.a = new A(str, i, i2);
        } else {
            this.a = new B(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        return this.a.equals(((y) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public y(RemoteUserInfo remoteUserInfo) {
        this.a = new A(remoteUserInfo);
    }
}
