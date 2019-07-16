package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: kj reason: default package and case insensitive filesystem */
/* compiled from: QueueFileLogStore */
class C1451kj implements Vi {
    private final File a;
    private final int b;
    private C5056KNa c;

    /* renamed from: kj$a */
    /* compiled from: QueueFileLogStore */
    public class a {
        public final byte[] a;
        public final int b;

        public a(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public C1451kj(File file, int i) {
        this.a = file;
        this.b = i;
    }

    private a e() {
        if (!this.a.exists()) {
            return null;
        }
        f();
        C5056KNa kNa = this.c;
        if (kNa == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[kNa.d()];
        try {
            this.c.a((c) new C1420jj(this, bArr, iArr));
        } catch (IOException e) {
            C5328TMa.e().e("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e);
        }
        return new a(bArr, iArr[0]);
    }

    private void f() {
        if (this.c == null) {
            try {
                this.c = new C5056KNa(this.a);
            } catch (IOException e) {
                C5701cNa e2 = C5328TMa.e();
                StringBuilder sb = new StringBuilder();
                sb.append("Could not open log file: ");
                sb.append(this.a);
                e2.e("CrashlyticsCore", sb.toString(), e);
            }
        }
    }

    public void a(long j, String str) {
        f();
        b(j, str);
    }

    public Jh b() {
        a e = e();
        if (e == null) {
            return null;
        }
        return Jh.a(e.a, 0, e.b);
    }

    public byte[] c() {
        a e = e();
        if (e == null) {
            return null;
        }
        return e.a;
    }

    public void d() {
        a();
        this.a.delete();
    }

    private void b(long j, String str) {
        String str2 = " ";
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.b / 4;
                if (str.length() > i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("...");
                    sb.append(str.substring(str.length() - i));
                    str = sb.toString();
                }
                this.c.a(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", str2).replaceAll("\n", str2)}).getBytes("UTF-8"));
                while (!this.c.b() && this.c.d() > this.b) {
                    this.c.c();
                }
            } catch (IOException e) {
                C5328TMa.e().e("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    public void a() {
        C7391tNa.a((Closeable) this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }
}
