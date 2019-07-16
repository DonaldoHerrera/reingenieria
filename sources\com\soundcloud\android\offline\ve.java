package com.soundcloud.android.offline;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

@EVa(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0012J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/offline/StrictSSLHttpClient;", "", "noRedirectsHttpClient", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "requestHelper", "Lcom/soundcloud/android/offline/StrictSSLHttpClient$RequestHelper;", "downloadLogger", "Lcom/soundcloud/android/offline/DownloadLogger;", "(Ldagger/Lazy;Lcom/soundcloud/android/offline/StrictSSLHttpClient$RequestHelper;Lcom/soundcloud/android/offline/DownloadLogger;)V", "getFileStream", "Lcom/soundcloud/android/offline/StrictSSLHttpClient$TrackFileResponse;", "streamUrl", "", "logRequest", "", "request", "Lokhttp3/Request;", "logResponse", "response", "Lokhttp3/Response;", "RequestHelper", "TrackFileResponse", "offline_release"}, mv = {1, 1, 15})
/* compiled from: StrictSSLHttpClient.kt */
public class ve {
    private final C4806CMa<C7440tyb> a;
    private final a b;
    private final Qb c;

    /* compiled from: StrictSSLHttpClient.kt */
    public interface a {
        String a();

        int b();

        String c();
    }

    /* compiled from: StrictSSLHttpClient.kt */
    public static class b implements Closeable {
        private final Ayb a;
        private final C7026nyb b;

        public b(Ayb ayb, C7026nyb nyb) {
            C7471uYa.b(ayb, "response");
            this.a = ayb;
            this.b = nyb;
        }

        public InputStream a() {
            Cyb a2 = this.a.a();
            if (a2 != null) {
                InputStream byteStream = a2.byteStream();
                C7471uYa.a((Object) byteStream, "requireNotNull(response.body()).byteStream()");
                return byteStream;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public C7026nyb b() {
            return this.b;
        }

        public boolean c() {
            return this.a.h();
        }

        public void close() {
            Cyb a2 = this.a.a();
            if (a2 != null) {
                C6698jGa.a((Closeable) a2);
            }
        }

        public boolean d() {
            int d = this.a.d();
            return 400 <= d && 499 >= d;
        }

        public /* synthetic */ b(Ayb ayb, C7026nyb nyb, int i, C7264rYa rya) {
            if ((i & 2) != 0) {
                nyb = null;
            }
            this(ayb, nyb);
        }
    }

    public ve(C4806CMa<C7440tyb> cMa, a aVar, Qb qb) {
        C7471uYa.b(cMa, "noRedirectsHttpClient");
        C7471uYa.b(aVar, "requestHelper");
        C7471uYa.b(qb, "downloadLogger");
        this.a = cMa;
        this.b = aVar;
        this.c = qb;
    }

    public b a(String str) throws IOException {
        C7471uYa.b(str, "streamUrl");
        defpackage.C7647wyb.a aVar = new defpackage.C7647wyb.a();
        aVar.b(str);
        aVar.a("User-Agent", this.b.a());
        aVar.a("App-Version", String.valueOf(this.b.b()));
        aVar.a("Authorization", this.b.c());
        C7647wyb a2 = aVar.a();
        String str2 = "it";
        C7471uYa.a((Object) a2, str2);
        a(a2);
        Ayb execute = ((C7440tyb) this.a.get()).a(a2).execute();
        C7471uYa.a((Object) execute, str2);
        a(execute);
        C7471uYa.a((Object) execute, "urlResponse");
        if (!execute.g()) {
            return new b(execute, null, 2, null);
        }
        C7026nyb f = execute.f();
        String a3 = execute.a("Location");
        if (a3 != null) {
            defpackage.C7647wyb.a f2 = a2.f();
            f2.b(a3);
            C7647wyb a4 = f2.a();
            C7471uYa.a((Object) a4, str2);
            a(a4);
            Ayb execute2 = ((C7440tyb) this.a.get()).a(a4).execute();
            C7471uYa.a((Object) execute2, str2);
            a(execute2);
            C7471uYa.a((Object) execute2, "redirectResponse");
            return new b(execute2, f);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private void a(C7647wyb wyb) {
        Qb qb = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append("[OkHttp] ");
        sb.append(wyb.e());
        sb.append(' ');
        sb.append(wyb.g());
        sb.append("; headers = ");
        sb.append(wyb.c());
        qb.b(sb.toString());
    }

    private void a(Ayb ayb) {
        Qb qb = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append("[OkHttp] ");
        sb.append(ayb);
        sb.append(" isRedirect=");
        sb.append(ayb.g());
        sb.append("; headers = ");
        sb.append(ayb.f());
        qb.b(sb.toString());
    }
}
