package defpackage;

/* renamed from: Akb reason: default package */
/* compiled from: methodSignatureMapping.kt */
final class Akb implements C7829zkb<C7760ykb> {
    public static final Akb a = new Akb();

    private Akb() {
    }

    public b b(String str) {
        C7471uYa.b(str, "internalName");
        return new b(str);
    }

    /* renamed from: a */
    public C7760ykb b(C7760ykb ykb) {
        C7471uYa.b(ykb, "possiblyPrimitiveType");
        if (!(ykb instanceof c)) {
            return ykb;
        }
        c cVar = (c) ykb;
        if (cVar.a() == null) {
            return ykb;
        }
        C7355sqb a2 = C7355sqb.a(cVar.a().d());
        C7471uYa.a((Object) a2, "JvmClassName.byFqNameWit…mitiveType.wrapperFqName)");
        String b = a2.b();
        C7471uYa.a((Object) b, "JvmClassName.byFqNameWit…apperFqName).internalName");
        return b(b);
    }

    /* renamed from: b */
    public String a(C7760ykb ykb) {
        C7471uYa.b(ykb, C1325gg.TYPE);
        if (ykb instanceof a) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(a(((a) ykb).a()));
            return sb.toString();
        } else if (ykb instanceof c) {
            C7424tqb a2 = ((c) ykb).a();
            if (a2 != null) {
                String a3 = a2.a();
                if (a3 != null) {
                    return a3;
                }
            }
            return "V";
        } else if (ykb instanceof b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("L");
            sb2.append(((b) ykb).a());
            sb2.append(";");
            return sb2.toString();
        } else {
            throw new FVa();
        }
    }

    public C7760ykb a(String str) {
        C7424tqb tqb;
        C7760ykb ykb;
        C7471uYa.b(str, "representation");
        boolean z = false;
        boolean z2 = str.length() > 0;
        if (!TVa.a || z2) {
            char charAt = str.charAt(0);
            C7424tqb[] values = C7424tqb.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tqb = null;
                    break;
                }
                tqb = values[i];
                if (tqb.a().charAt(0) == charAt) {
                    break;
                }
                i++;
            }
            if (tqb != null) {
                return new c(tqb);
            }
            if (charAt == 'V') {
                ykb = new c(null);
            } else if (charAt != '[') {
                if (charAt == 'L' && Hxb.b((CharSequence) str, ';', false, 2, (Object) null)) {
                    z = true;
                }
                if (!TVa.a || z) {
                    String substring = str.substring(1, str.length() - 1);
                    C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    ykb = new b(substring);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Type that is not primitive nor array should be Object, but '");
                    sb.append(str);
                    sb.append("' was found");
                    throw new AssertionError(sb.toString());
                }
            } else {
                String substring2 = str.substring(1);
                C7471uYa.a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                ykb = new a(a(substring2));
            }
            return ykb;
        }
        throw new AssertionError("empty string as JvmType");
    }

    public C7760ykb a() {
        return b("java/lang/Class");
    }
}
