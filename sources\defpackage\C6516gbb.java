package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gbb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationConstructorCaller.kt */
final class C6516gbb extends C7540vYa implements _Xa<Object, Boolean> {
    final /* synthetic */ Class a;
    final /* synthetic */ List b;
    final /* synthetic */ Map c;

    C6516gbb(Class cls, List list, Map map) {
        this.a = cls;
        this.b = list;
        this.c = map;
        super(1);
    }

    public final boolean invoke(Object obj) {
        boolean z;
        boolean z2;
        Class cls = null;
        Annotation annotation = (Annotation) (!(obj instanceof Annotation) ? null : obj);
        if (annotation != null) {
            C7472uZa a2 = MXa.a(annotation);
            if (a2 != null) {
                cls = MXa.a(a2);
            }
        }
        if (C7471uYa.a((Object) cls, (Object) this.a)) {
            List list = this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Method method = (Method) it.next();
                    Object obj2 = this.c.get(method.getName());
                    Object invoke = method.invoke(obj, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(zArr, (boolean[]) invoke);
                            continue;
                        } else {
                            throw new OVa("null cannot be cast to non-null type kotlin.BooleanArray");
                        }
                    } else if (obj2 instanceof char[]) {
                        char[] cArr = (char[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(cArr, (char[]) invoke);
                            continue;
                        } else {
                            throw new OVa("null cannot be cast to non-null type kotlin.CharArray");
                        }
                    } else if (obj2 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(bArr, (byte[]) invoke);
                            continue;
                        } else {
                            throw new OVa("null cannot be cast to non-null type kotlin.ByteArray");
                        }
                    } else if (obj2 instanceof short[]) {
                        short[] sArr = (short[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(sArr, (short[]) invoke);
                            continue;
                        } else {
                            throw new OVa("null cannot be cast to non-null type kotlin.ShortArray");
                        }
                    } else if (obj2 instanceof int[]) {
                        int[] iArr = (int[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(iArr, (int[]) invoke);
                            continue;
                        } else {
                            throw new OVa("null cannot be cast to non-null type kotlin.IntArray");
                        }
                    } else if (obj2 instanceof float[]) {
                        float[] fArr = (float[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(fArr, (float[]) invoke);
                            continue;
                        } else {
                            throw new OVa("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                    } else if (obj2 instanceof long[]) {
                        long[] jArr = (long[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(jArr, (long[]) invoke);
                            continue;
                        } else {
                            throw new OVa("null cannot be cast to non-null type kotlin.LongArray");
                        }
                    } else if (obj2 instanceof double[]) {
                        double[] dArr = (double[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(dArr, (double[]) invoke);
                            continue;
                        } else {
                            throw new OVa("null cannot be cast to non-null type kotlin.DoubleArray");
                        }
                    } else if (obj2 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(objArr, (Object[]) invoke);
                            continue;
                        } else {
                            throw new OVa("null cannot be cast to non-null type kotlin.Array<*>");
                        }
                    } else {
                        z2 = C7471uYa.a(obj2, invoke);
                        continue;
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }
}
