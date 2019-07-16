package com.fasterxml.jackson.core.io;

import com.soundcloud.flippernative.BuildConfig;

public final class NumberOutput {
    private static int BILLION = 1000000000;
    private static long BILLION_L = 1000000000;
    private static long MAX_INT_AS_LONG = 2147483647L;
    private static int MILLION = 1000000;
    private static long MIN_INT_AS_LONG = -2147483648L;
    static final String SMALLEST_INT = String.valueOf(Integer.MIN_VALUE);
    static final String SMALLEST_LONG = String.valueOf(Long.MIN_VALUE);
    private static final int[] TRIPLET_TO_CHARS = new int[1000];
    private static final String[] sSmallIntStrs = {BuildConfig.VERSION_NAME, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private static final String[] sSmallIntStrs2 = {"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            int i3 = i2;
            int i4 = 0;
            while (i4 < 10) {
                int i5 = i3;
                int i6 = 0;
                while (i6 < 10) {
                    int i7 = i5 + 1;
                    TRIPLET_TO_CHARS[i5] = ((i + 48) << 16) | ((i4 + 48) << 8) | (i6 + 48);
                    i6++;
                    i5 = i7;
                }
                i4++;
                i3 = i5;
            }
            i++;
            i2 = i3;
        }
    }

    private static int _full3(int i, char[] cArr, int i2) {
        int i3 = TRIPLET_TO_CHARS[i];
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 >> 16);
        int i5 = i4 + 1;
        cArr[i4] = (char) ((i3 >> 8) & 127);
        int i6 = i5 + 1;
        cArr[i5] = (char) (i3 & 127);
        return i6;
    }

    private static int _leading3(int i, char[] cArr, int i2) {
        int i3;
        int i4 = TRIPLET_TO_CHARS[i];
        if (i > 9) {
            if (i > 99) {
                i3 = i2 + 1;
                cArr[i2] = (char) (i4 >> 16);
            } else {
                i3 = i2;
            }
            i2 = i3 + 1;
            cArr[i3] = (char) ((i4 >> 8) & 127);
        }
        int i5 = i2 + 1;
        cArr[i2] = (char) (i4 & 127);
        return i5;
    }

    private static int _outputFullBillion(int i, char[] cArr, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int[] iArr = TRIPLET_TO_CHARS;
        int i6 = iArr[i5];
        int i7 = i2 + 1;
        cArr[i2] = (char) (i6 >> 16);
        int i8 = i7 + 1;
        cArr[i7] = (char) ((i6 >> 8) & 127);
        int i9 = i8 + 1;
        cArr[i8] = (char) (i6 & 127);
        int i10 = iArr[i3 - (i5 * 1000)];
        int i11 = i9 + 1;
        cArr[i9] = (char) (i10 >> 16);
        int i12 = i11 + 1;
        cArr[i11] = (char) ((i10 >> 8) & 127);
        int i13 = i12 + 1;
        cArr[i12] = (char) (i10 & 127);
        int i14 = iArr[i4];
        int i15 = i13 + 1;
        cArr[i13] = (char) (i14 >> 16);
        int i16 = i15 + 1;
        cArr[i15] = (char) ((i14 >> 8) & 127);
        int i17 = i16 + 1;
        cArr[i16] = (char) (i14 & 127);
        return i17;
    }

    private static int _outputSmallestI(char[] cArr, int i) {
        int length = SMALLEST_INT.length();
        SMALLEST_INT.getChars(0, length, cArr, i);
        return i + length;
    }

    private static int _outputSmallestL(char[] cArr, int i) {
        int length = SMALLEST_LONG.length();
        SMALLEST_LONG.getChars(0, length, cArr, i);
        return i + length;
    }

    private static int _outputUptoBillion(int i, char[] cArr, int i2) {
        if (i >= MILLION) {
            int i3 = i / 1000;
            int i4 = i - (i3 * 1000);
            int i5 = i3 / 1000;
            int i6 = i3 - (i5 * 1000);
            int _leading3 = _leading3(i5, cArr, i2);
            int[] iArr = TRIPLET_TO_CHARS;
            int i7 = iArr[i6];
            int i8 = _leading3 + 1;
            cArr[_leading3] = (char) (i7 >> 16);
            int i9 = i8 + 1;
            cArr[i8] = (char) ((i7 >> 8) & 127);
            int i10 = i9 + 1;
            cArr[i9] = (char) (i7 & 127);
            int i11 = iArr[i4];
            int i12 = i10 + 1;
            cArr[i10] = (char) (i11 >> 16);
            int i13 = i12 + 1;
            cArr[i12] = (char) ((i11 >> 8) & 127);
            int i14 = i13 + 1;
            cArr[i13] = (char) (i11 & 127);
            return i14;
        } else if (i < 1000) {
            return _leading3(i, cArr, i2);
        } else {
            int i15 = i / 1000;
            return _outputUptoMillion(cArr, i2, i15, i - (i15 * 1000));
        }
    }

    private static int _outputUptoMillion(char[] cArr, int i, int i2, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                int i5 = i + 1;
                cArr[i] = (char) (i4 >> 16);
                i = i5;
            }
            int i6 = i + 1;
            cArr[i] = (char) ((i4 >> 8) & 127);
            i = i6;
        }
        int i7 = i + 1;
        cArr[i] = (char) (i4 & 127);
        int i8 = TRIPLET_TO_CHARS[i3];
        int i9 = i7 + 1;
        cArr[i7] = (char) (i8 >> 16);
        int i10 = i9 + 1;
        cArr[i9] = (char) ((i8 >> 8) & 127);
        int i11 = i10 + 1;
        cArr[i10] = (char) (i8 & 127);
        return i11;
    }

    public static int outputInt(int i, char[] cArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return _outputSmallestI(cArr, i2);
            }
            int i4 = i2 + 1;
            cArr[i2] = '-';
            i = -i;
            i2 = i4;
        }
        if (i >= MILLION) {
            int i5 = BILLION;
            if (i >= i5) {
                int i6 = i - i5;
                if (i6 >= i5) {
                    i6 -= i5;
                    i3 = i2 + 1;
                    cArr[i2] = '2';
                } else {
                    i3 = i2 + 1;
                    cArr[i2] = '1';
                }
                return _outputFullBillion(i6, cArr, i3);
            }
            int i7 = i / 1000;
            int i8 = i7 / 1000;
            return _full3(i - (i7 * 1000), cArr, _full3(i7 - (i8 * 1000), cArr, _leading3(i8, cArr, i2)));
        } else if (i >= 1000) {
            int i9 = i / 1000;
            return _full3(i - (i9 * 1000), cArr, _leading3(i9, cArr, i2));
        } else if (i >= 10) {
            return _leading3(i, cArr, i2);
        } else {
            cArr[i2] = (char) (i + 48);
            return i2 + 1;
        }
    }

    public static int outputLong(long j, char[] cArr, int i) {
        int i2;
        if (j < 0) {
            if (j > MIN_INT_AS_LONG) {
                return outputInt((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return _outputSmallestL(cArr, i);
            }
            int i3 = i + 1;
            cArr[i] = '-';
            j = -j;
            i = i3;
        } else if (j <= MAX_INT_AS_LONG) {
            return outputInt((int) j, cArr, i);
        }
        long j2 = BILLION_L;
        long j3 = j / j2;
        long j4 = j - (j3 * j2);
        if (j3 < j2) {
            i2 = _outputUptoBillion((int) j3, cArr, i);
        } else {
            long j5 = j3 / j2;
            long j6 = j3 - (j2 * j5);
            i2 = _outputFullBillion((int) j6, cArr, _leading3((int) j5, cArr, i));
        }
        return _outputFullBillion((int) j4, cArr, i2);
    }

    public static String toString(int i) {
        String[] strArr = sSmallIntStrs;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            String[] strArr2 = sSmallIntStrs2;
            if (i2 < strArr2.length) {
                return strArr2[i2];
            }
        }
        return Integer.toString(i);
    }

    public static String toString(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            return Long.toString(j);
        }
        return toString((int) j);
    }

    public static String toString(double d) {
        return Double.toString(d);
    }

    public static String toString(float f) {
        return Float.toString(f);
    }
}
