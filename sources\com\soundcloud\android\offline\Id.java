package com.soundcloud.android.offline;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: OfflineContentUpdates */
public abstract class Id {

    /* compiled from: OfflineContentUpdates */
    public static abstract class a {
        public abstract a a(C4157rc rcVar);

        public abstract a a(List<C3508cda> list);

        public abstract a a(Set<C3508cda> set);

        public abstract Id a();

        public abstract a b(List<C4146pc> list);

        public abstract a c(List<C3508cda> list);

        public abstract a d(List<C3508cda> list);

        public abstract a e(List<C3508cda> list);
    }

    public static a a() {
        return new a().e(Collections.emptyList()).b(Collections.emptyList()).a(Collections.emptyList()).d(Collections.emptyList()).c(Collections.emptyList()).a(Collections.emptySet()).a(C4157rc.a);
    }

    public abstract List<C3508cda> b();

    public String c() {
        return C4804CKa.a((Object) this).a("unavailableTracks", h().size()).a("tracksToDownload", e().size()).a("tracksToRestore", g().size()).a("tracksToMarkForDeletion", f().size()).a("tracksToDelete", d().size()).toString();
    }

    public abstract Set<C3508cda> d();

    public abstract List<C4146pc> e();

    public abstract List<C3508cda> f();

    public abstract List<C3508cda> g();

    public abstract List<C3508cda> h();

    public abstract C4157rc i();
}
