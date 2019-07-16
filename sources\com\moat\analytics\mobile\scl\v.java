package com.moat.analytics.mobile.scl;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

class v<T> implements InvocationHandler {
    /* access modifiers changed from: private */
    public static final Object[] a = new Object[0];
    private final a<T> b;
    private final c<T> c;
    private final LinkedList<b> d = new LinkedList<>();
    private final LinkedList<b> e = new LinkedList<>();
    private boolean f;
    private T g;

    interface a<T> {
        com.moat.analytics.mobile.scl.a.b.a<T> a();
    }

    private class b {
        /* access modifiers changed from: private */
        public final WeakReference[] b;
        private final LinkedList<Object> c;
        /* access modifiers changed from: private */
        public final Method d;

        private b(Method method, Object... objArr) {
            this.c = new LinkedList<>();
            if (objArr == null) {
                objArr = v.a;
            }
            WeakReference[] weakReferenceArr = new WeakReference[objArr.length];
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Object obj = objArr[i];
                if ((obj instanceof Map) || (obj instanceof Integer) || (obj instanceof Double)) {
                    this.c.add(obj);
                }
                int i3 = i2 + 1;
                weakReferenceArr[i2] = new WeakReference(obj);
                i++;
                i2 = i3;
            }
            this.b = weakReferenceArr;
            this.d = method;
        }
    }

    interface c<T> {
        Class<T> a();
    }

    v(a<T> aVar, c<T> cVar) {
        com.moat.analytics.mobile.scl.a.a.a.a(aVar);
        com.moat.analytics.mobile.scl.a.a.a.a(cVar);
        this.b = aVar;
        this.c = cVar;
        u.d().a((b) new b() {
            public void b() {
                v.this.c();
            }

            public void c() {
            }
        });
    }

    static <T> T a(a<T> aVar, c<T> cVar) {
        Class a2 = cVar.a();
        ClassLoader classLoader = a2.getClassLoader();
        v vVar = new v(aVar, cVar);
        return Proxy.newProxyInstance(classLoader, new Class[]{a2}, vVar);
    }

    private Object a(Method method) {
        try {
            if (Boolean.TYPE.equals(method.getReturnType())) {
                return Boolean.valueOf(true);
            }
        } catch (Exception e2) {
            l.a(e2);
        }
        return null;
    }

    private Object a(Method method, Object[] objArr) {
        Class declaringClass = method.getDeclaringClass();
        u d2 = u.d();
        if (Object.class.equals(declaringClass)) {
            String name = method.getName();
            Class a2 = this.c.a();
            if ("getClass".equals(name)) {
                return a2;
            }
            if (!"toString".equals(name)) {
                return method.invoke(this, objArr);
            }
            Object invoke = method.invoke(this, objArr);
            String name2 = v.class.getName();
            String name3 = a2.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(invoke);
            sb.append("");
            return sb.toString().replace(name2, name3);
        } else if (!this.f || this.g != null) {
            if (d2.a() == d.ON) {
                c();
                T t = this.g;
                if (t != null) {
                    return method.invoke(t, objArr);
                }
            }
            if (d2.a() == d.OFF && (!this.f || this.g != null)) {
                b(method, objArr);
            }
            return a(method);
        } else {
            d();
            return a(method);
        }
    }

    private void b() {
        if (!this.f) {
            try {
                this.g = this.b.a().c(null);
            } catch (Exception e2) {
                n.a("OnOffTrackerProxy", (Object) this, "Could not create instance", (Throwable) e2);
                l.a(e2);
            }
            this.f = true;
        }
    }

    private void b(Method method, Object[] objArr) {
        LinkedList<b> linkedList;
        b bVar;
        if (this.d.size() < 5) {
            linkedList = this.d;
            bVar = new b(method, objArr);
        } else {
            if (this.e.size() >= 10) {
                this.e.removeFirst();
            }
            linkedList = this.e;
            bVar = new b(method, objArr);
        }
        linkedList.add(bVar);
    }

    /* access modifiers changed from: private */
    public void c() {
        b();
        if (this.g != null) {
            LinkedList<LinkedList> linkedList = new LinkedList<>();
            linkedList.add(this.d);
            linkedList.add(this.e);
            for (LinkedList linkedList2 : linkedList) {
                Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    try {
                        Object[] objArr = new Object[bVar.b.length];
                        WeakReference[] a2 = bVar.b;
                        int length = a2.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            objArr[i2] = a2[i].get();
                            i++;
                            i2 = i3;
                        }
                        bVar.d.invoke(this.g, objArr);
                    } catch (Exception e2) {
                        l.a(e2);
                    }
                }
                linkedList2.clear();
            }
        }
    }

    private void d() {
        this.d.clear();
        this.e.clear();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return a(method, objArr);
        } catch (Exception e2) {
            l.a(e2);
            return a(method);
        }
    }
}
