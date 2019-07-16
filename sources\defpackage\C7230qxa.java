package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: qxa reason: default package and case insensitive filesystem */
/* compiled from: SharingStickerUriProvider.kt */
public class C7230qxa {
    private final C6494gGa a;
    /* access modifiers changed from: private */
    public final Context b;

    public C7230qxa(C6494gGa gga, Context context) {
        C7471uYa.b(gga, "fileHelper");
        C7471uYa.b(context, "context");
        this.a = gga;
        this.b = context;
    }

    /* access modifiers changed from: private */
    public Uri b() {
        C6494gGa gga = this.a;
        File fileStreamPath = this.b.getFileStreamPath("share_sticker.png");
        C7471uYa.a((Object) fileStreamPath, "context.getFileStreamPath(STICKER_FILE)");
        return gga.a(fileStreamPath);
    }

    private IPa<Bitmap> b(Activity activity, String str, String str2) {
        IPa<Bitmap> c = IPa.c((Callable<? extends T>) new C7023nxa<Object>(activity, str, str2));
        C7471uYa.a((Object) c, "Single.fromCallable {\n  …              }\n        }");
        return c;
    }

    public IPa<Uri> a(Activity activity, String str, String str2) {
        C7471uYa.b(activity, "activity");
        C7471uYa.b(str, "title");
        C7471uYa.b(str2, "subtitle");
        IPa<Uri> a2 = b(activity, str, str2).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C7092oxa<Object,Object>(this));
        C7471uYa.a((Object) a2, "convertLayoutToImage(act…p { saveStickerFile(it) }");
        return a2;
    }

    public C6979nPa a() {
        return this.a.a(b());
    }

    /* access modifiers changed from: private */
    public IPa<Uri> a(Bitmap bitmap) {
        IPa<Uri> c = IPa.c((Callable<? extends T>) new C7161pxa<Object>(this, bitmap));
        C7471uYa.a((Object) c, "Single.fromCallable {\n  …)\n            }\n        }");
        return c;
    }
}
