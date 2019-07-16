package com.soundcloud.android.comments;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.soundcloud.android.comments.cb reason: case insensitive filesystem */
/* compiled from: ReportedCommentStorage.kt */
public class C2878cb {
    private final SharedPreferences a;

    public C2878cb(SharedPreferences sharedPreferences) {
        C7471uYa.b(sharedPreferences, "reportedComments");
        this.a = sharedPreferences;
    }

    public void a(C3508cda cda) {
        C7471uYa.b(cda, "commentUrn");
        this.a.edit().putBoolean(cda.d(), true).apply();
    }

    public void b(C3508cda cda) {
        C7471uYa.b(cda, "commentUrn");
        this.a.edit().remove(cda.d()).apply();
    }

    public void a() {
        this.a.edit().clear().commit();
    }

    public List<C3508cda> b() {
        Set<String> keySet = this.a.getAll().keySet();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) keySet, 10));
        for (String str : keySet) {
            C7471uYa.a((Object) str, "it");
            arrayList.add(C3508cda.b(Long.parseLong(str)));
        }
        return arrayList;
    }
}
