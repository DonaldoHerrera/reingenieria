package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;

/* renamed from: nK reason: default package and case insensitive filesystem */
/* compiled from: AlphaDialogHelper.kt */
final class C3146nK<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Activity a;

    C3146nK(Activity activity) {
        this.a = activity;
    }

    /* renamed from: a */
    public final C3070jK apply(Bitmap bitmap) {
        C7471uYa.b(bitmap, "it");
        return new C3070jK(this.a, bitmap);
    }
}
