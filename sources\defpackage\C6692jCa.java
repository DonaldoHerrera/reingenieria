package defpackage;

/* renamed from: jCa reason: default package and case insensitive filesystem */
/* compiled from: PostRecord */
public final /* synthetic */ class C6692jCa {
    public static /* synthetic */ int a(C6760kCa kca, C6760kCa kca2) {
        int a = kca.c().compareTo(kca2.c());
        if (a == 0) {
            a = Boolean.valueOf(kca.a()).compareTo(Boolean.valueOf(kca2.a()));
        }
        return a == 0 ? kca.b().compareTo(kca2.b()) : a;
    }
}
