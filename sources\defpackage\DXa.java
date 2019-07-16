package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: DXa reason: default package */
/* compiled from: Exceptions.kt */
public class DXa extends IOException {
    private final File a;
    private final File b;
    private final String c;

    public DXa(File file, File file2, String str) {
        C7471uYa.b(file, "file");
        super(CXa.b(file, file2, str));
        this.a = file;
        this.b = file2;
        this.c = str;
    }
}
