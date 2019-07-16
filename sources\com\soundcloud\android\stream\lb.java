package com.soundcloud.android.stream;

import com.soundcloud.android.foundation.playqueue.u;
import java.util.List;

/* compiled from: StreamStorage */
public class lb implements C5554aDa<C3919yda> {
    private static final Object[] a;
    private static final Object[] b = {"ad_urn", h.g.a("promoter_avatar_url"), "promoter_id", "promoter_name", "tracking_track_clicked_urls", "tracking_track_impression_urls", "tracking_track_played_urls", "tracking_promoter_clicked_urls"};
    private static final Object[] c;
    private static final Object[] d = b();
    private final C4898FLa e;
    private final C5500ZKa f;

    /* compiled from: StreamStorage */
    private static final class a extends C4991ILa<r> {
        private a() {
        }

        public r a(C5326TKa tKa) {
            C3508cda a = lb.c(tKa);
            C4928GKa a2 = C4928GKa.a();
            String str = "reposter_id";
            if (tKa.g(str)) {
                a2 = C4928GKa.c(C3508cda.f(tKa.d(str)));
            }
            return new r(tKa.d("_id"), u.a(a, a2));
        }
    }

    static {
        String str = "_id";
        String str2 = "sound_id";
        String str3 = "sound_type";
        String str4 = "created_at";
        String str5 = "reposter_id";
        a = new Object[]{C6839lLa.b(_ea.SoundStreamView.a(str)).a(str), str2, str3, "sound_user_avatar_url", C6839lLa.b(_ea.SoundStreamView.a(str4)).a(str4), "reposter_username", str5, "reposter_avatar_url"};
        c = new Object[]{str, str2, str3, str5};
    }

    public lb(C5500ZKa zKa) {
        this.e = new C4898FLa(zKa);
        this.f = zKa;
    }

    private static Object[] b() {
        Object[] objArr = a;
        Object[] objArr2 = new Object[(objArr.length + b.length)];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        Object[] objArr3 = b;
        System.arraycopy(objArr3, 0, objArr2, a.length, objArr3.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static C3508cda c(C5326TKa tKa) {
        int c2 = tKa.c("sound_id");
        return b(tKa) == 0 ? C3508cda.d((long) c2) : C3508cda.c((long) c2);
    }

    public APa<C3919yda> a(int i) {
        return this.e.a(((C6975nLa) ((C6975nLa) C6975nLa.a(_ea.SoundStreamView.name()).a(d).b(_ea.PromotedTracks.name(), _ea.PromotedTracks.a("_id"), "promoted_id").b(h.c.name(), h.d.e(), _ea.PromotedTracks.a("promoter_id")).c(_ea.SoundStreamView.a("created_at"), (Object) Long.valueOf(Long.MAX_VALUE))).b("sound_id")).a(i)).h(C6081h.a).c((C7118pQa<? super T, ? extends EPa<? extends R>>) C6067a.a);
    }

    public APa<Integer> b(long j) {
        return this.e.a((C6975nLa) ((C6975nLa) ((C6975nLa) C6975nLa.d(_ea.SoundStreamView.name()).a(_ea.SoundStreamView.a("created_at"), (Object) Long.valueOf(j))).a("promoted_id")).b("sound_id")).h(C6083i.a).c((C7118pQa<? super T, ? extends EPa<? extends R>>) C6067a.a);
    }

    private static int b(C5326TKa tKa) {
        return tKa.c("sound_type");
    }

    public APa<C3919yda> a(long j, int i) {
        return this.e.a(((C6975nLa) ((C6975nLa) C6975nLa.a(_ea.SoundStreamView.name()).a(a).b(_ea.SoundStreamView.a("created_at"), (Object) Long.valueOf(j))).a("promoted_id")).a(i)).h(C6087k.a).c((C7118pQa<? super T, ? extends EPa<? extends R>>) C6067a.a);
    }

    public IPa<Integer> a(long j) {
        return b(j).g();
    }

    public IPa<List<r>> a() {
        return this.e.a(C6975nLa.a(_ea.SoundStreamView.name()).a(c)).h(C6085j.a).g();
    }

    public C5266RKa a(C3508cda cda) {
        return this.f.a((C5116MLa) _ea.SoundStream, C6907mLa.a().d("sound_type", (Object) Integer.valueOf(1)).d("sound_id", (Object) Long.valueOf(cda.c())));
    }
}
