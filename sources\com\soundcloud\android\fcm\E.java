package com.soundcloud.android.fcm;

import java.util.List;

/* compiled from: RemoteRefreshPolicies.kt */
public final class E extends TUa<List<? extends C3508cda>> {
    E() {
    }

    /* renamed from: a */
    public void onSuccess(List<C3508cda> list) {
        C7471uYa.b(list, "t");
        StringBuilder sb = new StringBuilder();
        sb.append("Successfully updated ");
        sb.append(list.size());
        sb.append(" policies");
        SDb.c(sb.toString(), new Object[0]);
    }

    public void a(Throwable th) {
        C7471uYa.b(th, "e");
        SDb.a(th, "Failed to implement policies", new Object[0]);
    }
}
