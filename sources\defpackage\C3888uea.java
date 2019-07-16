package defpackage;

/* renamed from: uea reason: default package and case insensitive filesystem */
/* compiled from: MediaId.kt */
public final class C3888uea {
    /* access modifiers changed from: private */
    public static final C3872sea b(String str) {
        if (C7471uYa.a((Object) str, (Object) C3872sea.LIKES.a())) {
            return C3872sea.LIKES;
        }
        if (C7471uYa.a((Object) str, (Object) C3872sea.PLAY_HISTORY.a())) {
            return C3872sea.PLAY_HISTORY;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported collection name ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
}
