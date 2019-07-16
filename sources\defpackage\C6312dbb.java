package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: dbb reason: default package and case insensitive filesystem */
/* compiled from: util.kt */
public final class C6312dbb {
    private static final C7349snb a = new C7349snb("kotlin.jvm.JvmStatic");

    public static final C7349snb a() {
        return a;
    }

    public static final W_a b(Object obj) {
        W_a w_a = (W_a) (!(obj instanceof W_a) ? null : obj);
        if (w_a != null) {
            return w_a;
        }
        if (!(obj instanceof C7402tYa)) {
            obj = null;
        }
        C7402tYa tya = (C7402tYa) obj;
        C7403tZa e = tya != null ? tya.e() : null;
        if (!(e instanceof W_a)) {
            e = null;
        }
        return (W_a) e;
    }

    public static final C7612wab<?> c(Object obj) {
        C7612wab<?> wab = (C7612wab) (!(obj instanceof C7612wab) ? null : obj);
        if (wab != null) {
            return wab;
        }
        if (!(obj instanceof FYa)) {
            obj = null;
        }
        FYa fYa = (FYa) obj;
        C7403tZa e = fYa != null ? fYa.e() : null;
        if (!(e instanceof C7612wab)) {
            e = null;
        }
        return (C7612wab) e;
    }

    public static final Class<?> a(C5029Jcb jcb) {
        Class<?> cls;
        C7471uYa.b(jcb, "$this$toJavaClass");
        C7822zdb source = jcb.getSource();
        C7471uYa.a((Object) source, "source");
        if (source instanceof Fkb) {
            Dkb c = ((Fkb) source).c();
            if (c != null) {
                cls = ((C7751ybb) c).b();
            } else {
                throw new OVa("null cannot be cast to non-null type kotlin.reflect.jvm.internal.components.ReflectKotlinClass");
            }
        } else if (source instanceof a) {
            C6817kwb c2 = ((a) source).c();
            if (c2 != null) {
                cls = ((C6545gwb) c2).E();
            } else {
                throw new OVa("null cannot be cast to non-null type kotlin.reflect.jvm.internal.structure.ReflectJavaClass");
            }
        } else {
            C7280rnb a2 = C7148pqb.a((C5122Mcb) jcb);
            if (a2 == null) {
                return null;
            }
            cls = a(Rvb.e(jcb.getClass()), a2, 0);
        }
        return cls;
    }

    static /* synthetic */ Class a(ClassLoader classLoader, C7280rnb rnb, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return a(classLoader, rnb, i);
    }

    private static final Class<?> a(ClassLoader classLoader, C7280rnb rnb, int i) {
        C6721jcb jcb = C6721jcb.m;
        C7487unb g = rnb.a().g();
        C7471uYa.a((Object) g, "kotlinClassId.asSingleFqName().toUnsafe()");
        C7280rnb a2 = jcb.a(g);
        if (a2 != null) {
            rnb = a2;
        }
        String a3 = rnb.d().a();
        C7471uYa.a((Object) a3, "javaClassId.packageFqName.asString()");
        String a4 = rnb.e().a();
        C7471uYa.a((Object) a4, "javaClassId.relativeClassName.asString()");
        return a(classLoader, a3, a4, i);
    }

