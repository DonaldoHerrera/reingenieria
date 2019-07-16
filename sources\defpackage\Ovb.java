package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;", "", "()V", "cache", "Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "getCache", "()Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "setCache", "(Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;)V", "buildCache", "member", "Ljava/lang/reflect/Member;", "loadParameterNames", "", "", "Cache", "descriptors.runtime"}, mv = {1, 1, 15})
/* renamed from: Ovb reason: default package */
/* compiled from: ReflectJavaMember.kt */
final class Ovb {
    private static a a;
    public static final Ovb b = new Ovb();

    /* renamed from: Ovb$a */
    /* compiled from: ReflectJavaMember.kt */
    public static final class a {
        private final Method a;
        private final Method b;

        public a(Method method, Method method2) {
            this.a = method;
            this.b = method2;
        }

        public final Method a() {
            return this.b;
        }

        public final Method b() {
            return this.a;
        }
    }

    private Ovb() {
    }

    public final a a(Member member) {
        C7471uYa.b(member, "member");
        Class cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), Rvb.e(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List<String> b(Member member) {
        C7471uYa.b(member, "member");
        a aVar = a;
        if (aVar == null) {
            aVar = a(member);
            a = aVar;
        }
        Method b2 = aVar.b();
        if (b2 != null) {
            Method a2 = aVar.a();
            if (a2 != null) {
                Object invoke = b2.invoke(member, new Object[0]);
                if (invoke != null) {
                    Object[] objArr = (Object[]) invoke;
                    ArrayList arrayList = new ArrayList(objArr.length);
                    int length = objArr.length;
                    int i = 0;
                    while (i < length) {
                        Object invoke2 = a2.invoke(objArr[i], new Object[0]);
                        if (invoke2 != null) {
                            arrayList.add((String) invoke2);
                            i++;
                        } else {
                            throw new OVa("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    return arrayList;
                }
                throw new OVa("null cannot be cast to non-null type kotlin.Array<*>");
            }
        }
        return null;
    }
}
