package defpackage;

import com.soundcloud.android.ia.p;

/* renamed from: _wa reason: default package and case insensitive filesystem */
/* compiled from: InstagramStoriesFragment.kt */
final class C5544_wa<T> implements C6776kQa<Throwable> {
    final /* synthetic */ C5486Ywa a;
    final /* synthetic */ C3508cda b;

    C5544_wa(C5486Ywa ywa, C3508cda cda) {
        this.a = ywa;
        this.b = cda;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        C5052KJa Sb = this.a.Sb();
        Fca fca = new Fca(p.instagram_stories_share_error, 1, 0, null, null, Integer.valueOf(p.instagram_stories), 28, null);
        Sb.a(fca);
        this.a.dismiss();
        C3469VY Rb = this.a.Rb();
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to share on Instagram : ");
        sb.append(th);
        a.a(Rb, new Exception(sb.toString()), null, 2, null);
    }
}
