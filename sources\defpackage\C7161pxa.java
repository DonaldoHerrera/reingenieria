package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* renamed from: pxa reason: default package and case insensitive filesystem */
/* compiled from: SharingStickerUriProvider.kt */
final class C7161pxa<V> implements Callable<T> {
    final /* synthetic */ C7230qxa a;
    final /* synthetic */ Bitmap b;

    C7161pxa(C7230qxa qxa, Bitmap bitmap) {
        this.a = qxa;
        this.b = bitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        defpackage.BXa.a(r0, r1);
     */
    public final Uri call() {
        FileOutputStream openFileOutput = this.a.b.openFileOutput("share_sticker.png", 0);
        this.b.compress(CompressFormat.PNG, 100, openFileOutput);
        Uri b2 = this.a.b();
        BXa.a(openFileOutput, null);
        return b2;
    }
}
