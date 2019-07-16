package com.soundcloud.flippernative.api;

public final class ErrorCategory {
    public static final ErrorCategory EncryptionKey = new ErrorCategory("EncryptionKey");
    public static final ErrorCategory MediaParsing = new ErrorCategory("MediaParsing");
    public static final ErrorCategory Network = new ErrorCategory("Network");
    public static final ErrorCategory OfflineOpen = new ErrorCategory("OfflineOpen");
    public static final ErrorCategory PlaylistIncomplete = new ErrorCategory("PlaylistIncomplete");
    public static final ErrorCategory Unknown = new ErrorCategory("Unknown");
    private static int swigNext = 0;
    private static ErrorCategory[] swigValues = {Network, MediaParsing, PlaylistIncomplete, EncryptionKey, OfflineOpen, Unknown};
    private final String swigName;
    private final int swigValue;

    private ErrorCategory(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static ErrorCategory swigToEnum(int i) {
        ErrorCategory[] errorCategoryArr = swigValues;
        if (i < errorCategoryArr.length && i >= 0 && errorCategoryArr[i].swigValue == i) {
            return errorCategoryArr[i];
        }
        int i2 = 0;
        while (true) {
            ErrorCategory[] errorCategoryArr2 = swigValues;
            if (i2 >= errorCategoryArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(ErrorCategory.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (errorCategoryArr2[i2].swigValue == i) {
                return errorCategoryArr2[i2];
            } else {
                i2++;
            }
        }
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    private ErrorCategory(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private ErrorCategory(String str, ErrorCategory errorCategory) {
        this.swigName = str;
        this.swigValue = errorCategory.swigValue;
        swigNext = this.swigValue + 1;
    }
}
