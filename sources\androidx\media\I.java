package androidx.media;

import android.media.VolumeProvider;

/* compiled from: VolumeProviderCompatApi21 */
class I {

    /* compiled from: VolumeProviderCompatApi21 */
    public interface a {
        void a(int i);

        void b(int i);
    }

    public static Object a(int i, int i2, int i3, a aVar) {
        return new H(i, i2, i3, aVar);
    }

    public static void a(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}
