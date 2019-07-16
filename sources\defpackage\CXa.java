package defpackage;

import java.io.File;

/* renamed from: CXa reason: default package */
/* compiled from: Exceptions.kt */
public final class CXa {
    /* access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" -> ");
            sb2.append(file2);
            sb.append(sb2.toString());
        }
        if (str != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(": ");
            sb3.append(str);
            sb.append(sb3.toString());
        }
        String sb4 = sb.toString();
        C7471uYa.a((Object) sb4, "sb.toString()");
        return sb4;
    }
}
