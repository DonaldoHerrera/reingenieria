package defpackage;

import java.util.List;

/* renamed from: Hmb reason: default package */
/* compiled from: ProtoBufUtil.kt */
public final class Hmb {
    public static final <M extends c<M>, T> T a(c<M> cVar, f<M, T> fVar) {
        C7471uYa.b(cVar, "$this$getExtensionOrNull");
        C7471uYa.b(fVar, "extension");
        if (cVar.c(fVar)) {
            return cVar.a(fVar);
        }
        return null;
    }

    public static final <M extends c<M>, T> T a(c<M> cVar, f<M, List<T>> fVar, int i) {
        C7471uYa.b(cVar, "$this$getExtensionOrNull");
        C7471uYa.b(fVar, "extension");
        if (i < cVar.b(fVar)) {
            return cVar.a(fVar, i);
        }
        return null;
    }
}
