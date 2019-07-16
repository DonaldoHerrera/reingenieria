package defpackage;

import defpackage.C0197Cw;
import defpackage.C0197Cw.b;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Cw reason: default package and case insensitive filesystem */
public abstract class C0197Cw<MessageType extends C0197Cw<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends C0256Sv<MessageType, BuilderType> {
    private static Map<Object, C0197Cw<?, ?>> zzte = new ConcurrentHashMap();
    protected Rx zztc = Rx.b();
    private int zztd = -1;

    /* renamed from: Cw$a */
    public static class a<T extends C0197Cw<T, ?>> extends C0265Uv<T> {
        private final T b;

        public a(T t) {
            this.b = t;
        }
    }

    /* renamed from: Cw$b */
    public static abstract class b<MessageType extends C0197Cw<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends C0252Rv<MessageType, BuilderType> {
        private final MessageType a;
        private MessageType b;
        private boolean c = false;

        protected b(MessageType messagetype) {
            this.a = messagetype;
            this.b = (C0197Cw) messagetype.a(e.d, (Object) null, (Object) null);
        }

        public final BuilderType a(MessageType messagetype) {
            if (this.c) {
                MessageType messagetype2 = (C0197Cw) this.b.a(e.d, (Object) null, (Object) null);
                a(messagetype2, this.b);
                this.b = messagetype2;
                this.c = false;
            }
            a(this.b, messagetype);
            return this;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b bVar = (b) this.a.a(e.e, (Object) null, (Object) null);
            bVar.a((MessageType) (C0197Cw) y());
            return bVar;
        }

        /* renamed from: d */
        public MessageType y() {
            if (this.c) {
                return this.b;
            }
            this.b.d();
            this.c = true;
            return this.b;
        }

        /* renamed from: f */
        public final MessageType h() {
            MessageType messagetype = (C0197Cw) y();
            if (messagetype.i()) {
                return messagetype;
            }
            throw new Ox(messagetype);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            C1739tx.a().a(messagetype).b(messagetype, messagetype2);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ C0252Rv a(C0256Sv sv) {
            a((MessageType) (C0197Cw) sv);
            return this;
        }

        public final /* synthetic */ C1403ix a() {
            return this.a;
        }
    }

    /* renamed from: Cw$c */
    public static class c<ContainingType extends C1403ix, Type> extends C1708sw<ContainingType, Type> {
    }

    /* renamed from: Cw$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends C0197Cw<MessageType, BuilderType> implements C1465kx {
        protected C1858xw<Object> zztj = C1858xw.e();

        /* access modifiers changed from: 0000 */
        public final C1858xw<Object> g() {
            if (this.zztj.a()) {
                this.zztj = (C1858xw) this.zztj.clone();
            }
            return this.zztj;
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: Cw$e */
    public static final class e {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {a, b, c, d, e, f, g};
        public static final int i = 1;
        public static final int j = 2;
        private static final /* synthetic */ int[] k = {i, j};
        public static final int l = 1;
        public static final int m = 2;
        private static final /* synthetic */ int[] n = {l, m};

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    static <T extends C0197Cw<?, ?>> T a(Class<T> cls) {
        T t = (C0197Cw) zzte.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C0197Cw) zzte.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (C0197Cw) ((C0197Cw) Ux.a(cls)).a(e.f, (Object) null, (Object) null);
            if (t != null) {
                zzte.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <E> C0213Hw<E> f() {
        return C1829wx.d();
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    public final /* synthetic */ C1373hx b() {
        return (b) a(e.e, (Object) null, (Object) null);
    }

    public final /* synthetic */ C1373hx c() {
        b bVar = (b) a(e.e, (Object) null, (Object) null);
        bVar.a(this);
        return bVar;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        C1739tx.a().a(this).b(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C0197Cw) a(e.f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C1739tx.a().a(this).a(this, (C0197Cw) obj);
    }

    public int hashCode() {
        int i = this.zzoj;
        if (i != 0) {
            return i;
        }
        this.zzoj = C1739tx.a().a(this).a(this);
        return this.zzoj;
    }

    public final boolean i() {
        return a((T) this, Boolean.TRUE.booleanValue());
    }

    public String toString() {
        return C1434jx.a(this, super.toString());
    }

    protected static <T extends C0197Cw<?, ?>> void a(Class<T> cls, T t) {
        zzte.put(cls, t);
    }

    protected static Object a(C1403ix ixVar, String str, Object[] objArr) {
        return new C1799vx(ixVar, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends C0197Cw<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(e.a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = C1739tx.a().a(t).c(t);
        if (z) {
            t.a(e.b, (Object) c2 ? t : null, (Object) null);
        }
        return c2;
    }

    private static <T extends C0197Cw<T, ?>> T a(T t, C1433jw jwVar, C1738tw twVar) throws C0225Kw {
        T t2 = (C0197Cw) t.a(e.d, (Object) null, (Object) null);
        try {
            C1739tx.a().a(t2).a(t2, C1619pw.a(jwVar), twVar);
            t2.d();
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C0225Kw) {
                throw ((C0225Kw) e2.getCause());
            }
            C0225Kw kw = new C0225Kw(e2.getMessage());
            kw.a(t2);
            throw kw;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof C0225Kw) {
                throw ((C0225Kw) e3.getCause());
            }
            throw e3;
        }
    }

    private static <T extends C0197Cw<T, ?>> T a(T t, byte[] bArr, int i, int i2, C1738tw twVar) throws C0225Kw {
        T t2 = (C0197Cw) t.a(e.d, (Object) null, (Object) null);
        try {
            C1739tx.a().a(t2).a(t2, bArr, 0, i2, new C0285Yv(twVar));
            t2.d();
            if (t2.zzoj == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof C0225Kw) {
                throw ((C0225Kw) e2.getCause());
            }
            C0225Kw kw = new C0225Kw(e2.getMessage());
            kw.a(t2);
            throw kw;
        } catch (IndexOutOfBoundsException unused) {
            C0225Kw a2 = C0225Kw.a();
            a2.a(t2);
            throw a2;
        }
    }

    private static <T extends C0197Cw<T, ?>> T a(T t) throws C0225Kw {
        if (t == null || t.i()) {
            return t;
        }
        C0225Kw kw = new C0225Kw(new Ox(t).getMessage());
        kw.a(t);
        throw kw;
    }

    protected static <T extends C0197Cw<T, ?>> T a(T t, byte[] bArr) throws C0225Kw {
        T a2 = a(t, bArr, 0, bArr.length, C1738tw.a());
        a(a2);
        return a2;
    }

    protected static <T extends C0197Cw<T, ?>> T a(T t, InputStream inputStream) throws C0225Kw {
        C1433jw jwVar;
        if (inputStream == null) {
            byte[] bArr = C0209Gw.c;
            jwVar = C1433jw.a(bArr, 0, bArr.length, false);
        } else {
            jwVar = new C1588ow(inputStream);
        }
        T a2 = a(t, jwVar, C1738tw.a());
        a(a2);
        return a2;
    }

    public final /* synthetic */ C1403ix a() {
        return (C0197Cw) a(e.f, (Object) null, (Object) null);
    }
}
