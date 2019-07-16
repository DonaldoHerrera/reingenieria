package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: vxa reason: default package and case insensitive filesystem */
/* compiled from: TrackArtworkProvider.kt */
public class C7575vxa {
    /* access modifiers changed from: private */
    public final C4806CMa<C7440tyb> a;
    /* access modifiers changed from: private */
    public final C6494gGa b;
    private final Context c;

    public C7575vxa(C4806CMa<C7440tyb> cMa, C6494gGa gga, Context context) {
        C7471uYa.b(cMa, "client");
        C7471uYa.b(gga, "fileHelper");
        C7471uYa.b(context, "context");
        this.a = cMa;
        this.b = gga;
        this.c = context;
    }

    private Uri b() {
        C6494gGa gga = this.b;
        File fileStreamPath = this.c.getFileStreamPath("track_artwork.jpg");
        C7471uYa.a((Object) fileStreamPath, "context.getFileStreamPath(DOWNLOADED_ARTWORK_FILE)");
        return gga.a(fileStreamPath);
    }

    public IPa<Uri> a(String str) {
        C7471uYa.b(str, ImagesContract.URL);
        IPa<Uri> e = b(str).e(new C7506uxa(this));
        C7471uYa.a((Object) e, "downloadTrackArtwork(url…elper.getUriForFile(it) }");
        return e;
    }

    private IPa<File> b(String str) {
        IPa<File> c2 = IPa.c((Callable<? extends T>) new C7437txa<Object>(this, str));
        C7471uYa.a((Object) c2, "Single.fromCallable {\n  …)\n            }\n        }");
        return c2;
    }

    public C6979nPa a() {
        return this.b.a(b());
    }
}
