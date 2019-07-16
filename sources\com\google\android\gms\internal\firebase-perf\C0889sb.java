package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb;
import com.google.android.gms.internal.firebase-perf.C0889sb.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-perf.sb reason: case insensitive filesystem */
public abstract class C0889sb<MessageType extends C0889sb<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends Ja<MessageType, BuilderType> {
    private static Map<Object, C0889sb<?, ?>> zzqn = new ConcurrentHashMap();
    protected Nc zzql = Nc.c();
    private int zzqm = -1;

    /* renamed from: com.google.android.gms.internal.firebase-perf.sb$a */
    public static class a<T extends C0889sb<T, ?>> extends Ka<T> {
        private final T b;

        public a(T t) {
            this.b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.sb$b */
    public static abstract class b<MessageType extends C0889sb<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends La<MessageType, BuilderType> {
        private final MessageType a;
        protected MessageType b;
        private boolean c = false;

        protected b(MessageType messagetype) {
            this.a = messagetype;
            this.b = (C0889sb) messagetype.a(c.d, (Object) null, (Object) null);
        }

        public final BuilderType a(MessageType messagetype) {
            h();
            a(this.b, messagetype);
            return this;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b bVar = (b) this.a.a(c.e, (Object) null, (Object) null);
            bVar.a((MessageType) (C0889sb) a());
            return bVar;
        }

        public final /* synthetic */ C0835ec e() {
            return this.a;
        }

        /* access modifiers changed from: protected */
        public final void h() {
            if (this.c) {
                MessageType messagetype = (C0889sb) this.b.a(c.d, (Object) null, (Object) null);
                a(messagetype, this.b);
                this.b = messagetype;
                this.c = false;
            }
        }

        /* renamed from: j */
        public MessageType a() {
            if (this.c) {
                return this.b;
            }
            MessageType messagetype = this.b;
            C0883qc.a().a(messagetype).d(messagetype);
            this.c = true;
            return this.b;
        }

        /* renamed from: k */
        public final MessageType b() {
            MessageType messagetype = (C0889sb) a();
            if (messagetype.i()) {
                return messagetype;
            }
            throw new Lc(messagetype);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            C0883qc.a().a(messagetype).b(messagetype, messagetype2);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ La a(Ja ja) {
            a((MessageType) (C0889sb) ja);
            return this;
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.firebase-perf.sb$c */
    public static final class c {
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

    /* renamed from: com.google.android.gms.internal.firebase-perf.sb$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends C0889sb<MessageType, BuilderType> implements C0843gc {
        protected C0870nb<Object> zzrg = C0870nb.f();
    }

    protected static C0913yb m() {
        return C0901vb.d();
    }

    protected static <E> Ab<E> n() {
        return C0879pc.d();
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    public final void a(int i) {
        this.zzqm = i;
    }

    public final /* synthetic */ C0835ec e() {
        return (C0889sb) a(c.f, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C0889sb) a(c.f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C0883qc.a().a(this).a(this, (C0889sb) obj);
    }

    public final /* synthetic */ C0826cc f() {
        b bVar = (b) a(c.e, (Object) null, (Object) null);
        bVar.a(this);
        return bVar;
    }

    public final int g() {
        if (this.zzqm == -1) {
            this.zzqm = C0883qc.a().a(this).b(this);
        }
        return this.zzqm;
    }

    public int hashCode() {
        int i = this.zzmo;
        if (i != 0) {
            return i;
        }
        this.zzmo = C0883qc.a().a(this).a(this);
        return this.zzmo;
    }

    public final boolean i() {
        return a((T) this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: 0000 */
    public final int j() {
        return this.zzqm;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends C0889sb<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType k() {
        return (b) a(c.e, (Object) null, (Object) null);
    }

    public final BuilderType l() {
        BuilderType buildertype = (b) a(c.e, (Object) null, (Object) null);
        buildertype.a(this);
        return buildertype;
    }

    public String toString() {
        return C0839fc.a(this, super.toString());
    }

    public final void a(C0838fb fbVar) throws IOException {
        C0883qc.a().a(this).a(this, (dd) C0846hb.a(fbVar));
    }

    static <T extends C0889sb<?, ?>> T a(Class<T> cls) {
        T t = (C0889sb) zzqn.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C0889sb) zzqn.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C0889sb) ((C0889sb) Qc.a(cls)).a(c.f, (Object) null, (Object) null);
            if (t != null) {
                zzqn.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends C0889sb<?, ?>> void a(Class<T> cls, T t) {
        zzqn.put(cls, t);
    }

    protected static Object a(C0835ec ecVar, String str, Object[] objArr) {
        return new C0890sc(ecVar, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends C0889sb<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(c.a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = C0883qc.a().a(t).c(t);
        if (z) {
            t.a(c.b, (Object) c2 ? t : null, (Object) null);
        }
        return c2;
    }

    protected static <E> Ab<E> a(Ab<E> ab) {
        int size = ab.size();
        return ab.i(size == 0 ? 10 : size << 1);
    }
}
