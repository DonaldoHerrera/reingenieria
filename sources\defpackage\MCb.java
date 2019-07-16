package defpackage;

import java.util.Comparator;

/* renamed from: MCb reason: default package */
/* compiled from: DateTimeFormatterBuilder */
class MCb implements Comparator<String> {
    MCb() {
    }

    /* renamed from: a */
    public int compare(String str, String str2) {
        return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
    }
}
