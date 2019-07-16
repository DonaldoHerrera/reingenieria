package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;

/* renamed from: dP reason: default package and case insensitive filesystem */
/* compiled from: ApiUrlBuilder */
public class C2961dP {
    private final String a;
    private final String b;
    private final String c;
    private Builder d;

    public C2961dP(String str, String str2, String str3) {
        this.c = str3;
        this.a = str2;
        this.b = str;
    }

    private C2961dP b() {
        return a("client_id", (Object) this.c);
    }

    public C2961dP a(C2226PO po, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(po.b(objArr));
        this.d = Uri.parse(sb.toString()).buildUpon();
        return b();
    }

    public C2961dP a(String str) {
        this.d = Uri.parse(str).buildUpon();
        return b();
    }

    public C2961dP a(hfa hfa) {
        if (hfa.f().isAbsolute()) {
            this.d = hfa.f().buildUpon();
        } else {
            String str = hfa.g() ? this.a : this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(hfa.f());
            this.d = Uri.parse(sb.toString()).buildUpon();
        }
        return b();
    }

    public C2961dP a(C2215PD<String, String> pd) {
        for (String str : pd.keySet()) {
            a(str, (Object) C5206PKa.a(',').a((Iterable<?>) pd.get(str)));
        }
        return this;
    }

    public C2961dP a(String str, Object obj) {
        this.d.appendQueryParameter(str, obj.toString());
        return this;
    }

    public C2961dP a(c cVar, Object obj) {
        this.d.appendQueryParameter(cVar.toString(), obj.toString());
        return this;
    }

    public String a() {
        return this.d.toString();
    }
}
