package defpackage;

/* renamed from: wXa reason: default package and case insensitive filesystem */
/* compiled from: PlatformImplementations.kt */
public final class C7608wXa {
    public static final C7539vXa a;

    static {
        C7539vXa vxa;
        Object newInstance;
        Object newInstance2;
        int a2 = a();
        String str = "ClassCastException(\"Inst…baseTypeCL\").initCause(e)";
        String str2 = ", base type classloader: ";
        String str3 = "Instance classloader: ";
        String str4 = "null cannot be cast to non-null type kotlin.internal.PlatformImplementations";
        String str5 = "Class.forName(\"kotlin.in…entations\").newInstance()";
        if (a2 >= 65544) {
            try {
                newInstance2 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                C7471uYa.a(newInstance2, str5);
                if (newInstance2 != null) {
                    vxa = (C7539vXa) newInstance2;
                    a = vxa;
                }
                throw new OVa(str4);
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = C7539vXa.class.getClassLoader();
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(classLoader);
                sb.append(str2);
                sb.append(classLoader2);
                Throwable initCause = new ClassCastException(sb.toString()).initCause(e);
                C7471uYa.a((Object) initCause, str);
                throw initCause;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C7471uYa.a(newInstance3, str5);
                    if (newInstance3 != null) {
                        try {
                            vxa = (C7539vXa) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = C7539vXa.class.getClassLoader();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str3);
                            sb2.append(classLoader3);
                            sb2.append(str2);
                            sb2.append(classLoader4);
                            Throwable initCause2 = new ClassCastException(sb2.toString()).initCause(e2);
                            C7471uYa.a((Object) initCause2, str);
                            throw initCause2;
                        }
                    } else {
                        throw new OVa(str4);
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a2 >= 65543) {
            try {
                newInstance = Class.forName("yXa").newInstance();
                C7471uYa.a(newInstance, str5);
                if (newInstance != null) {
                    vxa = (C7539vXa) newInstance;
                    a = vxa;
                }
                throw new OVa(str4);
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = C7539vXa.class.getClassLoader();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(classLoader5);
                sb3.append(str2);
                sb3.append(classLoader6);
                Throwable initCause3 = new ClassCastException(sb3.toString()).initCause(e3);
                C7471uYa.a((Object) initCause3, str);
                throw initCause3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C7471uYa.a(newInstance4, str5);
                    if (newInstance4 != null) {
                        try {
                            vxa = (C7539vXa) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = C7539vXa.class.getClassLoader();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3);
                            sb4.append(classLoader7);
                            sb4.append(str2);
                            sb4.append(classLoader8);
                            Throwable initCause4 = new ClassCastException(sb4.toString()).initCause(e4);
                            C7471uYa.a((Object) initCause4, str);
                            throw initCause4;
                        }
                    } else {
                        throw new OVa(str4);
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        vxa = new C7539vXa();
        a = vxa;
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property == null) {
            return 65542;
        }
        int a2 = Hxb.a((CharSequence) property, '.', 0, false, 6, (Object) null);
        if (a2 < 0) {
            try {
                i = Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
            }
            return i;
        }
        int i2 = a2 + 1;
        int a3 = Hxb.a((CharSequence) property, '.', i2, false, 4, (Object) null);
        if (a3 < 0) {
            a3 = property.length();
        }
        String str = "null cannot be cast to non-null type java.lang.String";
        if (property != null) {
            String substring = property.substring(0, a2);
            String str2 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            C7471uYa.a((Object) substring, str2);
            if (property != null) {
                String substring2 = property.substring(i2, a3);
                C7471uYa.a((Object) substring2, str2);
                try {
                    i = (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                } catch (NumberFormatException unused2) {
                }
                return i;
            }
            throw new OVa(str);
        }
        throw new OVa(str);
    }
}
