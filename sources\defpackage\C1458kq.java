package defpackage;

import android.text.TextUtils;

/* renamed from: kq reason: default package and case insensitive filesystem */
/* compiled from: HttpDataSource */
public final /* synthetic */ class C1458kq {
    public static /* synthetic */ boolean a(String str) {
        String g = C0471ar.g(str);
        return !TextUtils.isEmpty(g) && (!g.contains("text") || g.contains("text/vtt")) && !g.contains("html") && !g.contains("xml");
    }
}
