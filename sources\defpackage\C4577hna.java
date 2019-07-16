package defpackage;

import com.soundcloud.android.playback.core.d;

/* renamed from: hna reason: default package and case insensitive filesystem */
/* compiled from: PlaybackManager.kt */
final class C4577hna<T> implements C6776kQa<Throwable> {
    final /* synthetic */ C3968cna a;

    C4577hna(C3968cna cna) {
        this.a = cna;
    }

    /* renamed from: a */
    public final void accept(Throwable th) {
        d a2 = this.a.g;
        StringBuilder sb = new StringBuilder();
        sb.append("Accessing PlaybackItem emitted the error ");
        sb.append(th);
        a2.c("PlaybackManager", sb.toString());
    }
}
