package defpackage;

import javax.net.SocketFactory;

/* renamed from: mQ reason: default package and case insensitive filesystem */
/* compiled from: SoundcloudSocketFactory.kt */
public final class C3133mQ {
    public static final C3133mQ a = new C3133mQ();

    private C3133mQ() {
    }

    public final SocketFactory a() {
        SocketFactory socketFactory = SocketFactory.getDefault();
        C7471uYa.a((Object) socketFactory, "SocketFactory.getDefault()");
        return socketFactory;
    }
}
