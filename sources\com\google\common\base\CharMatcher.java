package com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;

public abstract class CharMatcher implements Predicate<Character> {
    private static final int DISTINCT_CHARS = 65536;

    private static final class And extends CharMatcher {
        final CharMatcher first;
        final CharMatcher second;

        And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            Preconditions.checkNotNull(charMatcher);
            this.first = charMatcher;
            Preconditions.checkNotNull(charMatcher2);
            this.second = charMatcher2;
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return this.first.matches(c) && this.second.matches(c);
        }

        /* access modifiers changed from: 0000 */
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.first.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.second.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.and(");
            sb.append(this.first);
            sb.append(", ");
            sb.append(this.second);
            sb.append(")");
            return sb.toString();
        }
    }

    private static final class Any extends NamedFastMatcher {
        static final Any INSTANCE = new Any();

        private Any() {
            super("CharMatcher.any()");
        }

        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return charMatcher;
        }

        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.length() == 0 ? "" : String.valueOf(c);
        }

        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        public boolean matches(char c) {
            return true;
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public CharMatcher negate() {
            return CharMatcher.none();
        }

        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        public String replaceFrom(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }

        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        public int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }
    }

    private static final class AnyOf extends CharMatcher {
        private final char[] chars;

        public AnyOf(CharSequence charSequence) {
            this.chars = charSequence.toString().toCharArray();
            Arrays.sort(this.chars);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Arrays.binarySearch(this.chars, c) >= 0;
        }

        /* access modifiers changed from: 0000 */
        public void setBits(BitSet bitSet) {
            for (char c : this.chars) {
                bitSet.set(c);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char access$100 : this.chars) {
                sb.append(CharMatcher.showCharacter(access$100));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    private static final class Ascii extends NamedFastMatcher {
        static final Ascii INSTANCE = new Ascii();

        Ascii() {
            super("CharMatcher.ascii()");
        }

        public boolean matches(char c) {
            return c <= 127;
        }
    }

    private static final class BitSetMatcher extends NamedFastMatcher {
        private final BitSet table;

        public boolean matches(char c) {
            return this.table.get(c);
        }

        /* access modifiers changed from: 0000 */
        public void setBits(BitSet bitSet) {
            bitSet.or(this.table);
        }

        private BitSetMatcher(BitSet bitSet, String str) {
            super(str);
            if (bitSet.length() + 64 < bitSet.size()) {
                bitSet = (BitSet) bitSet.clone();
            }
            this.table = bitSet;
        }
    }

    private static final class BreakingWhitespace extends CharMatcher {
        static final CharMatcher INSTANCE = new BreakingWhitespace();

        private BreakingWhitespace() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            boolean z = true;
            if (!(c == ' ' || c == 133 || c == 5760)) {
                if (c == 8199) {
                    return false;
                }
                if (!(c == 8287 || c == 12288 || c == 8232 || c == 8233)) {
                    switch (c) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            if (c < 8192 || c > 8202) {
                                z = false;
                            }
                            return z;
                    }
                }
            }
            return true;
        }

        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    private static final class Digit extends RangesMatcher {
        static final Digit INSTANCE = new Digit();
        private static final String ZEROES = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        private Digit() {
            super("CharMatcher.digit()", zeroes(), nines());
        }

        private static char[] nines() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) (ZEROES.charAt(i) + 9);
            }
            return cArr;
        }

        private static char[] zeroes() {
            return ZEROES.toCharArray();
        }
    }

    static abstract class FastMatcher extends CharMatcher {
        FastMatcher() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public CharMatcher negate() {
            return new NegatedFastMatcher(this);
        }

        public final CharMatcher precomputed() {
            return this;
        }
    }

    private static final class ForPredicate extends CharMatcher {
        private final Predicate<? super Character> predicate;

        ForPredicate(Predicate<? super Character> predicate2) {
            Preconditions.checkNotNull(predicate2);
            this.predicate = predicate2;
        }

        public boolean matches(char c) {
            return this.predicate.apply(Character.valueOf(c));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.forPredicate(");
            sb.append(this.predicate);
            sb.append(")");
            return sb.toString();
        }

        public boolean apply(Character ch) {
            Predicate<? super Character> predicate2 = this.predicate;
            Preconditions.checkNotNull(ch);
            return predicate2.apply(ch);
        }
    }

    private static final class InRange extends FastMatcher {
        private final char endInclusive;
        private final char startInclusive;

        InRange(char c, char c2) {
            Preconditions.checkArgument(c2 >= c);
            this.startInclusive = c;
            this.endInclusive = c2;
        }

        public boolean matches(char c) {
            return this.startInclusive <= c && c <= this.endInclusive;
        }

        /* access modifiers changed from: 0000 */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.startInclusive, this.endInclusive + 1);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.inRange('");
            sb.append(CharMatcher.showCharacter(this.startInclusive));
            sb.append("', '");
            sb.append(CharMatcher.showCharacter(this.endInclusive));
            sb.append("')");
            return sb.toString();
        }
    }

    private static final class Invisible extends RangesMatcher {
        static final Invisible INSTANCE = new Invisible();
        private static final String RANGE_ENDS = "  ­؅؜۝܏࣢ ᠎‏ ⁤⁯　﻿￻";
        private static final String RANGE_STARTS = "\u0000­؀؜۝܏࣢ ᠎   ⁦　?﻿￹";

        private Invisible() {
            super("CharMatcher.invisible()", RANGE_STARTS.toCharArray(), RANGE_ENDS.toCharArray());
        }
    }

    private static final class Is extends FastMatcher {
        private final char match;

        Is(char c) {
            this.match = c;
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? this : CharMatcher.none();
        }

        public boolean matches(char c) {
            return c == this.match;
        }

        public CharMatcher negate() {
            return CharMatcher.isNot(this.match);
        }

        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? charMatcher : CharMatcher.super.or(charMatcher);
        }

        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.match, c);
        }

        /* access modifiers changed from: 0000 */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.match);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.is('");
            sb.append(CharMatcher.showCharacter(this.match));
            sb.append("')");
            return sb.toString();
        }
    }

    private static final class IsEither extends FastMatcher {
        private final char match1;
        private final char match2;

        IsEither(char c, char c2) {
            this.match1 = c;
            this.match2 = c2;
        }

        public boolean matches(char c) {
            return c == this.match1 || c == this.match2;
        }

        /* access modifiers changed from: 0000 */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.match1);
            bitSet.set(this.match2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.anyOf(\"");
            sb.append(CharMatcher.showCharacter(this.match1));
            sb.append(CharMatcher.showCharacter(this.match2));
            sb.append("\")");
            return sb.toString();
        }
    }

    private static final class IsNot extends FastMatcher {
        private final char match;

        IsNot(char c) {
            this.match = c;
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? CharMatcher.super.and(charMatcher) : charMatcher;
        }

        public boolean matches(char c) {
            return c != this.match;
        }

        public CharMatcher negate() {
            return CharMatcher.is(this.match);
        }

        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? CharMatcher.any() : this;
        }

        /* access modifiers changed from: 0000 */
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.match);
            bitSet.set(this.match + 1, CharMatcher.DISTINCT_CHARS);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.isNot('");
            sb.append(CharMatcher.showCharacter(this.match));
            sb.append("')");
            return sb.toString();
        }
    }

    private static final class JavaDigit extends CharMatcher {
        static final JavaDigit INSTANCE = new JavaDigit();

        private JavaDigit() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isDigit(c);
        }

        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    private static final class JavaIsoControl extends NamedFastMatcher {
        static final JavaIsoControl INSTANCE = new JavaIsoControl();

        private JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }

        public boolean matches(char c) {
            return c <= 31 || (c >= 127 && c <= 159);
        }
    }

    private static final class JavaLetter extends CharMatcher {
        static final JavaLetter INSTANCE = new JavaLetter();

        private JavaLetter() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isLetter(c);
        }

        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    private static final class JavaLetterOrDigit extends CharMatcher {
        static final JavaLetterOrDigit INSTANCE = new JavaLetterOrDigit();

        private JavaLetterOrDigit() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isLetterOrDigit(c);
        }

        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    private static final class JavaLowerCase extends CharMatcher {
        static final JavaLowerCase INSTANCE = new JavaLowerCase();

        private JavaLowerCase() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isLowerCase(c);
        }

        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    private static final class JavaUpperCase extends CharMatcher {
        static final JavaUpperCase INSTANCE = new JavaUpperCase();

        private JavaUpperCase() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return Character.isUpperCase(c);
        }

        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    static abstract class NamedFastMatcher extends FastMatcher {
        private final String description;

        NamedFastMatcher(String str) {
            Preconditions.checkNotNull(str);
            this.description = str;
        }

        public final String toString() {
            return this.description;
        }
    }

    private static class Negated extends CharMatcher {
        final CharMatcher original;

        Negated(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            this.original = charMatcher;
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.original.countIn(charSequence);
        }

        public boolean matches(char c) {
            return !this.original.matches(c);
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            return this.original.matchesNoneOf(charSequence);
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.original.matchesAllOf(charSequence);
        }

        public CharMatcher negate() {
            return this.original;
        }

        /* access modifiers changed from: 0000 */
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.original.setBits(bitSet2);
            bitSet2.flip(0, CharMatcher.DISTINCT_CHARS);
            bitSet.or(bitSet2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.original);
            sb.append(".negate()");
            return sb.toString();
        }
    }

    static class NegatedFastMatcher extends Negated {
        NegatedFastMatcher(CharMatcher charMatcher) {
            super(charMatcher);
        }

        public final CharMatcher precomputed() {
            return this;
        }
    }

    private static final class None extends NamedFastMatcher {
        static final None INSTANCE = new None();

        private None() {
            super("CharMatcher.none()");
        }

        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        public boolean matches(char c) {
            return false;
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        public CharMatcher negate() {
            return CharMatcher.any();
        }

        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return charMatcher;
        }

        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public int indexIn(CharSequence charSequence, int i) {
            Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    private static final class Or extends CharMatcher {
        final CharMatcher first;
        final CharMatcher second;

        Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            Preconditions.checkNotNull(charMatcher);
            this.first = charMatcher;
            Preconditions.checkNotNull(charMatcher2);
            this.second = charMatcher2;
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            return this.first.matches(c) || this.second.matches(c);
        }

        /* access modifiers changed from: 0000 */
        public void setBits(BitSet bitSet) {
            this.first.setBits(bitSet);
            this.second.setBits(bitSet);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.or(");
            sb.append(this.first);
            sb.append(", ");
            sb.append(this.second);
            sb.append(")");
            return sb.toString();
        }
    }

    private static class RangesMatcher extends CharMatcher {
        private final String description;
        private final char[] rangeEnds;
        private final char[] rangeStarts;

        RangesMatcher(String str, char[] cArr, char[] cArr2) {
            this.description = str;
            this.rangeStarts = cArr;
            this.rangeEnds = cArr2;
            Preconditions.checkArgument(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                Preconditions.checkArgument(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    Preconditions.checkArgument(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c) {
            int binarySearch = Arrays.binarySearch(this.rangeStarts, c);
            boolean z = true;
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            if (i < 0 || c > this.rangeEnds[i]) {
                z = false;
            }
            return z;
        }

        public String toString() {
            return this.description;
        }
    }

    private static final class SingleWidth extends RangesMatcher {
        static final SingleWidth INSTANCE = new SingleWidth();

        private SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
        }
    }

    static final class Whitespace extends NamedFastMatcher {
        static final Whitespace INSTANCE = new Whitespace();
        static final int MULTIPLIER = 1682554634;
        static final int SHIFT = Integer.numberOfLeadingZeros(31);
        static final String TABLE = " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　";

        Whitespace() {
            super("CharMatcher.whitespace()");
        }

        public boolean matches(char c) {
            return TABLE.charAt((MULTIPLIER * c) >>> SHIFT) == c;
        }

        /* access modifiers changed from: 0000 */
        public void setBits(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set(TABLE.charAt(i));
            }
        }
    }

    protected CharMatcher() {
    }

    public static CharMatcher any() {
        return Any.INSTANCE;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return none();
        }
        if (length == 1) {
            return is(charSequence.charAt(0));
        }
        if (length != 2) {
            return new AnyOf(charSequence);
        }
        return isEither(charSequence.charAt(0), charSequence.charAt(1));
    }

    public static CharMatcher ascii() {
        return Ascii.INSTANCE;
    }

    public static CharMatcher breakingWhitespace() {
        return BreakingWhitespace.INSTANCE;
    }

    @Deprecated
    public static CharMatcher digit() {
        return Digit.INSTANCE;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i, int i2, char c, StringBuilder sb, boolean z) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (!matches(charAt)) {
                sb.append(charAt);
                z = false;
            } else if (!z) {
                sb.append(c);
                z = true;
            }
            i++;
        }
        return sb.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new ForPredicate(predicate);
    }

    public static CharMatcher inRange(char c, char c2) {
        return new InRange(c, c2);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return Invisible.INSTANCE;
    }

    public static CharMatcher is(char c) {
        return new Is(c);
    }

    private static IsEither isEither(char c, char c2) {
        return new IsEither(c, c2);
    }

    public static CharMatcher isNot(char c) {
        return new IsNot(c);
    }

    private static boolean isSmall(int i, int i2) {
        return i <= 1023 && i2 > (i * 4) * 16;
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return JavaDigit.INSTANCE;
    }

    public static CharMatcher javaIsoControl() {
        return JavaIsoControl.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return JavaLetter.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return JavaLetterOrDigit.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return JavaLowerCase.INSTANCE;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return JavaUpperCase.INSTANCE;
    }

    public static CharMatcher none() {
        return None.INSTANCE;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    private static CharMatcher precomputedPositive(int i, BitSet bitSet, String str) {
        if (i == 0) {
            return none();
        }
        if (i == 1) {
            return is((char) bitSet.nextSetBit(0));
        }
        if (i != 2) {
            return isSmall(i, bitSet.length()) ? SmallCharMatcher.from(bitSet, str) : new BitSetMatcher(bitSet, str);
        }
        char nextSetBit = (char) bitSet.nextSetBit(0);
        return isEither(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
    }

    /* access modifiers changed from: private */
    public static String showCharacter(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return SingleWidth.INSTANCE;
    }

    public static CharMatcher whitespace() {
        return Whitespace.INSTANCE;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    public String collapseFrom(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (matches(charAt)) {
                if (charAt != c || (i != length - 1 && matches(charSequence.charAt(i + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i);
                    sb.append(c);
                    return finishCollapseFrom(charSequence, i + 1, length, c, sb, true);
                }
                i++;
            }
            i++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (matches(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public CharMatcher negate() {
        return new Negated(this);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new Or(this, charMatcher);
    }

    public CharMatcher precomputed() {
        return Platform.precomputeCharMatcher(this);
    }

    /* access modifiers changed from: 0000 */
    public CharMatcher precomputedInternal() {
        String str;
        BitSet bitSet = new BitSet();
        setBits(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality * 2 <= DISTINCT_CHARS) {
            return precomputedPositive(cardinality, bitSet, toString());
        }
        bitSet.flip(0, DISTINCT_CHARS);
        int i = DISTINCT_CHARS - cardinality;
        String str2 = ".negate()";
        final String charMatcher = toString();
        if (charMatcher.endsWith(str2)) {
            str = charMatcher.substring(0, charMatcher.length() - 9);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(charMatcher);
            sb.append(str2);
            str = sb.toString();
        }
        return new NegatedFastMatcher(precomputedPositive(i, bitSet, str)) {
            public String toString() {
                return charMatcher;
            }
        };
    }

    public String removeFrom(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            indexIn++;
            while (indexIn != charArray.length) {
                if (matches(charArray[indexIn])) {
                    i++;
                } else {
                    charArray[indexIn - i] = charArray[indexIn];
                    indexIn++;
                }
            }
            return new String(charArray, 0, indexIn - i);
        }
    }

    public String replaceFrom(CharSequence charSequence, char c) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[indexIn] = c;
        while (true) {
            indexIn++;
            if (indexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[indexIn])) {
                charArray[indexIn] = c;
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    /* access modifiers changed from: 0000 */
    public void setBits(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (matches((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = length - 1;
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = i;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        if (i2 == 0 && i3 == i) {
            return collapseFrom(charSequence, c);
        }
        int i4 = i3 + 1;
        return finishCollapseFrom(charSequence, i2, i4, c, new StringBuilder(i4 - i2), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && matches(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        while (i2 > i && matches(charSequence.charAt(i2))) {
            i2--;
        }
        return charSequence.subSequence(i, i2 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!matches(charSequence.charAt(i))) {
                return charSequence.subSequence(i, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public int indexIn(CharSequence charSequence, int i) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i, length);
        while (i < length) {
            if (matches(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int indexIn = indexIn(charSequence3);
        if (indexIn == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append(charSequence3, i, indexIn);
            sb.append(charSequence2);
            i = indexIn + 1;
            indexIn = indexIn(charSequence3, i);
        } while (indexIn != -1);
        sb.append(charSequence3, i, length2);
        return sb.toString();
    }
}
