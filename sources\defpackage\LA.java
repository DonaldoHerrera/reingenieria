package defpackage;

import java.io.File;
import java.util.Set;

/* renamed from: LA reason: default package */
final class LA implements AA {
    LA() {
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        IA.a(classLoader, set, new KA());
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return IA.a(classLoader, file, file2, z, "zip");
    }
}
