package defpackage;

import java.io.Serializable;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u001fB\u0016\b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\b¢\u0006\u0004\b\u0017\u0010\u0007J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isFailure", "", "isFailure-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isSuccess-impl", "value$annotations", "()V", "equals", "other", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getOrNull", "getOrNull-impl", "hashCode", "", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Failure", "kotlin-stdlib"}, mv = {1, 1, 15})
/* renamed from: IVa reason: default package */
/* compiled from: Result.kt */
public final class IVa<T> implements Serializable {
    public static final a a = new a(null);
    private final Object b;

    /* renamed from: IVa$a */
    /* compiled from: Result.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: IVa$b */
    /* compiled from: Result.kt */
    public static final class b implements Serializable {
        public final Throwable a;

        public b(Throwable th) {
            C7471uYa.b(th, "exception");
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && C7471uYa.a((Object) this.a, (Object) ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure(");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }

    private /* synthetic */ IVa(Object obj) {
        this.b = obj;
    }

    public static final /* synthetic */ IVa a(Object obj) {
        return new IVa(obj);
    }

    public static boolean a(Object obj, Object obj2) {
        return (obj2 instanceof IVa) && C7471uYa.a(obj, ((IVa) obj2).a());
    }

    public static Object b(Object obj) {
        return obj;
    }

    public static int c(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }

    public static String e(Object obj) {
        if (obj instanceof b) {
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Success(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public final /* synthetic */ Object a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return a(this.b, obj);
    }

    public int hashCode() {
        return c(this.b);
    }

    public String toString() {
        return e(this.b);
    }
}
