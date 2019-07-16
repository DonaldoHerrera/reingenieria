package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.e;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: EventMessageDecoder */
public final class b implements com.google.android.exoplayer2.metadata.b {
    public Metadata a(e eVar) {
        ByteBuffer byteBuffer = eVar.c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        Pq pq = new Pq(array, limit);
        String q = pq.q();
        C1852xq.a(q);
        String str = q;
        String q2 = pq.q();
        C1852xq.a(q2);
        String str2 = q2;
        long v = pq.v();
        long v2 = pq.v();
        if (v2 != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring non-zero presentation_time_delta: ");
            sb.append(v2);
            Iq.d("EventMessageDecoder", sb.toString());
        }
        EventMessage eventMessage = new EventMessage(str, str2, C0471ar.c(pq.v(), 1000, v), pq.v(), Arrays.copyOfRange(array, pq.c(), limit));
        return new Metadata(eventMessage);
    }
}
