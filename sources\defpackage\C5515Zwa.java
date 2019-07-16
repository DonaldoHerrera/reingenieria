package defpackage;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

/* renamed from: Zwa reason: default package and case insensitive filesystem */
/* compiled from: InstagramStoriesFragment.kt */
final class C5515Zwa<T> implements C6776kQa<Intent> {
    final /* synthetic */ FragmentActivity a;
    final /* synthetic */ C5486Ywa b;
    final /* synthetic */ C3508cda c;

    C5515Zwa(FragmentActivity fragmentActivity, C5486Ywa ywa, C3508cda cda) {
        this.a = fragmentActivity;
        this.b = ywa;
        this.c = cda;
    }

    /* renamed from: a */
    public final void accept(Intent intent) {
        C5486Ywa ywa = this.b;
        ywa.b(ywa.Tb().a());
        this.a.startActivityForResult(intent, 0);
        this.b.dismiss();
    }
}
