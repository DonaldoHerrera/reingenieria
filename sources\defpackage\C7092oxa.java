package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: oxa reason: default package and case insensitive filesystem */
/* compiled from: SharingStickerUriProvider.kt */
final class C7092oxa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C7230qxa a;

    C7092oxa(C7230qxa qxa) {
        this.a = qxa;
    }

    /* renamed from: a */
    public final IPa<Uri> apply(Bitmap bitmap) {
        C7471uYa.b(bitmap, "it");
        return this.a.a(bitmap);
    }
}
