package dagger.android;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: DispatchingAndroidInjector */
public final class c<T> implements b<T> {
    private final Map<String, C7054oVa<dagger.android.b.a<?>>> a;

    /* compiled from: DispatchingAndroidInjector */
    public static final class a extends RuntimeException {
        a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    c(Map<Class<?>, C7054oVa<dagger.android.b.a<?>>> map, Map<String, C7054oVa<dagger.android.b.a<?>>> map2) {
        this.a = a(map, map2);
    }

    private static <C, V> Map<String, C7054oVa<dagger.android.b.a<?>>> a(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap b = C4868EMa.b(map.size() + map2.size());
        b.putAll(map2);
        for (Entry entry : map.entrySet()) {
            b.put(((Class) entry.getKey()).getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(b);
    }

    private String c(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        if (arrayList.isEmpty()) {
            return String.format("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
        }
        return String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
    }

    @CanIgnoreReturnValue
    public boolean b(T t) {
        C7054oVa ova = (C7054oVa) this.a.get(t.getClass().getName());
        if (ova == null) {
            return false;
        }
        dagger.android.b.a aVar = (dagger.android.b.a) ova.get();
        try {
            b a2 = aVar.a(t);
            C5023JMa.a(a2, "%s.create(I) should not return null.", aVar.getClass());
            a2.a(t);
            return true;
        } catch (ClassCastException e) {
            throw new a(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[]{aVar.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
        }
    }

    public void a(T t) {
        if (!b(t)) {
            throw new IllegalArgumentException(c(t));
        }
    }
}
