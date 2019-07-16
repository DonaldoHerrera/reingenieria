package defpackage;

import java.io.File;
import java.util.Set;

/* renamed from: OA reason: default package */
final class OA implements AA {
    OA() {
    }

    static void b(ClassLoader classLoader, Set<File> set) {
        IA.a(classLoader, set, new NA());
    }

    static boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        return CA.a(classLoader, file, file2, z, new HA(), "path", new QA());
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        b(classLoader, set);
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return b(classLoader, file, file2, z);
    }
}
