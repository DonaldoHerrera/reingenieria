package defpackage;

import android.content.Context;

/* renamed from: INa reason: default package and case insensitive filesystem */
/* compiled from: InstallerPackageNameProvider */
public class C4993INa {
    private final C6569hNa<String> a = new C4962HNa(this);
    private final C6433fNa<String> b = new C6433fNa<>();

    public String a(Context context) {
        try {
            String str = (String) this.b.a(context, this.a);
            if ("".equals(str)) {
                str = null;
            }
            return str;
        } catch (Exception e) {
            C5328TMa.e().e("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
