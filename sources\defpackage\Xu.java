package defpackage;

import java.io.PrintStream;

/* renamed from: Xu reason: default package */
public final class Xu {
    private static final _u a;
    private static final int b;

    /* renamed from: Xu$a */
    static final class a extends _u {
        a() {
        }

        public final void a(Throwable th) {
            th.printStackTrace();
        }

        public final void a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    static {
        _u _uVar;
        Integer num;
        int i = 1;
        try {
            num = a();
            if (num != null) {
                try {
                    if (num.intValue() >= 19) {
                        _uVar = new C1217cv();
                        a = _uVar;
                        if (num != null) {
                            i = num.intValue();
                        }
                        b = i;
                    }
                } catch (Throwable th) {
                    th = th;
                    PrintStream printStream = System.err;
                    String name = a.class.getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
                    sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                    sb.append(name);
                    sb.append("will be used. The error is: ");
                    printStream.println(sb.toString());
                    th.printStackTrace(System.err);
                    _uVar = new a();
                    a = _uVar;
                    if (num != null) {
                    }
                    b = i;
                }
            }
            if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                _uVar = new C0475av();
            } else {
                _uVar = new a();
            }
        } catch (Throwable th2) {
            th = th2;
            num = null;
            PrintStream printStream2 = System.err;
            String name2 = a.class.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 133);
            sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb2.append(name2);
            sb2.append("will be used. The error is: ");
            printStream2.println(sb2.toString());
            th.printStackTrace(System.err);
            _uVar = new a();
            a = _uVar;
            if (num != null) {
            }
            b = i;
        }
        a = _uVar;
        if (num != null) {
        }
        b = i;
    }

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }

    public static void a(Throwable th) {
        a.a(th);
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
