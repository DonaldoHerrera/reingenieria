package defpackage;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* renamed from: qxb reason: default package and case insensitive filesystem */
/* compiled from: Regex.kt */
public final class C7231qxb {
    /* access modifiers changed from: private */
    public static final C6819kxb b(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new C7093oxb(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    public static final C6785kZa b(MatchResult matchResult, int i) {
        return C7265rZa.d(matchResult.start(i), matchResult.end(i));
    }
}
