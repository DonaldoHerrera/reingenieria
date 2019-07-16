package defpackage;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.r;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: yya reason: default package and case insensitive filesystem */
/* compiled from: StorageCleanupEvent */
public abstract class C7784yya extends J implements r {
    public static C7784yya a(int i, int i2, int i3, Map<String, Integer> map, Map<String, Integer> map2, Map<String, Integer> map3) {
        C5516Zxa zxa = new C5516Zxa(J.b(), J.c(), i, i2, i3, map, map2, map3);
        return zxa;
    }

    /* access modifiers changed from: 0000 */
    public abstract int h();

    /* access modifiers changed from: 0000 */
    public abstract Map<String, Integer> i();

    /* access modifiers changed from: 0000 */
    public abstract int j();

    /* access modifiers changed from: 0000 */
    public abstract Map<String, Integer> k();

    /* access modifiers changed from: 0000 */
    public abstract int l();

    /* access modifiers changed from: 0000 */
    public abstract Map<String, Integer> m();

    public C3816lea a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3808kea.a("users_removed", (Number) Integer.valueOf(l())));
        arrayList.add(C3808kea.a("tracks_removed", (Number) Integer.valueOf(j())));
        arrayList.add(C3808kea.a("playlists_removed", (Number) Integer.valueOf(h())));
        for (String str : m().keySet()) {
            Integer num = (Integer) m().get(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" users");
            a(arrayList, num, sb.toString());
        }
        for (String str2 : k().keySet()) {
            Integer num2 = (Integer) k().get(str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" tracks");
            a(arrayList, num2, sb2.toString());
        }
        for (String str3 : i().keySet()) {
            Integer num3 = (Integer) i().get(str3);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(" playlists");
            a(arrayList, num3, sb3.toString());
        }
        return C3816lea.a("core_storage_cleanup", (C3808kea[]) arrayList.toArray(new C3808kea[0]));
    }

    private void a(ArrayList<C3808kea> arrayList, Integer num, String str) {
        if (num.intValue() > 0) {
            arrayList.add(C3808kea.a(str, (Number) num));
        }
    }
}
