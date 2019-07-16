package com.soundcloud.android.collections.data;

import java.util.ArrayList;
import java.util.Collection;

@EVa(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/soundcloud/android/collections/data/ApiLikeFoundationMapper;", "", "()V", "Companion", "collections-data_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.collections.data.f reason: case insensitive filesystem */
/* compiled from: ApiLikeFoundation.kt */
public class C2850f {
    public static final a a = new a(null);

    /* renamed from: com.soundcloud.android.collections.data.f$a */
    /* compiled from: ApiLikeFoundation.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Collection<C2862s> a(Collection<? extends C2848d> collection) {
            C7471uYa.b(collection, "apiLikeFoundations");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
            for (C2848d a : collection) {
                arrayList.add(C2849e.a(a));
            }
            return arrayList;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }
}
