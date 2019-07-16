package defpackage;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.playqueue.m;

/* renamed from: raa reason: default package and case insensitive filesystem */
/* compiled from: CollectionEvent */
public abstract class C3860raa extends J {

    /* renamed from: raa$a */
    /* compiled from: CollectionEvent */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(C4928GKa<String> gKa);

        public abstract a a(String str);

        public abstract a a(b bVar);

        public abstract C3860raa a();

        public abstract a b(C4928GKa<String> gKa);

        public abstract a c(C4928GKa<m> gKa);

        public abstract a d(C4928GKa<d> gKa);
    }

    /* renamed from: raa$b */
    /* compiled from: CollectionEvent */
    public enum b {
        ITEM_NAVIGATION("item_navigation"),
        SET("filter_sort::set"),
        CLEAR("filter_sort::clear");
        
        private final String e;

        private b(String str) {
            this.e = str;
        }

        public String a() {
            return this.e;
        }
    }

    /* renamed from: raa$c */
    /* compiled from: CollectionEvent */
    public enum c {
        ALL("filter:all"),
        CREATED("filter:created"),
        LIKED("filter:liked");
        
        private final String e;

        private c(String str) {
            this.e = str;
        }
    }

    /* renamed from: raa$d */
    /* compiled from: CollectionEvent */
    public enum d {
        SORT_TITLE("sort:title"),
        SORT_RECENT("sort:recent"),
        SORT_UPDATED("sort:updated");
        
        private final String e;

        private d(String str) {
            this.e = str;
        }

        public String a() {
            return this.e;
        }
    }

    public static C3860raa a(C3508cda cda, Yca yca) {
        return a(b.ITEM_NAVIGATION, yca.a()).b(C4928GKa.c(cda.toString())).c(C4928GKa.c(m.RECENTLY_PLAYED)).a();
    }

    public abstract C4928GKa<String> h();

    @C3783hda
    public abstract b i();

    public abstract C4928GKa<String> j();

    public abstract String k();

    public abstract C4928GKa<m> l();

    public abstract C4928GKa<d> m();

    private static a a(b bVar, String str) {
        return new a().b(J.b()).a(J.c()).a(bVar).a(C4928GKa.a()).b(C4928GKa.a()).d(C4928GKa.a()).a(str).c(C4928GKa.a());
    }
}
