package androidx.work;

import androidx.work.e.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class OverwritingInputMerger extends h {
    public e a(List<e> list) {
        a aVar = new a();
        HashMap hashMap = new HashMap();
        for (e a : list) {
            hashMap.putAll(a.a());
        }
        aVar.a((Map<String, Object>) hashMap);
        return aVar.a();
    }
}
