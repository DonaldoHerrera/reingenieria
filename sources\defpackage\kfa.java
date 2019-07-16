package defpackage;

import java.io.File;

/* renamed from: kfa reason: default package */
/* compiled from: FilePart */
public final class kfa extends lfa {
    private final File c;
    private final String d;

    kfa(String str, File file, String str2) {
        this(str, file, file.getName(), str2);
    }

    public static kfa a(String str, File file, String str2) {
        return new kfa(str, file, str2);
    }

    public File c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof kfa)) {
            return false;
        }
        kfa kfa = (kfa) obj;
        if (C4804CKa.a(this.c, kfa.c) && C4804CKa.a(this.a, kfa.a) && C4804CKa.a(this.d, kfa.d) && C4804CKa.a(this.b, kfa.b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C4804CKa.a(this.c, this.a, this.d, this.b);
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("partName", (Object) this.a).a("file", (Object) this.c).a("fileName", (Object) this.d).toString();
    }

    public kfa(String str, File file, String str2, String str3) {
        super(str, str3);
        this.c = file;
        this.d = str2;
    }

    public static kfa a(String str, File file, String str2, String str3) {
        return new kfa(str, file, str2, str3);
    }
}
