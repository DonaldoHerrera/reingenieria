package defpackage;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\r\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0012*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0014X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "R", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "kotlin.jvm.PlatformType", "delegateFieldValue", "Lkotlin/Lazy;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "get", "()Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: nab reason: default package and case insensitive filesystem */
/* compiled from: KProperty0Impl.kt */
public class C6991nab<R> extends C7612wab<R> implements EZa<R> {
    private final b<a<R>> m;
    private final C7744yVa<Object> n = BVa.a(DVa.PUBLICATION, new C7129pab(this));

    /* renamed from: nab$a */
    /* compiled from: KProperty0Impl.kt */
    public static final class a<R> extends c<R> implements defpackage.EZa.a<R> {
        private final C6991nab<R> h;

        public a(C6991nab<? extends R> nab) {
            C7471uYa.b(nab, "property");
            this.h = nab;
        }

        public R d() {
            return e().get();
        }

        public C6991nab<R> e() {
            return this.h;
        }
    }

    public C6991nab(N_a n_a, C7408tdb tdb) {
        C7471uYa.b(n_a, "container");
        C7471uYa.b(tdb, "descriptor");
        super(n_a, tdb);
        b<a<R>> a2 = C5300Sab.a((PXa<T>) new C7060oab<T>(this));
        C7471uYa.a((Object) a2, "ReflectProperties.lazy { Getter(this) }");
        this.m = a2;
    }

    public R d() {
        return get();
    }

    public R get() {
        return b().a(new Object[0]);
    }

    public C6991nab(N_a n_a, String str, String str2, Object obj) {
        C7471uYa.b(n_a, "container");
        C7471uYa.b(str, "name");
        C7471uYa.b(str2, "signature");
        super(n_a, str, str2, obj);
        b<a<R>> a2 = C5300Sab.a((PXa<T>) new C7060oab<T>(this));
        C7471uYa.a((Object) a2, "ReflectProperties.lazy { Getter(this) }");
        this.m = a2;
    }

    public a<R> b() {
        Object a2 = this.m.a();
        C7471uYa.a(a2, "_getter()");
        return (a) a2;
    }
}
