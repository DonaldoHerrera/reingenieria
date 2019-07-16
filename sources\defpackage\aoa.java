package defpackage;

import android.content.Context;
import android.view.View;
import com.soundcloud.android.utilities.android.f;

/* renamed from: aoa reason: default package */
/* compiled from: ProgressController.kt */
final class aoa extends C7540vYa implements PXa<Boolean> {
    final /* synthetic */ b a;
    final /* synthetic */ View b;

    aoa(b bVar, View view) {
        this.a = bVar;
        this.b = view;
        super(0);
    }

    public final boolean d() {
        Context context = this.b.getContext();
        C7471uYa.a((Object) context, "progressView.context");
        float a2 = f.a(context, -1.0f);
        return a2 == 1.0f || (a2 == -1.0f && !this.a.b.a());
    }
}
