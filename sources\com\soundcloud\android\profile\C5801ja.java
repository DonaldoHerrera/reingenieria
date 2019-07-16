package com.soundcloud.android.profile;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.playback.Db.a;
import com.soundcloud.android.profile.P.e;
import com.soundcloud.android.tracks.C6185ma;

/* renamed from: com.soundcloud.android.profile.ja reason: case insensitive filesystem */
/* compiled from: ProfileBucketsTrackCardRenderer.kt */
public final class C5801ja extends C5541_ta<e> {
    private final C6781kVa<a> a;
    private final C5629bJa b;

    public C5801ja(C5629bJa bja) {
        C7471uYa.b(bja, "trackCardRenderer");
        this.b = bja;
        C6781kVa<a> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
        this.b.a(l.profile_user_sounds_track_card);
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View b2 = this.b.b(viewGroup);
        C7471uYa.a((Object) b2, "trackCardRenderer.createItemView(parent)");
        return b2;
    }

    public final C6781kVa<a> a() {
        return this.a;
    }

    public void a(int i, View view, e eVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(eVar, "item");
        C6185ma e = eVar.e();
        view.setBackgroundColor(view.getResources().getColor(f.white));
        view.setOnClickListener(new C5796ia(this, eVar));
        this.b.a(e, view, C4928GKa.c(eVar.c()), eVar.b() ? C5512Zta.a.c() : C5512Zta.a.b());
    }
}
