package defpackage;

/* renamed from: onb reason: default package and case insensitive filesystem */
/* compiled from: ModuleMapping.kt */
public final class C7073onb {
    /* access modifiers changed from: private */
    public static final String b(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Cxb.a(str, '.', '/', false, 4, (Object) null));
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
