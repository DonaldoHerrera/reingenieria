package defpackage;

import com.soundcloud.android.offline.C4177ue;
import com.soundcloud.android.offline.ve;
import com.soundcloud.android.offline.we;
import com.soundcloud.android.offline.ye;
import com.soundcloud.android.properties.j;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: eQ reason: default package and case insensitive filesystem */
/* compiled from: DownloadModule */
public abstract class C2981eQ {
    static ve a(we weVar, C3038hQ hQVar) {
        return weVar.a(hQVar);
    }

    static /* synthetic */ boolean a(String str, SSLSession sSLSession) {
        return true;
    }

    @ye
    static C7440tyb a(C4806CMa<C7440tyb> cMa, j jVar) {
        a E = ((C7440tyb) cMa.get()).E();
        E.a(false);
        E.a((Vxb) null);
        E.a(a(jVar));
        return E.a();
    }

    private static HostnameVerifier a(j jVar) {
        if (jVar.k()) {
            return C2962dQ.a;
        }
        return new C4177ue();
    }
}
