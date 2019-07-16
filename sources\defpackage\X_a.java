package defpackage;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001aB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0012*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "R", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "Lkotlin/reflect/KMutableProperty0;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_setter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "kotlin.jvm.PlatformType", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "set", "", "value", "(Ljava/lang/Object;)V", "Setter", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: X_a reason: default package */
/* compiled from: KProperty0Impl.kt */
public final class X_a<R> extends C6991nab<R> implements C7817zZa<R> {
    private final b<a<R>> o;

    /* renamed from: X_a$a */
    /* compiled from: KProperty0Impl.kt */
    public static final class a<R> extends d<R> implements defpackage.C7817zZa.a<R> {
        private final X_a<R> h;

        public a(X_a<R> x_a) {
            C7471uYa.b(x_a, "property");
            this.h = x_a;
        }

        public X_a<R> e() {
            return this.h;
        }

        public void invoke(R r) {
            e().a(r);
        }
    }

    public X_a(N_a n_a, C7408tdb tdb) {
        C7471uYa.b(n_a, "container");
        C7471uYa.b(tdb, "descriptor");
        super(n_a, tdb);
        b<a<R>> a2 = C5300Sab.a((PXa<T>) new Y_a<T>(this));
        C7471uYa.a((Object) a2, "ReflectProperties.lazy { Setter(this) }");
        this.o = a2;
    }

    public void a(R r) {
        c().a(r);
    }

    public X_a(N_a n_a, String str, String str2, Object obj) {
        C7471uYa.b(n_a, "container");
        C7471uYa.b(str, "name");
        C7471uYa.b(str2, "signature");
        super(n_a, str, str2, obj);
        b<a<R>> a2 = C5300Sab.a((PXa<T>) new Y_a<T>(this));
        C7471uYa.a((Object) a2, "ReflectProperties.lazy { Setter(this) }");
        this.o = a2;
    }

    public a<R> c() {
        Object a2 = this.o.a();
        C7471uYa.a(a2, "_setter()");
        return (a) a2;
    }
}
