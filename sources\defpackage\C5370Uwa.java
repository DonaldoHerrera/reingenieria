package defpackage;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

/* renamed from: Uwa reason: default package and case insensitive filesystem */
/* compiled from: InstagramStoriesApi.kt */
final class C5370Uwa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C5252Qwa a;
    final /* synthetic */ FragmentActivity b;

    C5370Uwa(C5252Qwa qwa, FragmentActivity fragmentActivity) {
        this.a = qwa;
        this.b = fragmentActivity;
    }

    /* renamed from: a */
    public final Intent apply(d dVar) {
        C7471uYa.b(dVar, "params");
        return this.a.a(this.b, dVar);
    }
}
