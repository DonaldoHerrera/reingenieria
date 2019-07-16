package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: SDb reason: default package */
/* compiled from: Timber */
public final class SDb {
    private static final b[] a = new b[0];
    private static final List<b> b = new ArrayList();
    static volatile b[] c = a;
    private static final b d = new RDb();

    /* renamed from: SDb$a */
    /* compiled from: Timber */
    public static class a extends b {
        private static final Pattern b = Pattern.compile("(\\$\\d+)+$");

        /* access modifiers changed from: protected */
        public String a(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Matcher matcher = b.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String substring = className.substring(className.lastIndexOf(46) + 1);
            return (substring.length() <= 23 || VERSION.SDK_INT >= 24) ? substring : substring.substring(0, 23);
        }

        /* access modifiers changed from: 0000 */
        public final String a() {
            String a = super.a();
            if (a != null) {
                return a;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                return a(stackTrace[5]);
            }
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }

        /* access modifiers changed from: protected */
        public void a(int i, String str, String str2, Throwable th) {
            int min;
            if (str2.length() < 4000) {
                if (i == 7) {
                    Log.wtf(str, str2);
                } else {
                    Log.println(i, str, str2);
                }
                return;
            }
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                int indexOf = str2.indexOf(10, i2);
                if (indexOf == -1) {
                    indexOf = length;
                }
                while (true) {
                    min = Math.min(indexOf, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    if (i == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(i, str, substring);
                    }
                    if (min >= indexOf) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: SDb$b */
    /* compiled from: Timber */
    public static abstract class b {
        final ThreadLocal<String> a = new ThreadLocal<>();

        /* access modifiers changed from: 0000 */
        public String a() {
            String str = (String) this.a.get();
            if (str != null) {
                this.a.remove();
            }
            return str;
        }

        /* access modifiers changed from: protected */
        public abstract void a(int i, String str, String str2, Throwable th);

        /* access modifiers changed from: protected */
        @Deprecated
        public boolean a(int i) {
            return true;
        }

        public void b(Throwable th, String str, Object... objArr) {
            a(5, th, str, objArr);
        }

        /* access modifiers changed from: protected */
        public String c(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        public void d(String str, Object... objArr) {
            a(4, (Throwable) null, str, objArr);
        }

        public void e(String str, Object... objArr) {
            a(2, (Throwable) null, str, objArr);
        }

        public void f(String str, Object... objArr) {
            a(5, (Throwable) null, str, objArr);
        }

        public void b(String str, Object... objArr) {
            a(6, (Throwable) null, str, objArr);
        }

        private String b(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        public void a(String str, Object... objArr) {
            a(3, (Throwable) null, str, objArr);
        }

        public void a(Throwable th, String str, Object... objArr) {
            a(6, th, str, objArr);
        }

        public void a(Throwable th) {
            a(6, th, (String) null, new Object[0]);
        }

        public void a(int i, String str, Object... objArr) {
            a(i, (Throwable) null, str, objArr);
        }

        /* access modifiers changed from: protected */
        public boolean a(String str, int i) {
            return a(i);
        }

        private void a(int i, Throwable th, String str, Object... objArr) {
            String a2 = a();
            if (a(a2, i)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = c(str, objArr);
                    }
                    if (th != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("\n");
                        sb.append(b(th));
                        str = sb.toString();
                    }
                } else if (th != null) {
                    str = b(th);
                } else {
                    return;
                }
                a(i, a2, str, th);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        d.a(str, objArr);
    }

    public static void b(Throwable th, String str, Object... objArr) {
        d.b(th, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        d.d(str, objArr);
    }

    public static void d(String str, Object... objArr) {
        d.e(str, objArr);
    }

    public static void e(String str, Object... objArr) {
        d.f(str, objArr);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        d.a(th, str, objArr);
    }

    public static void b(String str, Object... objArr) {
        d.b(str, objArr);
    }

    public static void a(Throwable th) {
        d.a(th);
    }

    public static b a(String str) {
        for (b bVar : c) {
            bVar.a.set(str);
        }
        return d;
    }

    public static void a(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("tree == null");
        } else if (bVar != d) {
            synchronized (b) {
                b.add(bVar);
                c = (b[]) b.toArray(new b[b.size()]);
            }
        } else {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
    }
}
