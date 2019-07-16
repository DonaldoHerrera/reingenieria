package defpackage;

import java.util.Collections;

/* renamed from: Maa reason: default package */
/* compiled from: PlaylistTrackCountChangedEvent */
public abstract class Maa extends Jaa<Integer> {
    public static Maa a(C3508cda cda, Integer num) {
        return new C3748daa(a.TRACK_ADDED, Collections.singletonMap(cda, num));
    }

    public static Maa b(C3508cda cda, Integer num) {
        return new C3748daa(a.TRACK_REMOVED, Collections.singletonMap(cda, num));
    }
}
