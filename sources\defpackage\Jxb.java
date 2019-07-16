package defpackage;

import java.util.NoSuchElementException;

/* renamed from: Jxb reason: default package */
/* compiled from: _Strings.kt */
class Jxb extends Ixb {
    public static char f(CharSequence charSequence) {
        C7471uYa.b(charSequence, "$this$last");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(Hxb.c(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static Character g(CharSequence charSequence) {
        C7471uYa.b(charSequence, "$this$singleOrNull");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }
}
