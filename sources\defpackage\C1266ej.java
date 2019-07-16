package defpackage;

import java.io.File;
import java.util.Map;

/* renamed from: ej reason: default package and case insensitive filesystem */
/* compiled from: NativeSessionReport */
class C1266ej implements C1513mj {
    private final File a;

    public C1266ej(File file) {
        this.a = file;
    }

    public Map<String, String> a() {
        return null;
    }

    public String b() {
        return this.a.getName();
    }

    public File c() {
        return null;
    }

    public File[] d() {
        return this.a.listFiles();
    }

    public String getFileName() {
        return null;
    }

    public a getType() {
        return a.NATIVE;
    }

    public void remove() {
        File[] d = d();
        int length = d.length;
        int i = 0;
        while (true) {
            String str = "CrashlyticsCore";
            if (i < length) {
                File file = d[i];
                C5701cNa e = C5328TMa.e();
                StringBuilder sb = new StringBuilder();
                sb.append("Removing native report file at ");
                sb.append(file.getPath());
                e.d(str, sb.toString());
                file.delete();
                i++;
            } else {
                C5701cNa e2 = C5328TMa.e();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Removing native report directory at ");
                sb2.append(this.a);
                e2.d(str, sb2.toString());
                this.a.delete();
                return;
            }
        }
    }
}
