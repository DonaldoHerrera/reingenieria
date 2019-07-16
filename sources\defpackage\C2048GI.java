package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: GI reason: default package and case insensitive filesystem */
/* compiled from: OMAdSessionParams.kt */
public final class C2048GI {
    private final String a;
    private final List<C2199OG> b;
    private final C2161MG c;
    private final View d;
    private final List<View> e;

    public C2048GI(String str, List<C2199OG> list, C2161MG mg, View view, List<? extends View> list2) {
        C7471uYa.b(str, "jsContent");
        C7471uYa.b(list, "verificationScriptResources");
        C7471uYa.b(view, "adView");
        C7471uYa.b(list2, "adObstructionViews");
        this.a = str;
        this.b = list;
        this.c = mg;
        this.d = view;
        this.e = list2;
    }

    public final List<View> a() {
        return this.e;
    }

    public final View b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final List<C2199OG> d() {
        return this.b;
    }

    public final C2161MG e() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x003d;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2048GI) {
                C2048GI gi = (C2048GI) obj;
                if (C7471uYa.a((Object) this.a, (Object) gi.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) gi.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) gi.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) gi.d)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C2199OG> list = this.b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C2161MG mg = this.c;
        int hashCode3 = (hashCode2 + (mg != null ? mg.hashCode() : 0)) * 31;
        View view = this.d;
        int hashCode4 = (hashCode3 + (view != null ? view.hashCode() : 0)) * 31;
        List<View> list2 = this.e;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OMAdSessionParams(jsContent=");
        sb.append(this.a);
        sb.append(", verificationScriptResources=");
        sb.append(this.b);
        sb.append(", videoEventsOwner=");
        sb.append(this.c);
        sb.append(", adView=");
        sb.append(this.d);
        sb.append(", adObstructionViews=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
