package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: ZPa reason: default package */
/* compiled from: CompositeException */
public final class ZPa extends RuntimeException {
    private final List<Throwable> a;
    private final String b;
    private Throwable c;

    /* renamed from: ZPa$a */
    /* compiled from: CompositeException */
    static final class a extends RuntimeException {
        a() {
        }

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: ZPa$b */
    /* compiled from: CompositeException */
    static abstract class b {
        b() {
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(Object obj);
    }

    /* renamed from: ZPa$c */
    /* compiled from: CompositeException */
    static final class c extends b {
        private final PrintStream a;

        c(PrintStream printStream) {
            this.a = printStream;
        }

        /* access modifiers changed from: 0000 */
        public void a(Object obj) {
            this.a.println(obj);
        }
    }

    /* renamed from: ZPa$d */
    /* compiled from: CompositeException */
    static final class d extends b {
        private final PrintWriter a;

        d(PrintWriter printWriter) {
            this.a = printWriter;
        }

        /* access modifiers changed from: 0000 */
        public void a(Object obj) {
            this.a.println(obj);
        }
    }

    public ZPa(Throwable... thArr) {
        this((Iterable<? extends Throwable>) thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private List<Throwable> b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    public List<Throwable> a() {
        return this.a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|(4:13|(2:15|33)(2:16|34)|32|11)|17|18|19|20|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    public synchronized Throwable getCause() {
        if (this.c == null) {
            Throwable aVar = new a();
            HashSet hashSet = new HashSet();
            Throwable th = aVar;
            for (Throwable th2 : this.a) {
                if (!hashSet.contains(th2)) {
                    hashSet.add(th2);
                    for (Throwable th3 : b(th2)) {
                        if (hashSet.contains(th3)) {
                            th2 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th3);
                        }
                    }
                    th.initCause(th2);
                    th = a(th);
                }
            }
            this.c = aVar;
        }
        return this.c;
    }

    public String getMessage() {
        return this.b;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    private void a(b bVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        int i = 1;
        for (Throwable th : this.a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            a(sb, th, "\t");
            i++;
        }
        bVar.a(sb.toString());
    }

    public void printStackTrace(PrintStream printStream) {
        a((b) new c(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        a((b) new d(printWriter));
    }

    public ZPa(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof ZPa) {
                    linkedHashSet.addAll(((ZPa) th).a());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.a = Collections.unmodifiableList(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.size());
            sb.append(" exceptions occurred. ");
            this.b = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    private void a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    /* access modifiers changed from: 0000 */
    public Throwable a(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }
}
