package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.b;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.b = (AudioAttributes) bVar.a(audioAttributesImplApi21.b, 1);
        audioAttributesImplApi21.c = bVar.a(audioAttributesImplApi21.c, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, b bVar) {
        bVar.a(false, false);
        bVar.b((Parcelable) audioAttributesImplApi21.b, 1);
        bVar.b(audioAttributesImplApi21.c, 2);
    }
}
