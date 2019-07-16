package defpackage;

import com.soundcloud.android.player.ui.waveform.b;
import com.soundcloud.android.player.ui.waveform.b.a;

/* renamed from: gKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformOperations.kt */
final class C6498gKa<T, R> implements C7118pQa<T, R> {
    public static final C6498gKa a = new C6498gKa();

    C6498gKa() {
    }

    /* renamed from: a */
    public final b apply(C5325TJa tJa) {
        C7471uYa.b(tJa, "apiWaveform");
        a aVar = b.a;
        int i = tJa.a;
        int[] iArr = tJa.b;
        C7471uYa.a((Object) iArr, "apiWaveform.samples");
        return aVar.a(i, iArr);
    }
}
