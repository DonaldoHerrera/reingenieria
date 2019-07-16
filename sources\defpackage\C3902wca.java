package defpackage;

import com.soundcloud.android.features.record.C3668u;
import com.soundcloud.android.features.record.C3671x;
import com.soundcloud.android.features.record.C3672y;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: wca reason: default package and case insensitive filesystem */
/* compiled from: MultiAudioWriter */
public class C3902wca implements C3672y {
    private final C3672y[] a;
    private C3668u b;

    public C3902wca(C3672y... yVarArr) {
        this.a = yVarArr;
        for (C3672y yVar : yVarArr) {
            C3668u uVar = this.b;
            if (uVar == null) {
                this.b = yVar.w();
            } else if (uVar != yVar.w()) {
                StringBuilder sb = new StringBuilder();
                sb.append("mismatch in configurations:");
                sb.append(this.b);
                sb.append("/");
                sb.append(yVar.w());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public int a(ByteBuffer byteBuffer, int i) throws IOException {
        byteBuffer.mark();
        int[] iArr = new int[this.a.length];
        int i2 = 0;
        while (true) {
            C3672y[] yVarArr = this.a;
            if (i2 >= yVarArr.length) {
                return iArr[0];
            }
            iArr[i2] = yVarArr[i2].a(byteBuffer, i);
            byteBuffer.reset();
            i2++;
        }
    }

    public void close() throws IOException {
        for (C3672y close : this.a) {
            close.close();
        }
    }

    public boolean g(long j) throws IOException {
        for (C3672y g : this.a) {
            if (!g.g(j)) {
                return false;
            }
        }
        return true;
    }

    public long getDuration() {
        for (C3672y duration : this.a) {
            long duration2 = duration.getDuration();
            if (duration2 != -1) {
                return duration2;
            }
        }
        return -1;
    }

    public C3671x u() throws IOException {
        for (C3672y u : this.a) {
            C3671x u2 = u.u();
            if (u2 != null) {
                return u2;
            }
        }
        return null;
    }

    public C3668u w() {
        return this.b;
    }

    public void y() throws IOException {
        for (C3672y y : this.a) {
            y.y();
        }
    }
}
