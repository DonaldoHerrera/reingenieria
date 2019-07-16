package androidx.media;

import androidx.versionedparcelable.b;
import androidx.versionedparcelable.d;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.d = (C0379a) bVar.a(audioAttributesCompat.d, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.a(false, false);
        bVar.b((d) audioAttributesCompat.d, 1);
    }
}
