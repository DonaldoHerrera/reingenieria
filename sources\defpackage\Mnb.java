package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: Mnb reason: default package */
/* compiled from: GeneratedMessageLite */
public abstract class Mnb extends Bnb implements Serializable {

    /* renamed from: Mnb$a */
    /* compiled from: GeneratedMessageLite */
    public static abstract class a<MessageType extends Mnb, BuilderType extends a> extends defpackage.Bnb.a<BuilderType> {
        private Fnb a = Fnb.a;

        protected a() {
        }

        public final BuilderType a(Fnb fnb) {
            this.a = fnb;
            return this;
        }

        public abstract BuilderType a(MessageType messagetype);

        public final Fnb b() {
            return this.a;
        }

        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    /* renamed from: Mnb$b */
    /* compiled from: GeneratedMessageLite */
    public static abstract class b<MessageType extends c<MessageType>, BuilderType extends b<MessageType, BuilderType>> extends a<MessageType, BuilderType> implements d<MessageType> {
        private Knb<e> b = Knb.a();
        private boolean c;

        protected b() {
        }

        /* access modifiers changed from: private */
        public Knb<e> c() {
            this.b.e();
            this.c = false;
            return this.b;
        }

        private void d() {
            if (!this.c) {
                this.b = this.b.clone();
                this.c = true;
            }
        }

        /* access modifiers changed from: protected */
        public final void a(MessageType messagetype) {
            d();
            this.b.a(messagetype.b);
        }
    }

    /* renamed from: Mnb$c */
    /* compiled from: GeneratedMessageLite */
    public static abstract class c<MessageType extends c<MessageType>> extends Mnb implements d<MessageType> {
        /* access modifiers changed from: private */
        public final Knb<e> b;

        /* renamed from: Mnb$c$a */
        /* compiled from: GeneratedMessageLite */
        protected class a {
            private final Iterator<Entry<e, Object>> a;
            private Entry<e, Object> b;
            private final boolean c;

            /* synthetic */ a(c cVar, boolean z, Lnb lnb) {
                this(z);
            }

