package com.soundcloud.android.cast;

import java.util.List;

/* compiled from: CastQueueSlicer */
public class t {
    t() {
    }

    public List<C3508cda> a(List<C3508cda> list, int i) {
        return a(list, i, 100, 10);
    }

    /* access modifiers changed from: 0000 */
    public List<C3508cda> a(List<C3508cda> list, int i, int i2, int i3) {
        if (list.size() < i2) {
            return list;
        }
        int max = Math.max(0, i - i3);
        if (max + i2 > list.size()) {
            max = list.size() - i2;
        }
        return list.subList(max, i2 + max);
    }
}
