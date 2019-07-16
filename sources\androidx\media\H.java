package androidx.media;

import android.media.VolumeProvider;
import androidx.media.I.a;

/* compiled from: VolumeProviderCompatApi21 */
class H extends VolumeProvider {
    final /* synthetic */ a a;

    H(int i, int i2, int i3, a aVar) {
        this.a = aVar;
        super(i, i2, i3);
    }

    public void onAdjustVolume(int i) {
        this.a.b(i);
    }

    public void onSetVolumeTo(int i) {
        this.a.a(i);
    }
}
