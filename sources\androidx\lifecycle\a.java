package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: ClassesInfoCache */
class a {
    static a a = new a();
    private final Map<Class, C0009a> b = new HashMap();
    private final Map<Class, Boolean> c = new HashMap();

    /* renamed from: androidx.lifecycle.a$a reason: collision with other inner class name */
    /* compiled from: ClassesInfoCache */
    static class C0009a {
        final Map<androidx.lifecycle.f.a, List<b>> a = new HashMap();
        final Map<b, androidx.lifecycle.f.a> b;

        C0009a(Map<b, androidx.lifecycle.f.a> map) {
            this.b = map;
            for (Entry entry : map.entrySet()) {
                androidx.lifecycle.f.a aVar = (androidx.lifecycle.f.a) entry.getValue();
                List list = (List) this.a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(h hVar, androidx.lifecycle.f.a aVar, Object obj) {
            a((List) this.a.get(aVar), hVar, aVar, obj);
            a((List) this.a.get(androidx.lifecycle.f.a.ON_ANY), hVar, aVar, obj);
        }

        private static void a(List<b> list, h hVar, androidx.lifecycle.f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(hVar, aVar, obj);
                }
            }
        }
    }

    /* compiled from: ClassesInfoCache */
    static class b {
        final int a;
        final Method b;

        b(int i, Method method) {
            this.a = i;
            this.b = method;
            this.b.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        public void a(h hVar, androidx.lifecycle.f.a aVar, Object obj) {
            try {
                int i = this.a;
                if (i == 0) {
                    this.b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.b.invoke(obj, new Object[]{hVar});
                } else if (i == 2) {
                    this.b.invoke(obj, new Object[]{hVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a || !this.b.getName().equals(bVar.b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }

    a() {
    }

    private Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    public C0009a a(Class cls) {
        C0009a aVar = (C0009a) this.b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, null);
    }

    /* access modifiers changed from: 0000 */
    public boolean b(Class cls) {
        if (this.c.containsKey(cls)) {
            return ((Boolean) this.c.get(cls)).booleanValue();
        }
        Method[] c2 = c(cls);
        for (Method annotation : c2) {
            if (((q) annotation.getAnnotation(q.class)) != null) {
                a(cls, c2);
                return true;
            }
        }
        this.c.put(cls, Boolean.valueOf(false));
        return false;
    }

    private void a(Map<b, androidx.lifecycle.f.a> map, b bVar, androidx.lifecycle.f.a aVar, Class cls) {
        androidx.lifecycle.f.a aVar2 = (androidx.lifecycle.f.a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.b;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous");
            sb.append(" value ");
            sb.append(aVar2);
            sb.append(", new value ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    private C0009a a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0009a a2 = a(superclass);
            if (a2 != null) {
                hashMap.putAll(a2.b);
            }
        }
        for (Class a3 : cls.getInterfaces()) {
            for (Entry entry : a(a3).b.entrySet()) {
                a(hashMap, (b) entry.getKey(), (androidx.lifecycle.f.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(h.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                androidx.lifecycle.f.a value = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(androidx.lifecycle.f.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == androidx.lifecycle.f.a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    a(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0009a aVar = new C0009a(hashMap);
        this.b.put(cls, aVar);
        this.c.put(cls, Boolean.valueOf(z));
        return aVar;
    }
}
