package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "isDefault", "", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "kotlin-reflect-api"}, mv = {1, 1, 15})
/* renamed from: qbb reason: default package and case insensitive filesystem */
/* compiled from: InlineClassAwareCaller.kt */
public final class C7199qbb<M extends Member> implements C6992nbb<M> {
    private final a a;
    private final C6992nbb<M> b;
    private final boolean c;

    /* renamed from: qbb$a */
    /* compiled from: InlineClassAwareCaller.kt */
    private static final class a {
        private final C6785kZa a;
        private final Method[] b;
        private final Method c;

        public a(C6785kZa kza, Method[] methodArr, Method method) {
            C7471uYa.b(kza, "argumentRange");
            C7471uYa.b(methodArr, "unbox");
            this.a = kza;
            this.b = methodArr;
            this.c = method;
        }

        public final C6785kZa a() {
            return this.a;
        }

        public final Method[] b() {
            return this.b;
        }

        public final Method c() {
            return this.c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if ((r0 instanceof defpackage.C6924mbb) != false) goto L_0x0071;
     */
    public C7199qbb(C4935Gcb gcb, C6992nbb<? extends M> nbb, boolean z) {
        a aVar;
        Method method;
        C7471uYa.b(gcb, "descriptor");
        C7471uYa.b(nbb, "caller");
        this.b = nbb;
        this.c = z;
        C7706xtb a2 = gcb.a();
        if (a2 != null) {
            C7471uYa.a((Object) a2, "descriptor.returnType!!");
            Class a3 = C7268rbb.a(a2);
            Method a4 = a3 != null ? C7268rbb.a(a3, gcb) : null;
            if (C6667ipb.a((C4904Fcb) gcb)) {
                aVar = new a(C6785kZa.f.a(), new Method[0], a4);
            } else {
                C6992nbb<M> nbb2 = this.b;
                String str = "descriptor.containingDeclaration";
                int i = -1;
                if (!(nbb2 instanceof c)) {
                    if (!(gcb instanceof C5242Qcb)) {
                        if (gcb.k() != null && !(this.b instanceof C6924mbb)) {
                            C5272Rcb e = gcb.e();
                            C7471uYa.a((Object) e, str);
                            if (!C6667ipb.a(e)) {
                                i = 1;
                            }
                        }
                    }
                    i = 0;
                }
                int i2 = this.c ? 2 : 0;
                ArrayList arrayList = new ArrayList();
                C7615wdb l = gcb.l();
                Object type = l != null ? l.getType() : null;
                if (type != null) {
                    arrayList.add(type);
                } else if (gcb instanceof C5242Qcb) {
                    C5029Jcb T = ((C5242Qcb) gcb).T();
                    C7471uYa.a((Object) T, "descriptor.constructedClass");
                    if (T.D()) {
                        C5272Rcb e2 = T.e();
                        if (e2 != null) {
                            arrayList.add(((C5029Jcb) e2).z());
                        } else {
                            throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        }
                    }
                } else {
                    C5272Rcb e3 = gcb.e();
                    C7471uYa.a((Object) e3, str);
                    if (e3 instanceof C5029Jcb) {
                        C5029Jcb jcb = (C5029Jcb) e3;
                        if (jcb.isInline()) {
                            arrayList.add(jcb.z());
                        }
                    }
                }
                List<C5061Kdb> f = gcb.f();
                C7471uYa.a((Object) f, "descriptor.valueParameters");
                for (C5061Kdb type2 : f) {
                    arrayList.add(type2.getType());
                }
                int size = arrayList.size() + i + i2;
                if (C7130pbb.a(this) == size) {
                    C6785kZa d = C7265rZa.d(Math.max(i, 0), arrayList.size() + i);
                    Method[] methodArr = new Method[size];
                    int length = methodArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (d.c(i3)) {
                            Class a5 = C7268rbb.a((C7706xtb) arrayList.get(i3 - i));
                            if (a5 != null) {
                                method = C7268rbb.b(a5, gcb);
                                methodArr[i3] = method;
                            }
                        }
                        method = null;
                        methodArr[i3] = method;
                    }
                    aVar = new a(d, methodArr, a4);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                    sb.append(C7130pbb.a(this));
                    sb.append(" != ");
                    sb.append(size);
                    sb.append(10);
                    sb.append("Calling: ");
                    sb.append(gcb);
                    sb.append(10);
                    sb.append("Parameter types: ");
                    sb.append(b());
                    sb.append(")\n");
                    sb.append("Default: ");
                    sb.append(this.c);
                    throw new C5240Qab(sb.toString());
                }
            }
            this.a = aVar;
            return;
        }
        C7471uYa.a();
        throw null;
    }

    public Type a() {
        return this.b.a();
    }

    public List<Type> b() {
        return this.b.b();
    }

    public M getMember() {
        return this.b.getMember();
    }

    public Object a(Object[] objArr) {
        C7471uYa.b(objArr, "args");
        a aVar = this.a;
        C6785kZa a2 = aVar.a();
        Method[] b2 = aVar.b();
        Method c2 = aVar.c();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C7471uYa.a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        if (copyOf != null) {
            int first = a2.getFirst();
            int last = a2.getLast();
            if (first <= last) {
                while (true) {
                    Method method = b2[first];
                    Object obj = objArr[first];
                    if (!(method == null || obj == null)) {
                        obj = method.invoke(obj, new Object[0]);
                    }
                    copyOf[first] = obj;
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
            Object a3 = this.b.a(copyOf);
            if (c2 == null) {
                return a3;
            }
            Object invoke = c2.invoke(null, new Object[]{a3});
            return invoke != null ? invoke : a3;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }
}
