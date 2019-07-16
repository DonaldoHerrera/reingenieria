package defpackage;

import android.util.Log;

/* renamed from: Dj reason: default package */
/* compiled from: JobCat */
public class Dj implements Ej {
    private static volatile Ej[] a = new Ej[0];
    private static volatile boolean b = true;
    protected final String c;
    protected final boolean d;

    public Dj(String str) {
        this(str, true);
    }

    public void a(String str) {
        a(3, this.c, str, null);
    }

    public void b(Throwable th, String str, Object... objArr) {
        a(5, this.c, String.format(str, objArr), th);
    }

    public void c(String str) {
        a(4, this.c, str, null);
    }

    public void d(String str) {
        a(5, this.c, str, null);
    }

    public Dj(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public void a(String str, Object... objArr) {
        a(3, this.c, String.format(str, objArr), null);
    }

    public void b(String str) {
        a(6, this.c, str, null);
    }

    public void c(String str, Object... objArr) {
        a(4, this.c, String.format(str, objArr), null);
    }

    public void d(String str, Object... objArr) {
        a(5, this.c, String.format(str, objArr), null);
    }

    public void a(Throwable th) {
        String message = th.getMessage();
        String str = this.c;
        if (message == null) {
            message = "empty message";
        }
        a(6, str, message, th);
    }

    public void b(String str, Object... objArr) {
        a(6, this.c, String.format(str, objArr), null);
    }

    public void a(Throwable th, String str, Object... objArr) {
        a(6, this.c, String.format(str, objArr), th);
    }

    public void a(int i, String str, String str2, Throwable th) {
        String str3;
        if (this.d) {
            if (b) {
                if (th == null) {
                    str3 = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(10);
                    sb.append(Log.getStackTraceString(th));
                    str3 = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(str3);
                Log.println(i, str, sb2.toString());
            }
            Ej[] ejArr = a;
            if (ejArr.length > 0) {
                for (Ej ej : ejArr) {
                    if (ej != null) {
                        ej.a(i, str, str2, th);
                    }
                }
            }
        }
    }
}
