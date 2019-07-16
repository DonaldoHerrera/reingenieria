package defpackage;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: JG reason: default package and case insensitive filesystem */
public final class C2104JG {
    private final C2180NG a;
    private final WebView b;
    private final List<C2199OG> c = new ArrayList();
    private final String d;
    private final String e;
    private final C2123KG f;

    private C2104JG(C2180NG ng, WebView webView, String str, List<C2199OG> list, String str2) {
        C2123KG kg;
        this.a = ng;
        this.b = webView;
        this.d = str;
        if (list != null) {
            this.c.addAll(list);
            kg = C2123KG.NATIVE;
        } else {
            kg = C2123KG.HTML;
        }
        this.f = kg;
        this.e = str2;
    }

    public static C2104JG a(C2180NG ng, String str, List<C2199OG> list, String str2) {
        C3067jH.a((Object) ng, "Partner is null");
        C3067jH.a((Object) str, "OM SDK JS script content is null");
        C3067jH.a((Object) list, "VerificationScriptResources is null");
        if (str2 != null) {
            C3067jH.a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        C2104JG jg = new C2104JG(ng, null, str, list, str2);
        return jg;
    }

    public C2123KG a() {
        return this.f;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    public C2180NG d() {
        return this.a;
    }

    public List<C2199OG> e() {
        return Collections.unmodifiableList(this.c);
    }

    public WebView f() {
        return this.b;
    }
}
