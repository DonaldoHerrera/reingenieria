package defpackage;

import java.io.File;

/* renamed from: KXa reason: default package */
/* compiled from: FileTreeWalk.kt */
class KXa extends JXa {
    public static final EXa a(File file, GXa gXa) {
        C7471uYa.b(file, "$this$walk");
        C7471uYa.b(gXa, "direction");
        return new EXa(file, gXa);
    }

    public static final EXa a(File file) {
        C7471uYa.b(file, "$this$walkBottomUp");
        return a(file, GXa.BOTTOM_UP);
    }
}
