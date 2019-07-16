package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: Yi reason: default package */
/* compiled from: LogFileManager */
class Yi {
    private static final b a = new b();
    private final Context b;
    private final a c;
    private Vi d;

    /* renamed from: Yi$a */
    /* compiled from: LogFileManager */
    public interface a {
        File a();
    }

    /* renamed from: Yi$b */
    /* compiled from: LogFileManager */
    private static final class b implements Vi {
        private b() {
        }

        public void a() {
        }

        public void a(long j, String str) {
        }

        public Jh b() {
            return null;
        }

        public byte[] c() {
            return null;
        }

        public void d() {
        }
    }

    Yi(Context context, a aVar) {
        this(context, aVar, null);
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        this.d.a();
        this.d = a;
        if (str != null) {
            if (!C7391tNa.a(this.b, "com.crashlytics.CollectCustomLogs", true)) {
                C5328TMa.e().d("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            } else {
                a(b(str), 65536);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public Jh b() {
        return this.d.b();
    }

    /* access modifiers changed from: 0000 */
    public byte[] c() {
        return this.d.c();
    }

    Yi(Context context, a aVar, String str) {
        this.b = context;
        this.c = aVar;
        this.d = a;
        a(str);
    }

    private File b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("crashlytics-userlog-");
        sb.append(str);
        sb.append(".temp");
        return new File(this.c.a(), sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a(long j, String str) {
        this.d.a(j, str);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.d.d();
    }

    /* access modifiers changed from: 0000 */
    public void a(Set<String> set) {
        File[] listFiles = this.c.a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(a(file))) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(File file, int i) {
        this.d = new C1451kj(file, i);
    }

    private String a(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(20, lastIndexOf);
    }
}
