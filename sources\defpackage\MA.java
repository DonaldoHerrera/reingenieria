package defpackage;

import java.io.File;
import java.util.Set;

/* renamed from: MA reason: default package */
final class MA implements AA {
    MA() {
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        IA.a(classLoader, set, new KA());
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return IA.a(classLoader, file, file2, z, "zip");
    }
}
