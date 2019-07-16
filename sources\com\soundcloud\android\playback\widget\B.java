package com.soundcloud.android.playback.widget;

import android.content.res.Resources;
import com.google.common.base.Function;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.tracks.C6185ma;

/* compiled from: WidgetItem */
class B implements Vca {
    private String a;
    private C4928GKa<String> b = C4928GKa.a();
    private C4928GKa<C3508cda> c = C4928GKa.a();
    private C4928GKa<C3508cda> d = C4928GKa.a();
    private C4928GKa<String> e = C4928GKa.a();
    private C4928GKa<Boolean> f = C4928GKa.a();
    private boolean g = true;

    private B(String str, String str2, C3508cda cda, C3508cda cda2, C4928GKa<String> gKa, C4928GKa<Boolean> gKa2) {
        this.a = str;
        this.b = C4928GKa.c(str2);
        this.c = C4928GKa.c(cda);
        this.d = C4928GKa.c(cda2);
        this.e = gKa;
        this.f = gKa2;
    }

    public static B a(C6185ma maVar) {
        B b2 = new B(maVar.B(), maVar.d(), maVar.e(), maVar.a(), maVar.b(), C4928GKa.c(Boolean.valueOf(maVar.o())).a((Function<? super T, Boolean>) new i<Object,Boolean>(maVar)));
        return b2;
    }

    public static B b(Resources resources) {
        return new B(resources.getString(p.ads_reopen_to_continue_short), false);
    }

    /* access modifiers changed from: 0000 */
    public String f() {
        return (String) this.b.d("");
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C3508cda> g() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public String getTitle() {
        return this.a;
    }

    public boolean h() {
        return this.d.c();
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<Boolean> j() {
        return this.f;
    }

    public C4928GKa<String> b() {
        return this.e;
    }

    static /* synthetic */ Boolean a(C6185ma maVar, Boolean bool) {
        return Boolean.valueOf(!maVar.m());
    }

    public static B a(Resources resources) {
        return new B(resources.getString(p.ads_advertisement), true);
    }

    public C3508cda a() {
        return (C3508cda) this.d.d(C3508cda.a);
    }

    private B(String str, boolean z) {
        this.a = str;
        this.g = z;
    }
}
