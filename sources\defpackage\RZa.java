package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* renamed from: RZa reason: default package */
/* compiled from: KCallablesJvm.kt */
public final class RZa {
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    public static final boolean a(C7403tZa<?> tza) {
        Member member;
        AccessibleObject accessibleObject;
        C7471uYa.b(tza, "$this$isAccessible");
        if (tza instanceof C7748yZa) {
            DZa dZa = (DZa) tza;
            Field a = UZa.a(dZa);
            if (!(a != null ? a.isAccessible() : true)) {
                return false;
            }
            Method b = UZa.b(dZa);
            if (!(b != null ? b.isAccessible() : true)) {
                return false;
            }
            Method a2 = UZa.a((C7748yZa) tza);
            if (!(a2 != null ? a2.isAccessible() : true)) {
                return false;
            }
        } else if (tza instanceof DZa) {
            DZa dZa2 = (DZa) tza;
            Field a3 = UZa.a(dZa2);
            if (!(a3 != null ? a3.isAccessible() : true)) {
                return false;
            }
            Method b2 = UZa.b(dZa2);
            if (!(b2 != null ? b2.isAccessible() : true)) {
                return false;
            }
        } else if (tza instanceof b) {
            Field a4 = UZa.a(((b) tza).e());
            if (!(a4 != null ? a4.isAccessible() : true)) {
                return false;
            }
            Method b3 = UZa.b((C7679xZa) tza);
            if (!(b3 != null ? b3.isAccessible() : true)) {
                return false;
            }
        } else if (tza instanceof a) {
            Field a5 = UZa.a(((a) tza).e());
            if (!(a5 != null ? a5.isAccessible() : true)) {
                return false;
            }
            Method b4 = UZa.b((C7679xZa) tza);
            if (!(b4 != null ? b4.isAccessible() : true)) {
                return false;
            }
        } else if (tza instanceof C7679xZa) {
            C7679xZa xza = (C7679xZa) tza;
            Method b5 = UZa.b(xza);
            if (!(b5 != null ? b5.isAccessible() : true)) {
                return false;
            }
            C6922m_a a6 = C6312dbb.a((Object) tza);
            if (a6 != null) {
                C6992nbb h = a6.h();
                if (h != null) {
                    member = h.getMember();
                    if (!(member instanceof AccessibleObject)) {
                        member = null;
                    }
                    accessibleObject = (AccessibleObject) member;
                    if (accessibleObject == null ? accessibleObject.isAccessible() : true) {
                        return false;
                    }
                    Constructor a7 = UZa.a(xza);
                    if (!(a7 != null ? a7.isAccessible() : true)) {
                        return false;
                    }
                }
            }
            member = null;
            if (!(member instanceof AccessibleObject)) {
            }
            accessibleObject = (AccessibleObject) member;
            if (accessibleObject == null ? accessibleObject.isAccessible() : true) {
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown callable: ");
            sb.append(tza);
            sb.append(" (");
            sb.append(tza.getClass());
            sb.append(')');
            throw new UnsupportedOperationException(sb.toString());
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void a(C7403tZa<?> tza, boolean z) {
        Member member;
        AccessibleObject accessibleObject;
        Constructor a;
        C7471uYa.b(tza, "$this$isAccessible");
        if (tza instanceof C7748yZa) {
            DZa dZa = (DZa) tza;
            Field a2 = UZa.a(dZa);
            if (a2 != null) {
                a2.setAccessible(z);
            }
            Method b = UZa.b(dZa);
            if (b != null) {
                b.setAccessible(z);
            }
            Method a3 = UZa.a((C7748yZa) tza);
            if (a3 != null) {
                a3.setAccessible(z);
            }
        } else if (tza instanceof DZa) {
            DZa dZa2 = (DZa) tza;
            Field a4 = UZa.a(dZa2);
            if (a4 != null) {
                a4.setAccessible(z);
            }
            Method b2 = UZa.b(dZa2);
            if (b2 != null) {
                b2.setAccessible(z);
            }
        } else if (tza instanceof b) {
            Field a5 = UZa.a(((b) tza).e());
            if (a5 != null) {
                a5.setAccessible(z);
            }
            Method b3 = UZa.b((C7679xZa) tza);
            if (b3 != null) {
                b3.setAccessible(z);
            }
        } else if (tza instanceof a) {
            Field a6 = UZa.a(((a) tza).e());
            if (a6 != null) {
                a6.setAccessible(z);
            }
            Method b4 = UZa.b((C7679xZa) tza);
            if (b4 != null) {
                b4.setAccessible(z);
            }
        } else if (tza instanceof C7679xZa) {
            C7679xZa xza = (C7679xZa) tza;
            Method b5 = UZa.b(xza);
            if (b5 != null) {
                b5.setAccessible(z);
            }
            C6922m_a a7 = C6312dbb.a((Object) tza);
            if (a7 != null) {
                C6992nbb h = a7.h();
                if (h != null) {
                    member = h.getMember();
                    if (!(member instanceof AccessibleObject)) {
                        member = null;
                    }
                    accessibleObject = (AccessibleObject) member;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(true);
                    }
                    a = UZa.a(xza);
                    if (a == null) {
                        a.setAccessible(z);
                        return;
                    }
                    return;
                }
            }
            member = null;
            if (!(member instanceof AccessibleObject)) {
            }
            accessibleObject = (AccessibleObject) member;
            if (accessibleObject != null) {
            }
            a = UZa.a(xza);
            if (a == null) {
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown callable: ");
            sb.append(tza);
            sb.append(" (");
            sb.append(tza.getClass());
            sb.append(')');
            throw new UnsupportedOperationException(sb.toString());
        }
    }
}
