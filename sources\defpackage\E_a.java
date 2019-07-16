package defpackage;

import java.lang.reflect.Type;

/* renamed from: E_a reason: default package */
/* compiled from: KClassImpl.kt */
final class E_a extends C7540vYa implements PXa<Type> {
    final /* synthetic */ C7706xtb a;
    final /* synthetic */ G_a b;

    E_a(C7706xtb xtb, G_a g_a) {
        this.a = xtb;
        this.b = g_a;
        super(0);
    }

    public final Type d() {
        C5122Mcb c = this.a.za().c();
        if (c instanceof C5029Jcb) {
            Class a2 = C6312dbb.a((C5029Jcb) c);
            if (a2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported superclass of ");
                sb.append(this.b.a);
                sb.append(": ");
                sb.append(c);
                throw new C5240Qab(sb.toString());
            } else if (C7471uYa.a((Object) I_a.this.a().getSuperclass(), (Object) a2)) {
                Type genericSuperclass = I_a.this.a().getGenericSuperclass();
                C7471uYa.a((Object) genericSuperclass, "jClass.genericSuperclass");
                return genericSuperclass;
            } else {
                Class[] interfaces = I_a.this.a().getInterfaces();
                C7471uYa.a((Object) interfaces, "jClass.interfaces");
                int b2 = C6578hWa.b((Object[]) interfaces, (Object) a2);
                if (b2 >= 0) {
                    Type type = I_a.this.a().getGenericInterfaces()[b2];
                    C7471uYa.a((Object) type, "jClass.genericInterfaces[index]");
                    return type;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No superclass of ");
                sb2.append(this.b.a);
                sb2.append(" in Java reflection for ");
                sb2.append(c);
                throw new C5240Qab(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Supertype not a class: ");
            sb3.append(c);
            throw new C5240Qab(sb3.toString());
        }
    }
}