    private static final Class<?> a(ClassLoader classLoader, String str, String str2, int i) {
        if (C7471uYa.a((Object) str, (Object) "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(Cxb.a(str2, '.', '$', false, 4, (Object) null));
        String sb2 = sb.toString();
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            sb3.append(sb2);
            sb2 = sb3.toString();
        }
        return C7682xbb.a(classLoader, sb2);
    }

    public static final List<Annotation> a(C5651beb beb) {
        C7471uYa.b(beb, "$this$computeAnnotations");
        C6723jeb<C6315deb> annotations = beb.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (C6315deb deb : annotations) {
            C7822zdb source = deb.getSource();
            Annotation annotation = null;
            if (source instanceof C7475ubb) {
                annotation = ((C7475ubb) source).d();
            } else if (source instanceof a) {
                C6817kwb c = ((a) source).c();
                if (!(c instanceof Svb)) {
                    c = null;
                }
                Svb svb = (Svb) c;
                if (svb != null) {
                    annotation = svb.I();
                }
            } else {
                annotation = a(deb);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return arrayList;
    }

    private static final Annotation a(C6315deb deb) {
        C5029Jcb b = C7148pqb.b(deb);
        Class a2 = b != null ? a(b) : null;
        if (!(a2 instanceof Class)) {
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        Set<Entry> entrySet = deb.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Entry entry : entrySet) {
            C7694xnb xnb = (C7694xnb) entry.getKey();
            Npb npb = (Npb) entry.getValue();
            ClassLoader classLoader = a2.getClassLoader();
            C7471uYa.a((Object) classLoader, "annotationClass.classLoader");
            Object a3 = a(npb, classLoader);
            Object a4 = a3 != null ? NVa.a(xnb.a(), a3) : null;
            if (a4 != null) {
                arrayList.add(a4);
            }
        }
        return (Annotation) C6856lbb.a(a2, LWa.a((Iterable<? extends HVa<? extends K, ? extends V>>) arrayList), null, 4, null);
    }

    private static final Object a(Npb<?> npb, ClassLoader classLoader) {
        if (npb instanceof Hpb) {
            return a((C6315deb) ((Hpb) npb).a());
        }
        if (npb instanceof Ipb) {
            Iterable<Npb> iterable = (Iterable) ((Ipb) npb).a();
            ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
            for (Npb a2 : iterable) {
                arrayList.add(a(a2, classLoader));
            }
            Object[] array = arrayList.toArray(new Object[0]);
            if (array != null) {
                return array;
            }
            throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
        } else if (npb instanceof Spb) {
            HVa hVa = (HVa) ((Spb) npb).a();
            C7280rnb rnb = (C7280rnb) hVa.a();
            C7694xnb xnb = (C7694xnb) hVa.b();
            Class a3 = a(classLoader, rnb, 0, 4, null);
            if (a3 == null) {
                return null;
            }
            if (a3 != null) {
                return C5648bbb.a(a3, xnb.a());
            }
            throw new OVa("null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
        } else if (npb instanceof Ypb) {
            b bVar = (b) ((Ypb) npb).a();
            if (bVar instanceof C0159b) {
                C0159b bVar2 = (C0159b) bVar;
                return a(classLoader, bVar2.b(), bVar2.a());
            } else if (bVar instanceof a) {
                C5122Mcb c = ((a) bVar).a().za().c();
                if (!(c instanceof C5029Jcb)) {
                    c = null;
                }
                C5029Jcb jcb = (C5029Jcb) c;
                if (jcb != null) {
                    return a(jcb);
                }
                return null;
            } else {
                throw new FVa();
            }
        } else if (!(npb instanceof Tpb) && !(npb instanceof _pb)) {
            return npb.a();
        } else {
            return null;
        }
    }

    public static final C6922m_a<?> a(Object obj) {
        C6922m_a<?> m_a = (C6922m_a) (!(obj instanceof C6922m_a) ? null : obj);
        if (m_a == null) {
            m_a = b(obj);
        }
        return m_a != null ? m_a : c(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        if (r2 != null) goto L_0x009a;
     */
    public static final String a(C7751ybb ybb) {
        C7471uYa.b(ybb, "$this$packageModuleName");
        Rkb a2 = ybb.a();
        String str = null;
        if (!a2.d().d()) {
            return null;
        }
        int i = C5716cbb.a[a2.c().ordinal()];
        if (i == 1 || i == 2) {
            String[] a3 = a2.a();
            if (a3 != null) {
                String[] g = a2.g();
                if (g != null) {
                    HVa c = C6936mnb.c(a3, g);
                    C6800knb knb = (C6800knb) c.a();
                    Ilb ilb = (Ilb) c.b();
                    f<Ilb, Integer> fVar = Xmb.l;
                    C7471uYa.a((Object) fVar, "JvmProtoBuf.packageModuleName");
                    Integer num = (Integer) Hmb.a(ilb, fVar);
                    if (num != null) {
                        str = knb.getString(num.intValue());
                    }
                    str = "main";
                } else {
                    C7471uYa.a();
                    throw null;
                }
            } else {
                C7471uYa.a();
                throw null;
            }
        } else if (i == 3) {
            String str2 = (String) C7676xWa.g(a2.f());
            if (str2 == null) {
                return null;
            }
            a aVar = C7751ybb.a;
            Class loadClass = ybb.b().getClassLoader().loadClass(Cxb.a(str2, '/', '.', false, 4, (Object) null));
            C7471uYa.a((Object) loadClass, "klass.classLoader.loadCl…rtName.replace('/', '.'))");
            C7751ybb a4 = aVar.a(loadClass);
            if (a4 != null) {
                str = a(a4);
            }
        }
        return str;
    }

    public static final C7615wdb a(C4904Fcb fcb) {
        C7471uYa.b(fcb, "$this$instanceReceiverParameter");
        if (fcb.k() == null) {
            return null;
        }
        C5272Rcb e = fcb.e();
        if (e != null) {
            return ((C5029Jcb) e).O();
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    public static final <M extends Wnb, D extends C4904Fcb> D a(Class<?> cls, M m, Emb emb, Jmb jmb, Bmb bmb, C6308dYa<? super Crb, ? super M, ? extends D> dya) {
        List x;
        M m2 = m;
        C6308dYa<? super Crb, ? super M, ? extends D> dya2 = dya;
        Class<?> cls2 = cls;
        C7471uYa.b(cls, "moduleAnchor");
        C7471uYa.b(m, "proto");
        C7471uYa.b(emb, "nameResolver");
        C7471uYa.b(jmb, "typeTable");
        C7471uYa.b(bmb, "metadataVersion");
        C7471uYa.b(dya2, "createDescriptor");
        C4841Dbb a2 = C5270Rab.a(cls);
        if (m2 instanceof Blb) {
            x = ((Blb) m2).v();
        } else if (m2 instanceof Olb) {
            x = ((Olb) m2).x();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported message: ");
            sb.append(m);
            throw new IllegalStateException(sb.toString().toString());
        }
        List list = x;
        C6739jrb a3 = a2.a();
        C6450fdb b = a2.b();
        Mmb a4 = Mmb.b.a();
        C7471uYa.a((Object) list, "typeParameters");
        C6875lrb lrb = new C6875lrb(a3, emb, b, jmb, a4, bmb, null, null, list);
        return (C4904Fcb) dya2.invoke(new Crb(lrb), m);
    }
}
