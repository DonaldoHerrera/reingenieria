package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "()V", "asString", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: c_a reason: default package and case insensitive filesystem */
/* compiled from: RuntimeTypeMapper.kt */
public abstract class C5714c_a {

    /* renamed from: c_a$a */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class a extends C5714c_a {
        private final Field a;

        public a(Field field) {
            C7471uYa.b(field, "field");
            super(null);
            this.a = field;
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append(C6589hgb.a(this.a.getName()));
            sb.append("()");
            Class type = this.a.getType();
            C7471uYa.a((Object) type, "field.type");
            sb.append(Rvb.c(type));
            return sb.toString();
        }

        public final Field b() {
            return this.a;
        }
    }

    /* renamed from: c_a$b */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class b extends C5714c_a {
        private final Method a;
        private final Method b;

        public b(Method method, Method method2) {
            C7471uYa.b(method, "getterMethod");
            super(null);
            this.a = method;
            this.b = method2;
        }

        public String a() {
            return C5580abb.b(this.a);
        }

        public final Method b() {
            return this.a;
        }

        public final Method c() {
            return this.b;
        }
    }

    /* renamed from: c_a$c */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class c extends C5714c_a {
        private final String a;
        private final C7408tdb b;
        private final Olb c;
        private final e d;
        private final Emb e;
        private final Jmb f;

        public c(C7408tdb tdb, Olb olb, e eVar, Emb emb, Jmb jmb) {
            String str;
            C7471uYa.b(tdb, "descriptor");
            C7471uYa.b(olb, "proto");
            C7471uYa.b(eVar, "signature");
            C7471uYa.b(emb, "nameResolver");
            C7471uYa.b(jmb, "typeTable");
            super(null);
            this.b = tdb;
            this.c = olb;
            this.d = eVar;
            this.e = emb;
            this.f = jmb;
            if (this.d.o()) {
                StringBuilder sb = new StringBuilder();
                Emb emb2 = this.e;
                defpackage.Xmb.c k = this.d.k();
                String str2 = "signature.getter";
                C7471uYa.a((Object) k, str2);
                sb.append(emb2.getString(k.k()));
                Emb emb3 = this.e;
                defpackage.Xmb.c k2 = this.d.k();
                C7471uYa.a((Object) k2, str2);
                sb.append(emb3.getString(k2.j()));
                str = sb.toString();
            } else {
                defpackage.C6664inb.a a2 = C6936mnb.a(C6936mnb.b, this.c, this.e, this.f, false, 8, null);
                if (a2 != null) {
                    String d2 = a2.d();
                    String e2 = a2.e();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C6589hgb.a(d2));
                    sb2.append(g());
                    sb2.append("()");
                    sb2.append(e2);
                    str = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No field signature for property: ");
                    sb3.append(this.b);
                    throw new C5240Qab(sb3.toString());
                }
            }
            this.a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
            if (r0 != null) goto L_0x0043;
         */
        private final String g() {
            String str;
            C5272Rcb e2 = this.b.e();
            C7471uYa.a((Object) e2, "descriptor.containingDeclaration");
            String str2 = "$";
            if (!C7471uYa.a((Object) this.b.d(), (Object) _db.d) || !(e2 instanceof C6333dsb)) {
                if (C7471uYa.a((Object) this.b.d(), (Object) _db.a) && (e2 instanceof C6790kdb)) {
                    C7408tdb tdb = this.b;
                    if (tdb != null) {
                        C7014nsb la = ((C7842zsb) tdb).la();
                        if (la instanceof C7691xkb) {
                            C7691xkb xkb = (C7691xkb) la;
                            if (xkb.e() != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append(xkb.g().a());
                                return sb.toString();
                            }
                        }
                    } else {
                        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                    }
                }
                return "";
            }
            C6458flb b2 = ((C6333dsb) e2).b();
            f<C6458flb, Integer> fVar = Xmb.i;
            C7471uYa.a((Object) fVar, "JvmProtoBuf.classModuleName");
            Integer num = (Integer) Hmb.a(b2, fVar);
            if (num != null) {
                str = this.e.getString(num.intValue());
            }
            str = "main";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(C7763ynb.a(str));
            return sb2.toString();
        }

        public String a() {
            return this.a;
        }

        public final C7408tdb b() {
            return this.b;
        }

        public final Emb c() {
            return this.e;
        }

        public final Olb d() {
            return this.c;
        }

        public final e e() {
            return this.d;
        }

        public final Jmb f() {
            return this.f;
        }
    }

    /* renamed from: c_a$d */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class d extends C5714c_a {
        private final e a;
        private final e b;

        public d(e eVar, e eVar2) {
            C7471uYa.b(eVar, "getterSignature");
            super(null);
            this.a = eVar;
            this.b = eVar2;
        }

        public String a() {
            return this.a.a();
        }

        public final e b() {
            return this.a;
        }

        public final e c() {
            return this.b;
        }
    }

    private C5714c_a() {
    }

    public abstract String a();

    public /* synthetic */ C5714c_a(C7264rYa rya) {
        this();
    }
}
