package defpackage;

import java.lang.reflect.Field;

@EVa(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cR4\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0013*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00120\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", "T", "R", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "kotlin.jvm.PlatformType", "delegateField", "Lkotlin/Lazy;", "Ljava/lang/reflect/Field;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "get", "receiver", "(Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: qab reason: default package and case insensitive filesystem */
/* compiled from: KProperty1Impl.kt */
public class C7198qab<T, R> extends C7612wab<R> implements FZa<T, R> {
    private final b<a<T, R>> m;
    private final C7744yVa<Field> n = BVa.a(DVa.PUBLICATION, new C7336sab(this));

    /* renamed from: qab$a */
    /* compiled from: KProperty1Impl.kt */
    public static final class a<T, R> extends c<R> implements defpackage.FZa.a<T, R> {
        private final C7198qab<T, R> h;

        public a(C7198qab<T, ? extends R> qab) {
            C7471uYa.b(qab, "property");
            this.h = qab;
        }

        public R invoke(T t) {
            return e().get(t);
        }

        public C7198qab<T, R> e() {
            return this.h;
        }
    }

    public C7198qab(N_a n_a, String str, String str2, Object obj) {
        C7471uYa.b(n_a, "container");
        C7471uYa.b(str, "name");
        C7471uYa.b(str2, "signature");
        super(n_a, str, str2, obj);
        b<a<T, R>> a2 = C5300Sab.a((PXa<T>) new C7267rab<T>(this));
        C7471uYa.a((Object) a2, "ReflectProperties.lazy { Getter(this) }");
        this.m = a2;
    }

    public R get(T t) {
        return b().a(t);
    }

    public R invoke(T t) {
        return get(t);
    }

    public C7198qab(N_a n_a, C7408tdb tdb) {
        C7471uYa.b(n_a, "container");
        C7471uYa.b(tdb, "descriptor");
        super(n_a, tdb);
        b<a<T, R>> a2 = C5300Sab.a((PXa<T>) new C7267rab<T>(this));
        C7471uYa.a((Object) a2, "ReflectProperties.lazy { Getter(this) }");
        this.m = a2;
    }

    public a<T, R> b() {
        Object a2 = this.m.a();
        C7471uYa.a(a2, "_getter()");
        return (a) a2;
    }
}
