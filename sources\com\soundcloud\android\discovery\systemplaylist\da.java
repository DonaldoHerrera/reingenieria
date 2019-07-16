package com.soundcloud.android.discovery.systemplaylist;

/* compiled from: SystemPlaylistViewModelItem.kt */
public final class da {
    public static final boolean a(ca caVar, ca caVar2) {
        C7471uYa.b(caVar, "$this$hasIdentityEqual");
        C7471uYa.b(caVar2, "other");
        if (caVar.a() != caVar2.a()) {
            return false;
        }
        if (caVar.a() == C3519j.HEADER) {
            return true;
        }
        if (caVar.a() != C3519j.TRACK) {
            return false;
        }
        String str = " not of type ";
        String str2 = "Input ";
        if (caVar instanceof V) {
            C3508cda a = ((V) caVar).b().d().a();
            if (caVar2 instanceof V) {
                return C7471uYa.a((Object) a, (Object) ((V) caVar2).b().d().a());
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(caVar2);
            sb.append(str);
            sb.append(V.class.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(caVar);
        sb2.append(str);
        sb2.append(V.class.getSimpleName());
        throw new IllegalArgumentException(sb2.toString());
    }
}
