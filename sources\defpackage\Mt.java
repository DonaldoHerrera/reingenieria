package defpackage;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* renamed from: Mt reason: default package */
public final class Mt {
    private static final Map<Class<?>, Mt> a = new WeakHashMap();
    private static final Map<Class<?>, Mt> b = new WeakHashMap();
    private final Class<?> c;
    private final boolean d;
    private final IdentityHashMap<String, Ut> e = new IdentityHashMap<>();
    final List<String> f;

    private Mt(Class<?> cls, boolean z) {
        Field[] declaredFields;
        Field field;
        this.c = cls;
        this.d = z;
        boolean z2 = !z || !cls.isEnum();
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(valueOf);
        String sb2 = sb.toString();
        if (z2) {
            TreeSet treeSet = new TreeSet(new Lt(this));
            for (Field field2 : cls.getDeclaredFields()) {
                Ut a2 = Ut.a(field2);
                if (a2 != null) {
                    String b2 = a2.b();
                    if (z) {
                        b2 = b2.toLowerCase(Locale.US).intern();
                    }
                    Ut ut = (Ut) this.e.get(b2);
                    boolean z3 = ut == null;
                    Object[] objArr = new Object[4];
                    objArr[0] = z ? "case-insensitive " : "";
                    objArr[1] = b2;
                    objArr[2] = field2;
                    if (ut == null) {
                        field = null;
                    } else {
                        field = ut.d();
                    }
                    objArr[3] = field;
                    if (z3) {
                        this.e.put(b2, a2);
                        treeSet.add(b2);
                    } else {
                        throw new IllegalArgumentException(Uu.a("two fields have the same %sname <%s>: %s and %s", objArr));
                    }
                }
            }
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                Mt a3 = a(superclass, z);
                treeSet.addAll(a3.f);
                for (Entry entry : a3.e.entrySet()) {
                    String str = (String) entry.getKey();
                    if (!this.e.containsKey(str)) {
                        this.e.put(str, (Ut) entry.getValue());
                    }
                }
            }
            this.f = treeSet.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(treeSet));
            return;
        }
        throw new IllegalArgumentException(String.valueOf(sb2));
    }

    public static Mt a(Class<?> cls) {
        return a(cls, false);
    }

    public final boolean b() {
        return this.d;
    }

    public final Collection<Ut> c() {
        return Collections.unmodifiableCollection(this.e.values());
    }

    public static Mt a(Class<?> cls, boolean z) {
        Mt mt;
        if (cls == null) {
            return null;
        }
        Map<Class<?>, Mt> map = z ? b : a;
        synchronized (map) {
            mt = (Mt) map.get(cls);
            if (mt == null) {
                mt = new Mt(cls, z);
                map.put(cls, mt);
            }
        }
        return mt;
    }

    public final Ut a(String str) {
        if (str != null) {
            if (this.d) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return (Ut) this.e.get(str);
    }

    public final boolean a() {
        return this.c.isEnum();
    }
}
