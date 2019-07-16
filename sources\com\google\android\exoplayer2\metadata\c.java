package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.b;
import com.google.android.exoplayer2.metadata.icy.a;
import com.google.android.exoplayer2.metadata.id3.h;

/* compiled from: MetadataDecoderFactory */
class c implements d {
    c() {
    }

    public boolean a(Format format) {
        String str = format.i;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str);
    }

    public b b(Format format) {
        char c;
        String str = format.i;
        switch (str.hashCode()) {
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    c = 3;
                    break;
                }
            case -1248341703:
                if (str.equals("application/id3")) {
                    c = 0;
                    break;
                }
            case 1154383568:
                if (str.equals("application/x-emsg")) {
                    c = 1;
                    break;
                }
            case 1652648887:
                if (str.equals("application/x-scte35")) {
                    c = 2;
                    break;
                }
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new h();
        }
        if (c == 1) {
            return new b();
        }
        if (c == 2) {
            return new com.google.android.exoplayer2.metadata.scte35.b();
        }
        if (c == 3) {
            return new a();
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
    }
}
