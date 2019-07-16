package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: W_a reason: default package */
/* compiled from: KFunctionImpl.kt */
public final class W_a extends C6922m_a<Object> implements C7333sYa<Object>, C7679xZa<Object>, YZa {
    static final /* synthetic */ DZa[] e = {HYa.a((DYa) new EYa(HYa.a(W_a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), HYa.a((DYa) new EYa(HYa.a(W_a.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), HYa.a((DYa) new EYa(HYa.a(W_a.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    private final a f;
    private final b g;
    private final b h;
    private final N_a i;
    /* access modifiers changed from: private */
    public final String j;
    private final Object k;

    /* synthetic */ W_a(N_a n_a, String str, String str2, C5582adb adb, Object obj, int i2, C7264rYa rya) {
        if ((i2 & 16) != 0) {
            obj = C6988nYa.a;
        }
        this(n_a, str, str2, adb, obj);
    }

    private final Object m() {
        return C7268rbb.a(this.k, (C4935Gcb) i());
    }

    public Object d() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        W_a b = C6312dbb.b(obj);
        if (b == null || !C7471uYa.a((Object) g(), (Object) b.g()) || !C7471uYa.a((Object) getName(), (Object) b.getName()) || !C7471uYa.a((Object) this.j, (Object) b.j) || !C7471uYa.a(this.k, b.k)) {
            return false;
        }
        return true;
    }

    public C6992nbb<?> f() {
        return (C6992nbb) this.g.a(this, e[1]);
    }

    public N_a g() {
        return this.i;
    }

    public int getArity() {
        return C7130pbb.a(f());
    }

    public String getName() {
        String a = i().getName().a();
        C7471uYa.a((Object) a, "descriptor.name.asString()");
        return a;
    }

    public C6992nbb<?> h() {
        return (C6992nbb) this.h.a(this, e[2]);
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + getName().hashCode()) * 31) + this.j.hashCode();
    }

    public C5582adb i() {
        return (C5582adb) this.f.a(this, e[0]);
    }

    public Object invoke(Object obj) {
        return a.a(this, obj);
    }

    public boolean k() {
        return !C7471uYa.a(this.k, C6988nYa.a);
    }

    public String toString() {
        return C5475Yab.b.a(i());
    }

    private W_a(N_a n_a, String str, String str2, C5582adb adb, Object obj) {
        this.i = n_a;
        this.j = str2;
        this.k = obj;
        this.f = C5300Sab.a(adb, new V_a(this, str));
        this.g = C5300Sab.a((PXa<T>) new T_a<T>(this));
        this.h = C5300Sab.a((PXa<T>) new U_a<T>(this));
    }

    /* access modifiers changed from: private */
    public final h b(Method method) {
        return k() ? new b(method) : new e(method);
    }

    /* access modifiers changed from: private */
    public final h c(Method method) {
        return k() ? new c(method, m()) : new f(method);
    }

    public Object invoke(Object obj, Object obj2) {
        return a.a(this, obj, obj2);
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        return a.a(this, obj, obj2, obj3);
    }

    /* access modifiers changed from: private */
    public final h a(Method method) {
        return k() ? new a(method, m()) : new d(method);
    }

    public W_a(N_a n_a, String str, String str2, Object obj) {
        C7471uYa.b(n_a, "container");
        C7471uYa.b(str, "name");
        C7471uYa.b(str2, "signature");
        this(n_a, str, str2, null, obj);
    }

    /* access modifiers changed from: private */
    public final C7061obb<Constructor<?>> a(Constructor<?> constructor, C5582adb adb) {
        if (C7217qqb.a((C4935Gcb) adb)) {
            if (k()) {
                return new a(constructor, m());
            }
            return new b(constructor);
        } else if (k()) {
            return new c(constructor, m());
        } else {
            return new e(constructor);
        }
    }

    public W_a(N_a n_a, C5582adb adb) {
        C7471uYa.b(n_a, "container");
        C7471uYa.b(adb, "descriptor");
        String a = adb.getName().a();
        C7471uYa.a((Object) a, "descriptor.name.asString()");
        this(n_a, a, C5504Zab.b.a(adb).a(), adb, null, 16, null);
    }
}
