package androidx.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;

/* compiled from: MediaSessionManagerImplApi28 */
final class A implements z {
    final RemoteUserInfo a;

    A(String str, int i, int i2) {
        this.a = new RemoteUserInfo(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        return this.a.equals(((A) obj).a);
    }

    public int hashCode() {
        return C0243Pb.a(this.a);
    }

    A(RemoteUserInfo remoteUserInfo) {
        this.a = remoteUserInfo;
    }
}
