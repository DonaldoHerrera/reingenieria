package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: txa reason: default package and case insensitive filesystem */
/* compiled from: TrackArtworkProvider.kt */
final class C7437txa<V> implements Callable<T> {
    final /* synthetic */ C7575vxa a;
    final /* synthetic */ String b;

    C7437txa(C7575vxa vxa, String str) {
        this.a = vxa;
        this.b = str;
    }

    public final File call() {
        a aVar = new a();
        aVar.b(this.b);
        Ayb execute = ((C7440tyb) this.a.a.get()).a(aVar.a()).execute();
        C7471uYa.a((Object) execute, "response");
        if (execute.h()) {
            Cyb a2 = execute.a();
            if (a2 != null) {
                byte[] bytes = a2.bytes();
                C6494gGa b2 = this.a.b;
                C7471uYa.a((Object) bytes, "body");
                return b2.a("track_artwork.jpg", bytes);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to download file. Response code: ");
        sb.append(execute.d());
        throw new IOException(sb.toString());
    }
}
