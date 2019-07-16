package defpackage;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002!\"B?\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/soundcloud/rx/eventbus/Queue;", "T", "", "name", "", "eventType", "Ljava/lang/Class;", "replayLast", "", "defaultEvent", "onError", "Lio/reactivex/functions/Consumer;", "", "(Ljava/lang/String;Ljava/lang/Class;ZLjava/lang/Object;Lio/reactivex/functions/Consumer;)V", "getDefaultEvent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getEventType", "()Ljava/lang/Class;", "id", "", "getId$core", "()I", "getName", "()Ljava/lang/String;", "getOnError", "()Lio/reactivex/functions/Consumer;", "getReplayLast", "()Z", "equals", "that", "hashCode", "toString", "Builder", "Companion", "core"}, mv = {1, 1, 15})
/* renamed from: XLa reason: default package and case insensitive filesystem */
/* compiled from: Queue.kt */
public final class C5443XLa<T> {
    private static int a;
    public static final b b = new b(null);
    private final int c;
    private final String d;
    private final Class<T> e;
    private final boolean f;
    private final T g;
    private final C6776kQa<Throwable> h;

    /* renamed from: XLa$a */
    /* compiled from: Queue.kt */
    public static final class a<T> {
        private String a;
        private boolean b;
        private T c;
        private C6776kQa<Throwable> d;
        private final Class<T> e;

        public a(Class<T> cls) {
            C7471uYa.b(cls, "eventType");
            this.e = cls;
        }

        public final a<T> a(T t) {
            this.b = true;
            this.c = t;
            return this;
        }

        public final a<T> b() {
            this.b = true;
            return this;
        }

        public final a<T> a(C6776kQa<Throwable> kqa) {
            C7471uYa.b(kqa, "onError");
            this.d = kqa;
            return this;
        }

        public final C5443XLa<T> a() {
            String str = this.a;
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.e.getSimpleName());
                sb.append("Queue");
                str = sb.toString();
            }
            C5443XLa xLa = new C5443XLa(str, this.e, this.b, this.c, this.d);
            return xLa;
        }
    }

    /* renamed from: XLa$b */
    /* compiled from: Queue.kt */
    public static final class b {
        private b() {
        }

        @NXa
        public final <T> a<T> a(Class<T> cls) {
            C7471uYa.b(cls, "eventType");
            return new a<>(cls);
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public C5443XLa(String str, Class<T> cls, boolean z, T t, C6776kQa<Throwable> kqa) {
        C7471uYa.b(str, "name");
        C7471uYa.b(cls, "eventType");
        this.d = str;
        this.e = cls;
        this.f = z;
        this.g = t;
        this.h = kqa;
        int i = a;
        a = i + 1;
        this.c = i;
    }

    @NXa
    public static final <T> a<T> a(Class<T> cls) {
        return b.a(cls);
    }

    public final T a() {
        return this.g;
    }

    public final int b() {
        return this.c;
    }

    public final C6776kQa<Throwable> c() {
        return this.h;
    }

    public final boolean d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C5443XLa) && ((C5443XLa) obj).c == this.c;
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(" [");
        sb.append(this.e.getCanonicalName());
        sb.append(']');
        return sb.toString();
    }
}
