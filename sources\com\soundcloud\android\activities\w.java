package com.soundcloud.android.activities;

import java.util.Date;

/* compiled from: ActivitiesStorage */
public class w implements C5554aDa<B> {
    private final C4898FLa a;
    private C5500ZKa b;

    /* compiled from: ActivitiesStorage */
    private static class a extends C4991ILa<B> {
        private a() {
        }

        public B a(C5326TKa tKa) {
            Date b = tKa.b("created_at");
            G a = G.a(tKa.e(C1325gg.TYPE));
            B b2 = new B(b, a, tKa.e("activity_user_username"), G.h.contains(a) ? tKa.e(k.l) : "", G.TRACK_COMMENT.equals(a) ? C3508cda.d(tKa.d("sound_id")) : null, C3508cda.f(tKa.d("user_id")), tKa.e("activity_user_avatar_url"), tKa.a("activity_user_is_pro"));
            return b2;
        }
    }

    public w(C4898FLa fLa, C5500ZKa zKa) {
        this.a = fLa;
        this.b = zKa;
    }

    private static C6975nLa b(int i) {
        String str = "created_at";
        return ((C6975nLa) C6975nLa.a(_ea.ActivityView).a(str, b.DESC).b(C1325gg.TYPE, (Object[]) G.g)).a(i);
    }

    public C5266RKa a(C3508cda cda) {
        return this.b.a((C5116MLa) _ea.Activities, C6907mLa.a().d("sound_type", (Object) Integer.valueOf(1)).d("sound_id", (Object) Long.valueOf(cda.c())));
    }

    public APa<B> a(int i) {
        return this.a.a(b(i)).h(C2537b.a).c((C7118pQa<? super T, ? extends EPa<? extends R>>) C2539d.a);
    }

    public APa<B> a(long j, int i) {
        return this.a.a((C6975nLa) b(i).b("created_at", (Object) Long.valueOf(j))).h(C2536a.a).c((C7118pQa<? super T, ? extends EPa<? extends R>>) C2539d.a);
    }
}
