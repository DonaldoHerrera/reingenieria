package defpackage;

import com.google.common.base.Function;
import java.util.Collection;

/* renamed from: pAa reason: default package and case insensitive filesystem */
/* compiled from: PublishTrackUpdateEventCommand */
public class C7098pAa extends C7236rAa<Yda> {
    private final C5327TLa a;

    public C7098pAa(C5327TLa tLa) {
        this.a = tLa;
    }

    public Boolean a(Collection<Yda> collection) {
        if (collection.size() <= 0) {
            return Boolean.valueOf(false);
        }
        this.a.c(C3876taa.p, new Uaa(C3063jD.a(collection, (Function<? super F, T>) C6280dAa.a)));
        return Boolean.valueOf(true);
    }
}
