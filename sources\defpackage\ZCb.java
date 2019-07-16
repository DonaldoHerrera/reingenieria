package defpackage;

import java.util.Comparator;
import java.util.Map.Entry;

/* renamed from: ZCb reason: default package */
/* compiled from: SimpleDateTimeTextProvider */
class ZCb implements Comparator<Entry<String, Long>> {
    ZCb() {
    }

    /* renamed from: a */
    public int compare(Entry<String, Long> entry, Entry<String, Long> entry2) {
        return ((String) entry2.getKey()).length() - ((String) entry.getKey()).length();
    }
}
