package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: nYa reason: default package and case insensitive filesystem */
/* compiled from: CallableReference */
public abstract class C6988nYa implements C7403tZa, Serializable {
    public static final Object a = a.a;
    private transient C7403tZa b;
    protected final Object c;

    /* renamed from: nYa$a */
    /* compiled from: CallableReference */
    private static class a implements Serializable {
        /* access modifiers changed from: private */
        public static final a a = new a();

        private a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return a;
        }
    }

    public C6988nYa() {
        this(a);
    }

    public HZa a() {
        return i().a();
    }

    public C7403tZa e() {
        C7403tZa tza = this.b;
        if (tza != null) {
            return tza;
        }
        C7403tZa f = f();
        this.b = f;
        return f;
    }

    /* access modifiers changed from: protected */
    public abstract C7403tZa f();

    public Object g() {
        return this.c;
    }

    public List<Annotation> getAnnotations() {
        return i().getAnnotations();
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public List<CZa> getParameters() {
        return i().getParameters();
    }

    public C7610wZa h() {
        throw new AbstractMethodError();
    }

    /* access modifiers changed from: protected */
    public C7403tZa i() {
        C7403tZa e = e();
        if (e != this) {
            return e;
        }
        throw new OXa();
    }

    public String j() {
        throw new AbstractMethodError();
    }

    protected C6988nYa(Object obj) {
        this.c = obj;
    }

    public Object a(Map map) {
        return i().a(map);
    }
}
