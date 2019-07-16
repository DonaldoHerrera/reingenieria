package defpackage;

import com.google.common.base.Function;
import java.util.Collection;

/* renamed from: nAa reason: default package and case insensitive filesystem */
/* compiled from: PublishPlaylistUpdateEventCommand */
public class C6960nAa extends C7236rAa<C3927zda> {
    private final C5327TLa a;

    public C6960nAa(C5327TLa tLa) {
        this.a = tLa;
    }

    public Boolean a(Collection<C3927zda> collection) {
        if (collection.size() <= 0) {
            return Boolean.valueOf(false);
        }
        this.a.c(C3876taa.q, Kaa.a(C3063jD.a(collection, (Function<? super F, T>) C5616bAa.a)));
        return Boolean.valueOf(true);
    }
}
