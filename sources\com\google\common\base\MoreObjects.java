package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

public final class MoreObjects {

    public static final class ToStringHelper {
        private final String className;
        private final ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitNullValues;

        private static final class ValueHolder {
            String name;
            ValueHolder next;
            Object value;

            private ValueHolder() {
            }
        }

        private ValueHolder addHolder() {
            ValueHolder valueHolder = new ValueHolder();
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            return valueHolder;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, Object obj) {
            addHolder(str, obj);
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(Object obj) {
            addHolder(obj);
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public String toString() {
            boolean z = this.omitNullValues;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.holderHead.next; valueHolder != null; valueHolder = valueHolder.next) {
                Object obj = valueHolder.value;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = valueHolder.name;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private ToStringHelper(String str) {
            this.holderHead = new ValueHolder();
            this.holderTail = this.holderHead;
            this.omitNullValues = false;
            Preconditions.checkNotNull(str);
            this.className = str;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z) {
            addHolder(str, String.valueOf(z));
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z) {
            addHolder(String.valueOf(z));
            return this;
        }

        private ToStringHelper addHolder(Object obj) {
            addHolder().value = obj;
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c) {
            addHolder(str, String.valueOf(c));
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c) {
            addHolder(String.valueOf(c));
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d) {
            addHolder(str, String.valueOf(d));
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d) {
            addHolder(String.valueOf(d));
            return this;
        }

        private ToStringHelper addHolder(String str, Object obj) {
            ValueHolder addHolder = addHolder();
            addHolder.value = obj;
            Preconditions.checkNotNull(str);
            addHolder.name = str;
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f) {
            addHolder(str, String.valueOf(f));
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f) {
            addHolder(String.valueOf(f));
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i) {
            addHolder(str, String.valueOf(i));
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i) {
            addHolder(String.valueOf(i));
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j) {
            addHolder(str, String.valueOf(j));
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j) {
            addHolder(String.valueOf(j));
            return this;
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
