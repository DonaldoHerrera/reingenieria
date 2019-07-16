package defpackage;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

/* renamed from: Vwa reason: default package and case insensitive filesystem */
/* compiled from: InstagramStoriesApi.kt */
final class C5399Vwa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C5252Qwa a;
    final /* synthetic */ FragmentActivity b;

    C5399Vwa(C5252Qwa qwa, FragmentActivity fragmentActivity) {
        this.a = qwa;
        this.b = fragmentActivity;
    }

    /* renamed from: a */
    public final Intent apply(Intent intent) {
        C7471uYa.b(intent, "intent");
        if (this.a.c.a(this.b, intent, 0) != null) {
            return intent;
        }
        throw new e();
    }
}
