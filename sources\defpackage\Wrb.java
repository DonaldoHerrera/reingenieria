package defpackage;

import java.io.InputStream;

/* renamed from: Wrb reason: default package */
/* compiled from: BuiltInsResourceLoader.kt */
public final class Wrb {
    public final InputStream a(String str) {
        C7471uYa.b(str, "path");
        ClassLoader classLoader = Wrb.class.getClassLoader();
        if (classLoader != null) {
            InputStream resourceAsStream = classLoader.getResourceAsStream(str);
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
        }
        return ClassLoader.getSystemResourceAsStream(str);
    }
}
