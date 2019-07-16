package com.soundcloud.android.comments;

import java.util.Set;

/* compiled from: PlayerCommentOperations.kt */
public class Ua {
    private final HPa a;
    private final mb b;
    /* access modifiers changed from: private */
    public final C5604aua c;

    public Ua(HPa hPa, mb mbVar, C5604aua aua) {
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(mbVar, "trackCommentRepository");
        C7471uYa.b(aua, "liveEntities");
        this.a = hPa;
        this.b = mbVar;
        this.c = aua;
    }

    public APa<Set<C3799jda>> a(C3508cda cda) {
        C7471uYa.b(cda, "track");
        APa<Set<C3799jda>> b2 = mb.a(this.b, cda, null, 2, null).h(Qa.a).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new Ta<Object,Object>(this)).b(this.a);
        C7471uYa.a((Object) b2, "trackCommentRepository.c…  .subscribeOn(scheduler)");
        return b2;
    }
}
