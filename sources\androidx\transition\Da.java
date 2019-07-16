package androidx.transition;

import android.os.IBinder;

/* compiled from: WindowIdApi14 */
class Da implements Fa {
    private final IBinder a;

    Da(IBinder iBinder) {
        this.a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Da) && ((Da) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
