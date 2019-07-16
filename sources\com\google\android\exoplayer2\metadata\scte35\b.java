package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.e;
import java.nio.ByteBuffer;

/* compiled from: SpliceInfoDecoder */
public final class b implements com.google.android.exoplayer2.metadata.b {
    private final Pq a = new Pq();
    private final Oq b = new Oq();
    private Zq c;

    public Metadata a(e eVar) {
        Zq zq = this.c;
        if (zq == null || eVar.f != zq.c()) {
            this.c = new Zq(eVar.d);
            this.c.a(eVar.d - eVar.f);
        }
        ByteBuffer byteBuffer = eVar.c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.a(array, limit);
        this.b.a(array, limit);
        this.b.c(39);
        long a2 = (((long) this.b.a(1)) << 32) | ((long) this.b.a(32));
        this.b.c(20);
        int a3 = this.b.a(12);
        int a4 = this.b.a(8);
        Entry entry = null;
        this.a.f(14);
        if (a4 == 0) {
            entry = new SpliceNullCommand();
        } else if (a4 == 255) {
            entry = PrivateCommand.a(this.a, a3, a2);
        } else if (a4 == 4) {
            entry = SpliceScheduleCommand.a(this.a);
        } else if (a4 == 5) {
            entry = SpliceInsertCommand.a(this.a, a2, this.c);
        } else if (a4 == 6) {
            entry = TimeSignalCommand.a(this.a, a2, this.c);
        }
        if (entry == null) {
            return new Metadata(new Entry[0]);
        }
        return new Metadata(entry);
    }
}
