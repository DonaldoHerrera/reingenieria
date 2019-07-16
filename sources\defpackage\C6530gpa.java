package defpackage;

import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* renamed from: gpa reason: default package and case insensitive filesystem */
/* compiled from: DataSourceProvider.kt */
final class C6530gpa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C6598hpa a;

    C6530gpa(C6598hpa hpa) {
        this.a = hpa;
    }

    /* renamed from: a */
    public final c apply(List<? extends C6185ma> list) {
        C7471uYa.b(list, "it");
        return new c(list, (Exception) this.a.b.d());
    }
}
