package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb;
import com.google.android.gms.internal.measurement.Gb.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Gb<MessageType extends Gb<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends Oa<MessageType, BuilderType> {
    private static Map<Object, Gb<?, ?>> zzaib = new ConcurrentHashMap();
    protected _c zzahz = _c.c();
    private int zzaia = -1;

    public static abstract class a<MessageType extends Gb<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends Qa<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;
        private boolean c = false;

        protected a(MessageType messagetype) {
            this.a = messagetype;
            this.b = (Gb) messagetype.a(d.d, (Object) null, (Object) null);
        }

        private final BuilderType b(byte[] bArr, int i, int i2, C1042tb tbVar) throws Rb {
            g();
            try {
                Ac.a().a(this.b).a(this.b, bArr, 0, i2 + 0, new Ta(tbVar));
                return this;
            } catch (Rb e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw Rb.a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        public final BuilderType a(MessageType messagetype) {
            g();
            a(this.b, messagetype);
            return this;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            a aVar = (a) this.a.a(d.e, (Object) null, (Object) null);
            aVar.a((MessageType) (Gb) v());
            return aVar;
        }

        /* access modifiers changed from: protected */
        public final void g() {
            if (this.c) {
                MessageType messagetype = (Gb) this.b.a(d.d, (Object) null, (Object) null);
                a(messagetype, this.b);
                this.b = messagetype;
                this.c = false;
            }
        }

        /* renamed from: h */
        public MessageType v() {
            if (this.c) {
                return this.b;
            }
            this.b.j();
            this.c = true;
            return this.b;
        }

        /* renamed from: j */
        public final MessageType w() {
            MessageType messagetype = (Gb) v();
            if (messagetype.i()) {
                return messagetype;
            }
            throw new Yc(messagetype);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            Ac.a().a(messagetype).b(messagetype, messagetype2);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Qa a(Oa oa) {
            a((MessageType) (Gb) oa);
            return this;
        }

        public final /* synthetic */ Qa a(byte[] bArr, int i, int i2, C1042tb tbVar) throws Rb {
            b(bArr, 0, i2, tbVar);
            return this;
        }

        public final /* synthetic */ C1026qc a() {
            return this.a;
        }
    }

    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends Gb<MessageType, BuilderType> implements C1037sc {
        protected C1060wb<Object> zzaic = C1060wb.f();

        /* access modifiers changed from: 0000 */
        public final C1060wb<Object> p() {
            if (this.zzaic.b()) {
                this.zzaic = (C1060wb) this.zzaic.clone();
            }
            return this.zzaic;
        }
    }

    public static class c<T extends Gb<T, ?>> extends Pa<T> {
        private final T b;

        public c(T t) {
            this.b = t;
        }

        public final /* synthetic */ Object a(C0989kb kbVar, C1042tb tbVar) throws Rb {
            return Gb.a(this.b, kbVar, tbVar);
        }
    }

    /* 'enum' access flag removed */
    public static final class d {
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

    public static class e<ContainingType extends C1026qc, Type> extends C1036sb<ContainingType, Type> {
    }

    protected static Mb m() {
        return Jb.d();
    }

    protected static Pb n() {
        return C0950ec.d();
    }

    protected static <E> Ob<E> o() {
        return Dc.d();
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    public final void a(int i) {
        this.zzaia = i;
    }

    public final /* synthetic */ C1020pc b() {
        return (a) a(d.e, (Object) null, (Object) null);
    }

    public final int d() {
        if (this.zzaia == -1) {
            this.zzaia = Ac.a().a(this).c(this);
        }
        return this.zzaia;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((Gb) a(d.f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return Ac.a().a(this).a(this, (Gb) obj);
    }

    public final /* synthetic */ C1020pc f() {
        a aVar = (a) a(d.e, (Object) null, (Object) null);
        aVar.a(this);
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    public final int h() {
        return this.zzaia;
    }

    public int hashCode() {
        int i = this.zzact;
        if (i != 0) {
            return i;
        }
        this.zzact = Ac.a().a(this).a(this);
        return this.zzact;
    }

    public final boolean i() {
        return a((T) this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: protected */
    public final void j() {
        Ac.a().a(this).b(this);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends Gb<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType k() {
        return (a) a(d.e, (Object) null, (Object) null);
    }

    public final BuilderType l() {
        BuilderType buildertype = (a) a(d.e, (Object) null, (Object) null);
        buildertype.a(this);
        return buildertype;
    }

    public String toString() {
        return C1031rc.a(this, super.toString());
    }

    public final void a(C1007nb nbVar) throws IOException {
        Ac.a().a(getClass()).a(this, (C1050ud) C1025qb.a(nbVar));
    }

    static <T extends Gb<?, ?>> T a(Class<T> cls) {
        T t = (Gb) zzaib.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (Gb) zzaib.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (Gb) ((Gb) C0937cd.a(cls)).a(d.f, (Object) null, (Object) null);
            if (t != null) {
                zzaib.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends Gb<?, ?>> void a(Class<T> cls, T t) {
        zzaib.put(cls, t);
    }

    protected static Object a(C1026qc qcVar, String str, Object[] objArr) {
        return new Cc(qcVar, str, objArr);
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

    protected static final <T extends Gb<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(d.a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = Ac.a().a(t).d(t);
        if (z) {
            t.a(d.b, (Object) d2 ? t : null, (Object) null);
        }
        return d2;
    }

    protected static Pb a(Pb pb) {
        int size = pb.size();
        return pb.e(size == 0 ? 10 : size << 1);
    }

    protected static <E> Ob<E> a(Ob<E> ob) {
        int size = ob.size();
        return ob.d(size == 0 ? 10 : size << 1);
    }

    static <T extends Gb<T, ?>> T a(T t, C0989kb kbVar, C1042tb tbVar) throws Rb {
        T t2 = (Gb) t.a(d.d, (Object) null, (Object) null);
        try {
            Ac.a().a(t2).a(t2, C0995lb.a(kbVar), tbVar);
            t2.j();
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof Rb) {
                throw ((Rb) e2.getCause());
            }
            Rb rb = new Rb(e2.getMessage());
            rb.a(t2);
            throw rb;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof Rb) {
                throw ((Rb) e3.getCause());
            }
            throw e3;
        }
    }

    private static <T extends Gb<T, ?>> T a(T t, byte[] bArr, int i, int i2, C1042tb tbVar) throws Rb {
        T t2 = (Gb) t.a(d.d, (Object) null, (Object) null);
        try {
            Ac.a().a(t2).a(t2, bArr, 0, i2, new Ta(tbVar));
            t2.j();
            if (t2.zzact == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof Rb) {
                throw ((Rb) e2.getCause());
            }
            Rb rb = new Rb(e2.getMessage());
            rb.a(t2);
            throw rb;
        } catch (IndexOutOfBoundsException unused) {
            Rb a2 = Rb.a();
            a2.a(t2);
            throw a2;
        }
    }

    protected static <T extends Gb<T, ?>> T a(T t, byte[] bArr, C1042tb tbVar) throws Rb {
        T a2 = a(t, bArr, 0, bArr.length, tbVar);
        if (a2 == null || a2.i()) {
            return a2;
        }
        Rb rb = new Rb(new Yc(a2).getMessage());
        rb.a(a2);
        throw rb;
    }

    public final /* synthetic */ C1026qc a() {
        return (Gb) a(d.f, (Object) null, (Object) null);
    }
}