            public void a(int i, Hnb hnb) throws IOException {
                while (true) {
                    Entry<e, Object> entry = this.b;
                    if (entry != null && ((e) entry.getKey()).i() < i) {
                        e eVar = (e) this.b.getKey();
                        if (!this.c || eVar.s() != defpackage.C7144pob.b.MESSAGE || eVar.p()) {
                            Knb.a((defpackage.Knb.a<?>) eVar, this.b.getValue(), hnb);
                        } else {
                            hnb.d(eVar.i(), (Wnb) this.b.getValue());
                        }
                        if (this.a.hasNext()) {
                            this.b = (Entry) this.a.next();
                        } else {
                            this.b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            private a(boolean z) {
                this.a = c.this.b.d();
                if (this.a.hasNext()) {
                    this.b = (Entry) this.a.next();
                }
                this.c = z;
            }
        }

        protected c() {
            this.b = Knb.f();
        }

        private void d(f<MessageType, ?> fVar) {
            if (fVar.a() != a()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> int b(f<MessageType, List<Type>> fVar) {
            d(fVar);
            return this.b.b(fVar.d);
        }

        public final <Type> boolean c(f<MessageType, Type> fVar) {
            d(fVar);
            return this.b.c(fVar.d);
        }

        /* access modifiers changed from: protected */
        public void g() {
            this.b.e();
        }

        /* access modifiers changed from: protected */
        public boolean h() {
            return this.b.c();
        }

        /* access modifiers changed from: protected */
        public int j() {
            return this.b.b();
        }

        /* access modifiers changed from: protected */
        public a k() {
            return new a<>(this, false, null);
        }

        public final <Type> Type a(f<MessageType, Type> fVar) {
            d(fVar);
            Object a2 = this.b.a(fVar.d);
            if (a2 == null) {
                return fVar.b;
            }
            return fVar.a(a2);
        }

        protected c(b<MessageType, ?> bVar) {
            this.b = bVar.c();
        }

        public final <Type> Type a(f<MessageType, List<Type>> fVar, int i) {
            d(fVar);
            return fVar.b(this.b.a(fVar.d, i));
        }

        /* access modifiers changed from: protected */
        public boolean a(Gnb gnb, Hnb hnb, Inb inb, int i) throws IOException {
            return Mnb.b(this.b, a(), gnb, hnb, inb, i);
        }
    }

    /* renamed from: Mnb$d */
    /* compiled from: GeneratedMessageLite */
    public interface d<MessageType extends c> extends Xnb {
    }

    /* renamed from: Mnb$e */
    /* compiled from: GeneratedMessageLite */
    static final class e implements defpackage.Knb.a<e> {
        final defpackage.Nnb.b<?> a;
        final int b;
        final defpackage.C7144pob.a c;
        final boolean d;
        final boolean e;

        e(defpackage.Nnb.b<?> bVar, int i, defpackage.C7144pob.a aVar, boolean z, boolean z2) {
            this.a = bVar;
            this.b = i;
            this.c = aVar;
            this.d = z;
            this.e = z2;
        }

        public defpackage.Nnb.b<?> a() {
            return this.a;
        }

        public int i() {
            return this.b;
        }

        public boolean p() {
            return this.d;
        }

        public defpackage.C7144pob.a q() {
            return this.c;
        }

        public defpackage.C7144pob.b s() {
            return this.c.a();
        }

        public boolean t() {
            return this.e;
        }

        public defpackage.Wnb.a a(defpackage.Wnb.a aVar, Wnb wnb) {
            return ((a) aVar).a((Mnb) wnb);
        }

        /* renamed from: a */
        public int compareTo(e eVar) {
            return this.b - eVar.b;
        }
    }

    /* renamed from: Mnb$f */
    /* compiled from: GeneratedMessageLite */
    public static class f<ContainingType extends Wnb, Type> {
        final ContainingType a;
        final Type b;
        final Wnb c;
        final e d;
        final Class e;
        final Method f;

        f(ContainingType containingtype, Type type, Wnb wnb, e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (eVar.q() == defpackage.C7144pob.a.MESSAGE && wnb == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.a = containingtype;
                this.b = type;
                this.c = wnb;
                this.d = eVar;
                this.e = cls;
                if (defpackage.Nnb.a.class.isAssignableFrom(cls)) {
                    this.f = Mnb.a(cls, "valueOf", Integer.TYPE);
                    return;
                }
                this.f = null;
            }
        }

        public ContainingType a() {
            return this.a;
        }

        public Wnb b() {
            return this.c;
        }

        public int c() {
            return this.d.i();
        }

        /* access modifiers changed from: 0000 */
        public Object a(Object obj) {
            if (!this.d.p()) {
                return b(obj);
            }
            if (this.d.s() != defpackage.C7144pob.b.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object b2 : (List) obj) {
                arrayList.add(b(b2));
            }
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        public Object b(Object obj) {
            if (this.d.s() != defpackage.C7144pob.b.ENUM) {
                return obj;
            }
            return Mnb.a(this.f, (Object) null, (Integer) obj);
        }

        /* access modifiers changed from: 0000 */
        public Object c(Object obj) {
            return this.d.s() == defpackage.C7144pob.b.ENUM ? Integer.valueOf(((defpackage.Nnb.a) obj).i()) : obj;
        }
    }

    protected Mnb() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    public static <MessageType extends Wnb> boolean b(Knb<e> knb, MessageType messagetype, Gnb gnb, Hnb hnb, Inb inb, int i) throws IOException {
        boolean z;
        boolean z2;
        Object obj;
        int b2 = C7144pob.b(i);
        f a2 = inb.a(messagetype, C7144pob.a(i));
        if (a2 != null) {
            if (b2 == Knb.a(a2.d.q(), false)) {
                z2 = false;
                z = false;
                if (z2) {
                    return gnb.a(i, hnb);
                }
                if (z) {
                    int d2 = gnb.d(gnb.o());
                    if (a2.d.q() == defpackage.C7144pob.a.ENUM) {
                        while (gnb.a() > 0) {
                            defpackage.Nnb.a a3 = a2.d.a().a(gnb.f());
                            if (a3 == null) {
                                return true;
                            }
                            knb.a(a2.d, a2.c(a3));
                        }
                    } else {
                        while (gnb.a() > 0) {
                            knb.a(a2.d, Knb.a(gnb, a2.d.q(), false));
                        }
                    }
                    gnb.c(d2);
                } else {
                    int i2 = Lnb.a[a2.d.s().ordinal()];
                    if (i2 == 1) {
                        defpackage.Wnb.a aVar = null;
                        if (!a2.d.p()) {
                            Wnb wnb = (Wnb) knb.a(a2.d);
                            if (wnb != null) {
                                aVar = wnb.b();
                            }
                        }
                        if (aVar == null) {
                            aVar = a2.b().d();
                        }
                        if (a2.d.q() == defpackage.C7144pob.a.GROUP) {
                            gnb.a(a2.c(), aVar, inb);
                        } else {
                            gnb.a(aVar, inb);
                        }
                        obj = aVar.build();
                    } else if (i2 != 2) {
                        obj = Knb.a(gnb, a2.d.q(), false);
                    } else {
                        int f2 = gnb.f();
                        Object a4 = a2.d.a().a(f2);
                        if (a4 == null) {
                            hnb.p(i);
                            hnb.s(f2);
                            return true;
                        }
                        obj = a4;
                    }
                    if (a2.d.p()) {
                        knb.a(a2.d, a2.c(obj));
                    } else {
                        knb.c(a2.d, a2.c(obj));
                    }
                }
                return true;
            }
            e eVar = a2.d;
            if (eVar.d && eVar.c.c() && b2 == Knb.a(a2.d.q(), true)) {
                z2 = false;
                z = true;
                if (z2) {
                }
            }
        }
        z2 = true;
        z = false;
        if (z2) {
        }
    }

    public Ynb<? extends Wnb> e() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    protected Mnb(a aVar) {
    }

    /* access modifiers changed from: protected */
    public boolean a(Gnb gnb, Hnb hnb, Inb inb, int i) throws IOException {
        return gnb.a(i, hnb);
    }

    public static <ContainingType extends Wnb, Type> f<ContainingType, Type> a(ContainingType containingtype, Type type, Wnb wnb, defpackage.Nnb.b<?> bVar, int i, defpackage.C7144pob.a aVar, Class cls) {
        e eVar = new e(bVar, i, aVar, false, false);
        f fVar = new f(containingtype, type, wnb, eVar, cls);
        return fVar;
    }

    public static <ContainingType extends Wnb, Type> f<ContainingType, Type> a(ContainingType containingtype, Wnb wnb, defpackage.Nnb.b<?> bVar, int i, defpackage.C7144pob.a aVar, boolean z, Class cls) {
        List emptyList = Collections.emptyList();
        e eVar = new e(bVar, i, aVar, true, z);
        f fVar = new f(containingtype, emptyList, wnb, eVar, cls);
        return fVar;
    }

    static Method a(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            String valueOf = String.valueOf(String.valueOf(cls.getName()));
            String valueOf2 = String.valueOf(String.valueOf(str));
            StringBuilder sb = new StringBuilder(valueOf.length() + 45 + valueOf2.length());
            sb.append("Generated message class \"");
            sb.append(valueOf);
            sb.append("\" missing method \"");
            sb.append(valueOf2);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e2);
        }
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
}
