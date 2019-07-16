package defpackage;

@EVa(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001cB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bR4\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0013*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00120\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "T", "R", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lkotlin/reflect/KMutableProperty1;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_setter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "kotlin.jvm.PlatformType", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "set", "", "receiver", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Setter", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: Z_a reason: default package */
/* compiled from: KProperty1Impl.kt */
public final class Z_a<T, R> extends C7198qab<T, R> implements AZa<T, R> {
    private final b<a<T, R>> o;

    /* renamed from: Z_a$a */
    /* compiled from: KProperty1Impl.kt */
    public static final class a<T, R> extends d<R> implements defpackage.AZa.a<T, R> {
        private final Z_a<T, R> h;

        public a(Z_a<T, R> z_a) {
            C7471uYa.b(z_a, "property");
            this.h = z_a;
        }

        public Z_a<T, R> e() {
            return this.h;
        }

        public void invoke(T t, R r) {
            e().a(t, r);
        }
    }

    public Z_a(N_a n_a, String str, String str2, Object obj) {
        C7471uYa.b(n_a, "container");
        C7471uYa.b(str, "name");
        C7471uYa.b(str2, "signature");
        super(n_a, str, str2, obj);
        b<a<T, R>> a2 = C5300Sab.a((PXa<T>) new __a<T>(this));
        C7471uYa.a((Object) a2, "ReflectProperties.lazy { Setter(this) }");
        this.o = a2;
    }

    public void a(T t, R r) {
        c().a(t, r);
    }

    public Z_a(N_a n_a, C7408tdb tdb) {
        C7471uYa.b(n_a, "container");
        C7471uYa.b(tdb, "descriptor");
        super(n_a, tdb);
        b<a<T, R>> a2 = C5300Sab.a((PXa<T>) new __a<T>(this));
        C7471uYa.a((Object) a2, "ReflectProperties.lazy { Setter(this) }");
        this.o = a2;
    }

    public a<T, R> c() {
        Object a2 = this.o.a();
        C7471uYa.a(a2, "_setter()");
        return (a) a2;
    }
}
