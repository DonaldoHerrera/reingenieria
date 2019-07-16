package defpackage;

/* renamed from: zO reason: default package and case insensitive filesystem */
/* compiled from: PerformanceReporter.kt */
public final class C3397zO implements C2074HO {
    private boolean a;
    private final String b;

    public C3397zO(String str) {
        C7471uYa.b(str, "traceName");
        this.b = str;
    }

    public void a(String str, long j) {
        C7471uYa.b(str, "label");
        if (!this.a) {
            b a2 = SDb.a("PerformanceReporter");
            StringBuilder sb = new StringBuilder();
            sb.append("Increment counter ");
            sb.append(str);
            sb.append(" by ");
            sb.append(j);
            sb.append(" for ");
            sb.append(this.b);
            a2.a(sb.toString(), new Object[0]);
        }
    }

    public void b(String str, long j) {
        C7471uYa.b(str, "label");
        if (!this.a) {
            b a2 = SDb.a("PerformanceReporter");
            StringBuilder sb = new StringBuilder();
            sb.append("putAttribute ");
            sb.append(str);
            sb.append(" by ");
            sb.append(j);
            sb.append(" for ");
            sb.append(this.b);
            a2.a(sb.toString(), new Object[0]);
        }
    }

    public void start() {
        b a2 = SDb.a("PerformanceReporter");
        StringBuilder sb = new StringBuilder();
        sb.append("Started ");
        sb.append(this.b);
        a2.a(sb.toString(), new Object[0]);
    }

    public void stop() {
        if (!this.a) {
            b a2 = SDb.a("PerformanceReporter");
            StringBuilder sb = new StringBuilder();
            sb.append("Stopped ");
            sb.append(this.b);
            a2.a(sb.toString(), new Object[0]);
            this.a = true;
        }
    }
}
