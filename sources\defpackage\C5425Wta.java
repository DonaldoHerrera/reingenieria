package defpackage;

import com.soundcloud.android.likes.C3971b;
import com.soundcloud.android.likes.C3988l;
import com.soundcloud.android.tracks.C6185ma;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
/* renamed from: Wta reason: default package and case insensitive filesystem */
/* compiled from: EntityItemCreator */
public class C5425Wta {
    private final C3815lda a;
    private final C3971b b;
    private final C1937AR c;

    public C5425Wta(C3815lda lda, C3971b bVar, C1937AR ar) {
        this.a = lda;
        this.b = bVar;
        this.c = ar;
    }

    public C6185ma a(C3493aea aea) {
        C3508cda y = aea.b().y();
        return C6185ma.a(aea, this.b.a().a(y), this.c.a().a(y), this.a.a().a(y));
    }

    public C6185ma a(C3509cea cea) {
        return C6185ma.a(cea, this.b.a().a(cea.y()), this.c.a().a(cea.y()), this.a.a().a(cea.y()));
    }

    public C3863rda a(Eda eda) {
        return C3863rda.a(eda, this.b.a().a(eda.v()), this.c.a().a(eda.v()), this.a.a().a(eda.v()));
    }

    public C4954HFa a(C3784hea hea, boolean z) {
        return new C4954HFa(hea, z);
    }

    public C4954HFa a(C3776gea gea, C3400zR zRVar) {
        return a(C3775gda.a(gea), zRVar);
    }

    public C4954HFa a(C3784hea hea, C3400zR zRVar) {
        return new C4954HFa(hea, zRVar.a(hea.a));
    }

    public Map<C3508cda, C6185ma> a(Map<C3508cda, C3509cea> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), a((C3509cea) entry.getValue()));
        }
        return hashMap;
    }

    public C6185ma a(C3509cea cea, C3807kda kda, C3988l lVar, C2057GR gr, C3508cda cda) {
        return C6185ma.a(cea, kda.a(cea.y()), lVar.a(cea.y()), gr.a(cea.y()), cea.y().equals(cda));
    }

    public C3863rda a(Eda eda, C3988l lVar, C2057GR gr, C3807kda kda) {
        return C3863rda.a(eda, lVar.a(eda.v()), gr.a(eda.v()), kda.a(eda.v()));
    }
}
