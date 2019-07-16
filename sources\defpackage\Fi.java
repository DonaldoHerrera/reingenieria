package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: Fi reason: default package */
/* compiled from: CrashlyticsFileMarker */
class Fi {
    private final String a;
    private final C4994IOa b;

    public Fi(String str, C4994IOa iOa) {
        this.a = str;
        this.b = iOa;
    }

    private File d() {
        return new File(this.b.a(), this.a);
    }

    public boolean a() {
        try {
            return d().createNewFile();
        } catch (IOException e) {
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating marker: ");
            sb.append(this.a);
            e2.e("CrashlyticsCore", sb.toString(), e);
            return false;
        }
    }

    public boolean b() {
        return d().exists();
    }

    public boolean c() {
        return d().delete();
    }
}
