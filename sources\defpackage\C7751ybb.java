package defpackage;

@EVa(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\b\u0002\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;", "klass", "Ljava/lang/Class;", "classHeader", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;)V", "getClassHeader", "()Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "getKlass", "()Ljava/lang/Class;", "location", "", "getLocation", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "loadClassAnnotations", "", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "cachedContents", "", "toString", "visitMembers", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "Factory", "descriptors.runtime"}, mv = {1, 1, 15})
/* renamed from: ybb reason: default package and case insensitive filesystem */
/* compiled from: ReflectKotlinClass.kt */
public final class C7751ybb implements Dkb {
    public static final a a = new a(null);
    private final Class<?> b;
    private final Rkb c;

    /* renamed from: ybb$a */
    /* compiled from: ReflectKotlinClass.kt */
    public static final class a {
        private a() {
        }

        public final C7751ybb a(Class<?> cls) {
            C7471uYa.b(cls, "klass");
            Tkb tkb = new Tkb();
            C7544vbb.a.a(cls, (c) tkb);
            Rkb b = tkb.b();
            if (b != null) {
                return new C7751ybb(cls, b, null);
            }
            return null;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    private C7751ybb(Class<?> cls, Rkb rkb) {
        this.b = cls;
        this.c = rkb;
    }

    public C7280rnb D() {
        return Rvb.b(this.b);
    }

    public Rkb a() {
        return this.c;
    }

    public final Class<?> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7751ybb) && C7471uYa.a((Object) this.b, (Object) ((C7751ybb) obj).b);
    }

    public String getLocation() {
        StringBuilder sb = new StringBuilder();
        String name = this.b.getName();
        C7471uYa.a((Object) name, "klass.name");
        sb.append(Cxb.a(name, '.', '/', false, 4, (Object) null));
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C7751ybb.class.getName());
        sb.append(": ");
        sb.append(this.b);
        return sb.toString();
    }

    public /* synthetic */ C7751ybb(Class cls, Rkb rkb, C7264rYa rya) {
        this(cls, rkb);
    }

    public void a(c cVar, byte[] bArr) {
        C7471uYa.b(cVar, "visitor");
        C7544vbb.a.a(this.b, cVar);
    }

    public void a(d dVar, byte[] bArr) {
        C7471uYa.b(dVar, "visitor");
        C7544vbb.a.a(this.b, dVar);
    }
}
