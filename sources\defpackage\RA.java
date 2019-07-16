package defpackage;

import java.io.File;
import java.util.Set;

/* renamed from: RA reason: default package */
final class RA implements AA {
    RA() {
    }

    public final void a(ClassLoader classLoader, Set<File> set) {
        OA.b(classLoader, set);
    }

    public final boolean a(ClassLoader classLoader, File file, File file2, boolean z) {
        return CA.a(classLoader, file, file2, z, new HA(), "path", new UA());
    }
}
