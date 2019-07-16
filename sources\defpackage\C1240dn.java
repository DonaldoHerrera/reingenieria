package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: dn reason: default package and case insensitive filesystem */
/* compiled from: GaplessInfoHolder */
public final class C1240dn {
    private static final Pattern a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int b = -1;
    public int c = -1;

    public boolean a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.b = i2;
        this.c = i3;
        return true;
    }

    public boolean a(Metadata metadata) {
        for (int i = 0; i < metadata.a(); i++) {
            Entry a2 = metadata.a(i);
            String str = "iTunSMPB";
            if (a2 instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) a2;
                if (str.equals(commentFrame.c) && a(commentFrame.d)) {
                    return true;
                }
            } else if (a2 instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) a2;
                if ("com.apple.iTunes".equals(internalFrame.b) && str.equals(internalFrame.c) && a(internalFrame.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean a(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.b = parseInt;
                    this.c = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public boolean a() {
        return (this.b == -1 || this.c == -1) ? false : true;
    }
}
