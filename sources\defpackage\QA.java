package defpackage;

import android.util.Log;
import java.io.File;

/* renamed from: QA reason: default package */
final class QA implements DA {
    QA() {
    }

    public final boolean a(Object obj, File file, File file2) {
        try {
            return !((Boolean) XA.a(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
