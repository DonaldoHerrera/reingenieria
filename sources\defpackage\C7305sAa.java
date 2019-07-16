package defpackage;

import com.google.common.base.Function;
import java.util.Collection;

/* renamed from: sAa reason: default package and case insensitive filesystem */
/* compiled from: PublishUserUpdateEventCommand */
public class C7305sAa extends C7236rAa<C3776gea> {
    private final C5327TLa a;

    public C7305sAa(C5327TLa tLa) {
        this.a = tLa;
    }

    public Boolean a(Collection<C3776gea> collection) {
        if (collection.isEmpty()) {
            return Boolean.valueOf(false);
        }
        this.a.c(C3876taa.r, C3498bba.a(C3063jD.a(collection, (Function<? super F, T>) C5684cAa.a)));
        return Boolean.valueOf(true);
    }
}
