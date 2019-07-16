package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

@EVa(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001`B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010O\u001a\u00020%2\b\u0010P\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00132\u0006\u0010S\u001a\u00020TH\u0016J\u0012\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020XH\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0\u00132\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010Z\u001a\u00020XH\u0016J\u0012\u0010[\u001a\u00020%2\b\u0010\\\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010]\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020<H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R3\u0010\u001a\u001a$\u0012 \u0012\u001e \u001d*\u000e\u0018\u00010\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&R\u0014\u0010'\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001e\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0016R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0016R\u0016\u00108\u001a\u0004\u0018\u00018\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\"\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\n8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\rR\u0016\u0010A\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010>R\u0014\u0010C\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\bD\u00102R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\rR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\rR\u0016\u0010K\u001a\u0004\u0018\u00010L8VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006a"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", "", "()Z", "isCompanion", "isData", "isFinal", "isInner", "isOpen", "isSealed", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflect_api", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflect_api", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", "", "toString", "Data", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: I_a reason: default package */
/* compiled from: KClassImpl.kt */
public final class I_a<T> extends N_a implements C7472uZa<T>, M_a {
    private final b<a> d;
    private final Class<T> e;

    /* renamed from: I_a$a */
    /* compiled from: KClassImpl.kt */
    public final class a extends b {
        static final /* synthetic */ DZa[] d = {HYa.a((DYa) new EYa(HYa.a(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), HYa.a((DYa) new EYa(HYa.a(a.class), "annotations", "getAnnotations()Ljava/util/List;")), HYa.a((DYa) new EYa(HYa.a(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), HYa.a((DYa) new EYa(HYa.a(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), HYa.a((DYa) new EYa(HYa.a(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), HYa.a((DYa) new EYa(HYa.a(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), HYa.a((DYa) new EYa(HYa.a(a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), HYa.a((DYa) new EYa(HYa.a(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), HYa.a((DYa) new EYa(HYa.a(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), HYa.a((DYa) new EYa(HYa.a(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), HYa.a((DYa) new EYa(HYa.a(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), HYa.a((DYa) new EYa(HYa.a(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), HYa.a((DYa) new EYa(HYa.a(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), HYa.a((DYa) new EYa(HYa.a(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), HYa.a((DYa) new EYa(HYa.a(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), HYa.a((DYa) new EYa(HYa.a(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), HYa.a((DYa) new EYa(HYa.a(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), HYa.a((DYa) new EYa(HYa.a(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        private final defpackage.C5300Sab.a e = C5300Sab.b(new C7611w_a(this));
        private final defpackage.C5300Sab.a f = C5300Sab.b(new C7266r_a(this));
        private final defpackage.C5300Sab.a g = C5300Sab.b(new D_a(this));
        private final defpackage.C5300Sab.a h = C5300Sab.b(new B_a(this));
        private final defpackage.C5300Sab.a i = C5300Sab.b(new C7335s_a(this));
        private final defpackage.C5300Sab.a j = C5300Sab.b(new C7818z_a(this));
        private final b k = C5300Sab.a((PXa<T>) new A_a<T>(this));
        private final defpackage.C5300Sab.a l = C5300Sab.b(new H_a(this));
        private final defpackage.C5300Sab.a m = C5300Sab.b(new G_a(this));
        private final defpackage.C5300Sab.a n = C5300Sab.b(new C_a(this));
        private final defpackage.C5300Sab.a o = C5300Sab.b(new C7473u_a(this));
        private final defpackage.C5300Sab.a p = C5300Sab.b(new C7542v_a(this));
        private final defpackage.C5300Sab.a q = C5300Sab.b(new C7680x_a(this));
        private final defpackage.C5300Sab.a r = C5300Sab.b(new C7749y_a(this));
        private final defpackage.C5300Sab.a s = C5300Sab.b(new C7128p_a(this));
        private final defpackage.C5300Sab.a t = C5300Sab.b(new C7197q_a(this));
        private final defpackage.C5300Sab.a u = C5300Sab.b(new C7404t_a(this));
        private final defpackage.C5300Sab.a v = C5300Sab.b(new C7059o_a(this));

        public a() {
            super();
        }

        /* access modifiers changed from: private */
        public final Collection<C6922m_a<?>> k() {
            return (Collection) this.p.a(this, d[11]);
        }

        /* access modifiers changed from: private */
        public final Collection<C6922m_a<?>> l() {
            return (Collection) this.q.a(this, d[12]);
        }

        /* access modifiers changed from: private */
        public final Collection<C6922m_a<?>> m() {
            return (Collection) this.r.a(this, d[13]);
        }

        public final Collection<C6922m_a<?>> b() {
            return (Collection) this.v.a(this, d[17]);
        }

        public final Collection<C6922m_a<?>> c() {
            return (Collection) this.s.a(this, d[14]);
        }

        public final Collection<C6922m_a<?>> d() {
            return (Collection) this.t.a(this, d[15]);
        }

        public final Collection<C7679xZa<T>> e() {
            return (Collection) this.i.a(this, d[4]);
        }

        public final Collection<C6922m_a<?>> f() {
            return (Collection) this.u.a(this, d[16]);
        }

        public final Collection<C6922m_a<?>> g() {
            return (Collection) this.o.a(this, d[10]);
        }

        public final C5029Jcb h() {
            return (C5029Jcb) this.e.a(this, d[0]);
        }

        public final Collection<C7472uZa<?>> i() {
            return (Collection) this.j.a(this, d[5]);
        }

        public final String j() {
            return (String) this.h.a(this, d[3]);
        }

        /* access modifiers changed from: private */
        public final String a(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            String str = "$";
            String str2 = "name";
            if (enclosingMethod != null) {
                C7471uYa.a((Object) simpleName, str2);
                StringBuilder sb = new StringBuilder();
                sb.append(enclosingMethod.getName());
                sb.append(str);
                return Hxb.a(simpleName, sb.toString(), (String) null, 2, (Object) null);
            }
            Constructor enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                C7471uYa.a((Object) simpleName, str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(enclosingConstructor.getName());
                sb2.append(str);
                return Hxb.a(simpleName, sb2.toString(), (String) null, 2, (Object) null);
            }
            C7471uYa.a((Object) simpleName, str2);
            return Hxb.a(simpleName, '$', (String) null, 2, (Object) null);
        }
    }

    public I_a(Class<T> cls) {
        C7471uYa.b(cls, "jClass");
        this.e = cls;
        b<a> a2 = C5300Sab.a((PXa<T>) new K_a<T>(this));
        C7471uYa.a((Object) a2, "ReflectProperties.lazy { Data() }");
        this.d = a2;
    }

    public static final /* synthetic */ Void b(I_a i_a) {
        i_a.n();
        throw null;
    }

    /* access modifiers changed from: private */
    public final C7280rnb m() {
        return C5504Zab.b.a(a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    private final Void n() {
        defpackage.Rkb.a aVar;
        C7751ybb a2 = C7751ybb.a.a(a());
        if (a2 != null) {
            Rkb a3 = a2.a();
            if (a3 != null) {
                aVar = a3.c();
                if (aVar != null) {
                    switch (C5026J_a.a[aVar.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            StringBuilder sb = new StringBuilder();
                            sb.append("Packages and file facades are not yet supported in Kotlin reflection. ");
                            sb.append("Meanwhile please use Java reflection to inspect this class: ");
                            sb.append(a());
                            throw new UnsupportedOperationException(sb.toString());
                        case 4:
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection ");
                            sb2.append("library has no idea what declarations does it have. Please use Java reflection to inspect this class: ");
                            sb2.append(a());
                            throw new UnsupportedOperationException(sb2.toString());
                        case 5:
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Unknown class: ");
                            sb3.append(a());
                            sb3.append(" (kind = ");
                            sb3.append(aVar);
                            sb3.append(')');
                            throw new C5240Qab(sb3.toString());
                        case 6:
                            break;
                        default:
                            throw new FVa();
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unresolved class: ");
                sb4.append(a());
                throw new C5240Qab(sb4.toString());
            }
        }
        aVar = null;
        if (aVar != null) {
        }
        StringBuilder sb42 = new StringBuilder();
        sb42.append("Unresolved class: ");
        sb42.append(a());
        throw new C5240Qab(sb42.toString());
    }

    public Collection<C5242Qcb> d() {
        C5029Jcb b = b();
        if (b.g() == C5060Kcb.INTERFACE || b.g() == C5060Kcb.OBJECT) {
            return C6918mWa.a();
        }
        Collection<C5242Qcb> i = b.i();
        C7471uYa.a((Object) i, "descriptor.constructors");
        return i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof I_a) && C7471uYa.a((Object) MXa.b(this), (Object) MXa.b((C7472uZa) obj));
    }

    public final b<a> f() {
        return this.d;
    }

    public final Eqb g() {
        return b().z().ha();
    }

    public final Eqb h() {
        Eqb L = b().L();
        C7471uYa.a((Object) L, "descriptor.staticScope");
        return L;
    }

    public int hashCode() {
        return MXa.b(this).hashCode();
    }

    public Collection<C7679xZa<T>> i() {
        return ((a) this.d.a()).e();
    }

    public Collection<C7403tZa<?>> j() {
        return ((a) this.d.a()).b();
    }

    public Collection<C7472uZa<?>> k() {
        return ((a) this.d.a()).i();
    }

    public String l() {
        return ((a) this.d.a()).j();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        C7280rnb m = m();
        C7349snb d2 = m.d();
        C7471uYa.a((Object) d2, "classId.packageFqName");
        if (d2.b()) {
            str = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d2.a());
            sb2.append(".");
            str = sb2.toString();
        }
        String a2 = m.e().a();
        C7471uYa.a((Object) a2, "classId.relativeClassName.asString()");
        String a3 = Cxb.a(a2, '.', '$', false, 4, (Object) null);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(a3);
        sb.append(sb3.toString());
        return sb.toString();
    }

    public Class<T> a() {
        return this.e;
    }

    public Collection<C5582adb> a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        return C7676xWa.c(g().a(xnb, Ffb.FROM_REFLECTION), (Iterable) h().a(xnb, Ffb.FROM_REFLECTION));
    }

    public C5029Jcb b() {
        return ((a) this.d.a()).h();
    }

    public Collection<C7408tdb> b(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        return C7676xWa.c(g().c(xnb, Ffb.FROM_REFLECTION), (Iterable) h().c(xnb, Ffb.FROM_REFLECTION));
    }

    public C7408tdb a(int i) {
        if (C7471uYa.a((Object) a().getSimpleName(), (Object) "DefaultImpls")) {
            Class declaringClass = a().getDeclaringClass();
            if (declaringClass != null && declaringClass.isInterface()) {
                C7472uZa a2 = MXa.a(declaringClass);
                if (a2 != null) {
                    return ((I_a) a2).a(i);
                }
                throw new OVa("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            }
        }
        C5029Jcb b = b();
        C7408tdb tdb = null;
        if (!(b instanceof C6333dsb)) {
            b = null;
        }
        C6333dsb dsb = (C6333dsb) b;
        if (dsb != null) {
            C6458flb b2 = dsb.b();
            f<C6458flb, List<Olb>> fVar = Xmb.j;
            C7471uYa.a((Object) fVar, "JvmProtoBuf.classLocalVariable");
            Olb olb = (Olb) Hmb.a(b2, fVar, i);
            if (olb != null) {
                tdb = (C7408tdb) C6312dbb.a(a(), olb, dsb.a().e(), dsb.a().h(), dsb.c(), L_a.e);
            }
        }
        return tdb;
    }
}
