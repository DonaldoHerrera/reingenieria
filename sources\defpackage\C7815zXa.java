package defpackage;

import java.io.File;

/* renamed from: zXa reason: default package and case insensitive filesystem */
/* compiled from: Exceptions.kt */
public final class C7815zXa extends DXa {
    public /* synthetic */ C7815zXa(File file, File file2, String str, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            file2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        this(file, file2, str);
    }

    public C7815zXa(File file, File file2, String str) {
        C7471uYa.b(file, "file");
        super(file, file2, str);
    }
}
