package androidx.media;

import androidx.versionedparcelable.b;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = bVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = bVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = bVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.a(false, false);
        bVar.b(audioAttributesImplBase.a, 1);
        bVar.b(audioAttributesImplBase.b, 2);
        bVar.b(audioAttributesImplBase.c, 3);
        bVar.b(audioAttributesImplBase.d, 4);
    }
}
