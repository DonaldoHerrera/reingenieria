package defpackage;

import java.io.File;

/* renamed from: EA reason: default package */
final class EA implements DA {
    EA() {
    }

    public final boolean a(Object obj, File file, File file2) {
        return new File((String) XA.a(obj.getClass(), "optimizedPathFor", String.class, File.class, file, File.class, file2)).exists();
    }
}
