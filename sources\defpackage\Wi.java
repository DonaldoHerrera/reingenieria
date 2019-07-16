package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Wi reason: default package */
/* compiled from: InvalidSessionReport */
class Wi implements C1513mj {
    private final File[] a;
    private final Map<String, String> b = new HashMap(C1544nj.a);
    private final String c;

    public Wi(String str, File[] fileArr) {
        this.a = fileArr;
        this.c = str;
    }

    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.b);
    }

    public String b() {
        return this.c;
    }

    public File c() {
        return this.a[0];
    }

    public File[] d() {
        return this.a;
    }

    public String getFileName() {
        return this.a[0].getName();
    }

    public a getType() {
        return a.JAVA;
    }

    public void remove() {
        File[] fileArr;
        for (File file : this.a) {
            C5701cNa e = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Removing invalid report file at ");
            sb.append(file.getPath());
            e.d("CrashlyticsCore", sb.toString());
            file.delete();
        }
    }
}
