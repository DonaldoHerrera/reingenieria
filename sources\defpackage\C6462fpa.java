package defpackage;

import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* renamed from: fpa reason: default package and case insensitive filesystem */
/* compiled from: DataSourceProvider.kt */
final /* synthetic */ class C6462fpa extends C7402tYa implements _Xa<List<? extends C3508cda>, APa<List<? extends C6185ma>>> {
    C6462fpa(C5604aua aua) {
        super(1, aua);
    }

    /* renamed from: a */
    public final APa<List<C6185ma>> invoke(List<C3508cda> list) {
        C7471uYa.b(list, "p1");
        return ((C5604aua) this.c).a(list);
    }

    public final String getName() {
        return "liveTracks";
    }

    public final C7610wZa h() {
        return HYa.a(C5604aua.class);
    }

    public final String j() {
        return "liveTracks(Ljava/util/List;)Lio/reactivex/Observable;";
    }
}
