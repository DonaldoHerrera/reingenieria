package defpackage;

import java.util.Comparator;

/* renamed from: PCb reason: default package */
/* compiled from: DateTimeFormatterBuilder */
class PCb implements Comparator<String> {
    PCb() {
    }

    /* renamed from: a */
    public int compare(String str, String str2) {
        int length = str2.length() - str.length();
        return length == 0 ? str.compareTo(str2) : length;
    }
}
