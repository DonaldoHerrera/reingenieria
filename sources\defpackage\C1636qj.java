package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qj reason: default package and case insensitive filesystem */
/* compiled from: SessionReport */
class C1636qj implements C1513mj {
    private final File a;
    private final File[] b;
    private final Map<String, String> c;

    public C1636qj(File file) {
        this(file, Collections.emptyMap());
    }

    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.c);
    }

    public String b() {
        String fileName = getFileName();
        return fileName.substring(0, fileName.lastIndexOf(46));
    }

    public File c() {
        return this.a;
    }

    public File[] d() {
        return this.b;
    }

    public String getFileName() {
        return c().getName();
    }

    public a getType() {
        return a.JAVA;
    }

    public void remove() {
        C5701cNa e = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Removing report at ");
        sb.append(this.a.getPath());
        e.d("CrashlyticsCore", sb.toString());
        this.a.delete();
    }

    public C1636qj(File file, Map<String, String> map) {
        this.a = file;
        this.b = new File[]{file};
        this.c = new HashMap(map);
        if (this.a.length() == 0) {
            this.c.putAll(C1544nj.a);
        }
    }
}
