package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0755ga;
import com.google.android.gms.internal.clearcut.C0755ga.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.ga reason: case insensitive filesystem */
public abstract class C0755ga<MessageType extends C0755ga<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends C0784q<MessageType, BuilderType> {
    private static Map<Object, C0755ga<?, ?>> zzjr = new ConcurrentHashMap();
    protected C0797ub zzjp = C0797ub.b();
    private int zzjq = -1;

    /* renamed from: com.google.android.gms.internal.clearcut.ga$a */
    public static abstract class a<MessageType extends C0755ga<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends r<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;
        protected boolean c = false;

        protected a(MessageType messagetype) {
            this.a = messagetype;
            this.b = (C0755ga) messagetype.a(e.d, (Object) null, (Object) null);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            Xa.a().a(messagetype).b(messagetype, messagetype2);
        }

        public final BuilderType a(MessageType messagetype) {
            e();
            a(this.b, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ r a(C0784q qVar) {
            a((MessageType) (C0755ga) qVar);
            return this;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.a.a(e.e, (Object) null, (Object) null);
            aVar.a((MessageType) (C0755ga) u());
            return aVar;
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (this.c) {
                MessageType messagetype = (C0755ga) this.b.a(e.d, (Object) null, (Object) null);
                a(messagetype, this.b);
                this.b = messagetype;
                this.c = false;
            }
        }

        public final /* synthetic */ La g() {
            C0755ga gaVar = (C0755ga) u();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) gaVar.a(e.a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = Xa.a().a(gaVar).c(gaVar);
                    if (booleanValue) {
                        gaVar.a(e.b, (Object) z ? gaVar : null, (Object) null);
                    }
                }
            }
            if (z) {
                return gaVar;
            }
            throw new C0791sb(gaVar);
        }

        /* renamed from: h */
        public MessageType u() {
            if (this.c) {
                return this.b;
            }
            MessageType messagetype = this.b;
            Xa.a().a(messagetype).d(messagetype);
            this.c = true;
            return this.b;
        }

        public final /* synthetic */ La j() {
            return this.a;
        }

        public final MessageType k() {
            MessageType messagetype = (C0755ga) u();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.a(e.a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = Xa.a().a(messagetype).c(messagetype);
                    if (booleanValue) {
                        messagetype.a(e.b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new C0791sb(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.ga$b */
    public static class b<T extends C0755ga<T, ?>> extends C0789s<T> {
        private T b;

        public b(T t) {
            this.b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.ga$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends C0755ga<MessageType, BuilderType> implements Na {
        protected X<d> zzjv = X.f();
    }

    /* renamed from: com.google.android.gms.internal.clearcut.ga$d */
    static final class d implements C0737aa<d> {
        final int a;
        final Ib b;

        public final Ma a(Ma ma, La la) {
            a aVar = (a) ma;
            aVar.a((C0755ga) la);
            return aVar;
        }

        public final Ra a(Ra ra, Ra ra2) {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return this.a - ((d) obj).a;
        }

        public final boolean m() {
            return false;
        }

        public final Nb n() {
            return this.b.a();
        }

        public final boolean o() {
            return false;
        }

        public final Ib r() {
            return this.b;
        }

        public final int zzc() {
            return this.a;
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.clearcut.ga$e */
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

    protected static <T extends C0755ga<T, ?>> T a(T t, byte[] bArr) throws C0773ma {
        T b2 = b(t, bArr);
        if (b2 != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) b2.a(e.a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = Xa.a().a(b2).c(b2);
                    if (booleanValue) {
                        b2.a(e.b, (Object) z ? b2 : null, (Object) null);
                    }
                }
            }
            if (!z) {
                C0773ma maVar = new C0773ma(new C0791sb(b2).getMessage());
                maVar.a(b2);
                throw maVar;
            }
        }
        return b2;
    }

    static <T extends C0755ga<?, ?>> T a(Class<T> cls) {
        T t = (C0755ga) zzjr.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C0755ga) zzjr.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t != null) {
            return t;
        }
        String str = "Unable to get default instance for: ";
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected static Object a(La la, String str, Object[] objArr) {
        return new Za(la, str, objArr);
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

    protected static <T extends C0755ga<?, ?>> void a(Class<T> cls, T t) {
        zzjr.put(cls, t);
    }

    private static <T extends C0755ga<T, ?>> T b(T t, byte[] bArr) throws C0773ma {
        T t2 = (C0755ga) t.a(e.d, (Object) null, (Object) null);
        try {
            Xa.a().a(t2).a(t2, bArr, 0, bArr.length, new C0801w());
            Xa.a().a(t2).d(t2);
            if (t2.zzex == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof C0773ma) {
                throw ((C0773ma) e2.getCause());
            }
            C0773ma maVar = new C0773ma(e2.getMessage());
            maVar.a(t2);
            throw maVar;
        } catch (IndexOutOfBoundsException unused) {
            C0773ma a2 = C0773ma.a();
            a2.a(t2);
            throw a2;
        }
    }

    protected static <E> C0770la<E> h() {
        return Ya.d();
    }

    public final /* synthetic */ Ma a() {
        a aVar = (a) a(e.e, (Object) null, (Object) null);
        aVar.a(this);
        return aVar;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    public final void a(int i) {
        this.zzjq = i;
    }

    public final void a(M m) throws IOException {
        Xa.a().a(getClass()).a(this, (Ob) O.a(m));
    }

    public final /* synthetic */ Ma c() {
        return (a) a(e.e, (Object) null, (Object) null);
    }

    public final int d() {
        if (this.zzjq == -1) {
            this.zzjq = Xa.a().a(this).b(this);
        }
        return this.zzjq;
    }

    /* access modifiers changed from: 0000 */
    public final int e() {
        return this.zzjq;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C0755ga) a(e.f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return Xa.a().a(this).a(this, (C0755ga) obj);
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        this.zzex = Xa.a().a(this).a(this);
        return this.zzex;
    }

    public final boolean i() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) a(e.a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = Xa.a().a(this).c(this);
        if (booleanValue) {
            a(e.b, (Object) c2 ? this : null, (Object) null);
        }
        return c2;
    }

    public final /* synthetic */ La j() {
        return (C0755ga) a(e.f, (Object) null, (Object) null);
    }

    public String toString() {
        return Oa.a(this, super.toString());
    }
}
