package defpackage;

/* renamed from: SGa reason: default package and case insensitive filesystem */
/* compiled from: AppId.kt */
public final class C5292SGa {
    public static final String a() {
        String str = "release";
        if (!SWa.c("debug", "alpha").contains(str)) {
            return "com.soundcloud.android";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("com.soundcloud.android.");
        sb.append(str);
        return sb.toString();
    }
}
