package com.soundcloud.android.activities;

import com.soundcloud.android.sync.T;
import com.soundcloud.android.sync.na;
import java.util.Date;
import java.util.List;

/* compiled from: ActivitiesOperations.kt */
public class l extends C5521_Ca<B, B> {
    private final HPa f;

    public l(w wVar, T t, HPa hPa) {
        C7471uYa.b(wVar, "activitiesStorage");
        C7471uYa.b(t, "syncInitiator");
        C7471uYa.b(hPa, "scheduler");
        super(na.ACTIVITIES, wVar, t, hPa);
        this.f = hPa;
    }

    /* access modifiers changed from: protected */
    public boolean a(List<B> list) {
        C7471uYa.b(list, "result");
        return list.isEmpty();
    }

    public IPa<List<B>> b() {
        IPa<List<B>> a = a(false);
        C7471uYa.a((Object) a, "initialTimelineItems(false)");
        return a;
    }

    public IPa<List<B>> c() {
        IPa<List<B>> b = a().b(this.f);
        C7471uYa.a((Object) b, "updatedTimelineItems().subscribeOn(scheduler)");
        return b;
    }

    /* access modifiers changed from: protected */
    public IPa<List<B>> b(List<B> list) {
        C7471uYa.b(list, "activityItems");
        IPa<List<B>> a = IPa.a(list);
        C7471uYa.a((Object) a, "Single.just(activityItems)");
        return a;
    }

    public IPa<List<B>> c(List<B> list) {
        C7471uYa.b(list, "items");
        B b = (B) C7676xWa.i((List) list);
        if (b != null) {
            Date b2 = b.b();
            if (b2 != null) {
                return a(b2.getTime(), false);
            }
        }
        return null;
    }
}
