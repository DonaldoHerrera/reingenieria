package com.soundcloud.android.sync;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: SyncIntentHelper */
final class V {
    private V() {
    }

    static Intent a(Intent intent, na naVar) {
        intent.putExtra("com.soundcloud.android.sync.extra.SYNCABLE", naVar);
        return intent;
    }

    static na b(Intent intent) {
        String str = "com.soundcloud.android.sync.extra.SYNCABLE";
        if (intent.hasExtra(str)) {
            na naVar = (na) intent.getSerializableExtra(str);
            if (naVar != null) {
                return naVar;
            }
            throw new IllegalArgumentException("Failed to deserialize syncable");
        }
        throw new IllegalArgumentException("Syncable must be present");
    }

    static List<na> c(Intent intent) {
        String str = "com.soundcloud.android.sync.extra.SYNCABLES";
        if (intent.hasExtra(str)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = intent.getStringArrayListExtra(str).iterator();
            while (it.hasNext()) {
                arrayList.add(na.valueOf((String) it.next()));
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Syncables must be present");
    }

    static List<C3508cda> a(Intent intent) {
        String str = "com.soundcloud.android.sync.extra.SYNCABLE_ENTITIES";
        if (intent.hasExtra(str)) {
            return C5526_Ha.b(intent, str);
        }
        return Collections.emptyList();
    }

    static Intent a(Intent intent, Collection<C3508cda> collection) {
        return C5526_Ha.a(intent, "com.soundcloud.android.sync.extra.SYNCABLE_ENTITIES", (List<C3508cda>) new ArrayList<C3508cda>(collection));
    }

    static Intent a(Intent intent, List<na> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (na name : list) {
            arrayList.add(name.name());
        }
        intent.putStringArrayListExtra("com.soundcloud.android.sync.extra.SYNCABLES", arrayList);
        return intent;
    }
}
