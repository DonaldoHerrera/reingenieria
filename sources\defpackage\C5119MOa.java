package defpackage;

import android.content.res.Resources.NotFoundException;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collection;
import java.util.Locale;

/* renamed from: MOa reason: default package and case insensitive filesystem */
/* compiled from: AbstractAppSpiCall */
abstract class C5119MOa extends C6637iNa implements ROa {
    public C5119MOa(C5531_Ma _ma, String str, String str2, C4839DOa dOa, C7806zOa zoa) {
        super(_ma, str, str2, dOa, zoa);
    }

    private C4777BOa b(C4777BOa bOa, POa pOa) {
        String str = "Failed to close app icon InputStream.";
        bOa.e("app[identifier]", pOa.b);
        bOa.e("app[name]", pOa.f);
        bOa.e("app[display_version]", pOa.c);
        bOa.e("app[build_version]", pOa.d);
        bOa.a("app[source]", (Number) Integer.valueOf(pOa.g));
        bOa.e("app[minimum_sdk_version]", pOa.h);
        bOa.e("app[built_sdk_version]", pOa.i);
        if (!C7391tNa.b(pOa.e)) {
            bOa.e("app[instance_identifier]", pOa.e);
        }
        if (pOa.j != null) {
            InputStream inputStream = null;
            try {
                inputStream = this.f.e().getResources().openRawResource(pOa.j.b);
                bOa.e("app[icon][hash]", pOa.j.a);
                bOa.a("app[icon][data]", "icon.png", "application/octet-stream", inputStream);
                bOa.a("app[icon][width]", (Number) Integer.valueOf(pOa.j.c));
                bOa.a("app[icon][height]", (Number) Integer.valueOf(pOa.j.d));
            } catch (NotFoundException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find app icon with resource ID: ");
                sb.append(pOa.j.b);
                C5328TMa.e().e("Fabric", sb.toString(), e);
            } catch (Throwable th) {
                C7391tNa.a((Closeable) inputStream, str);
                throw th;
            }
            C7391tNa.a((Closeable) inputStream, str);
        }
        Collection<C5633bNa> collection = pOa.k;
        if (collection != null) {
            for (C5633bNa bna : collection) {
                bOa.e(b(bna), bna.c());
                bOa.e(a(bna), bna.a());
            }
        }
        return bOa;
    }

    public boolean a(POa pOa) {
        C4777BOa a = a();
        a(a, pOa);
        b(a, pOa);
        C5701cNa e = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Sending app info to ");
        sb.append(b());
        String str = "Fabric";
        e.d(str, sb.toString());
        if (pOa.j != null) {
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("App icon hash is ");
            sb2.append(pOa.j.a);
            e2.d(str, sb2.toString());
            C5701cNa e3 = C5328TMa.e();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("App icon size is ");
            sb3.append(pOa.j.c);
            sb3.append("x");
            sb3.append(pOa.j.d);
            e3.d(str, sb3.toString());
        }
        int g = a.g();
        String str2 = "POST".equals(a.k()) ? "Create" : "Update";
        C5701cNa e4 = C5328TMa.e();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(" app request ID: ");
        sb4.append(a.d("X-REQUEST-ID"));
        e4.d(str, sb4.toString());
        C5701cNa e5 = C5328TMa.e();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Result was ");
        sb5.append(g);
        e5.d(str, sb5.toString());
        return C5087LNa.a(g) == 0;
    }

    private C4777BOa a(C4777BOa bOa, POa pOa) {
        bOa.c("X-CRASHLYTICS-API-KEY", pOa.a);
        bOa.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bOa.c("X-CRASHLYTICS-API-CLIENT-VERSION", this.f.x());
        return bOa;
    }

    /* access modifiers changed from: 0000 */
    public String a(C5633bNa bna) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[]{bna.b()});
    }

    /* access modifiers changed from: 0000 */
    public String b(C5633bNa bna) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[]{bna.b()});
    }
}
