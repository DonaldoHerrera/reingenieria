package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: JNa reason: default package and case insensitive filesystem */
/* compiled from: QueueFile */
class C5024JNa implements c {
    boolean a = true;
    final /* synthetic */ StringBuilder b;
    final /* synthetic */ C5056KNa c;

    C5024JNa(C5056KNa kNa, StringBuilder sb) {
        this.c = kNa;
        this.b = sb;
    }

    public void a(InputStream inputStream, int i) throws IOException {
        if (this.a) {
            this.a = false;
        } else {
            this.b.append(", ");
        }
        this.b.append(i);
    }
}
