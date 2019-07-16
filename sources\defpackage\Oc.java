package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: Oc reason: default package */
/* compiled from: AccessibilityRecordCompat */
public class Oc {
    public static void a(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }
}
