package com.google.common.base;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

final class Platform {
    private static final Logger logger = Logger.getLogger(Platform.class.getName());
    private static final PatternCompiler patternCompiler = loadPatternCompiler();

    private static final class JdkPatternCompiler implements PatternCompiler {
        private JdkPatternCompiler() {
        }

        public CommonPattern compile(String str) {
            return new JdkPattern(Pattern.compile(str));
        }

        public boolean isPcreLike() {
            return true;
        }
    }

    private Platform() {
    }

    static CommonPattern compilePattern(String str) {
        Preconditions.checkNotNull(str);
        return patternCompiler.compile(str);
    }

    static String emptyToNull(String str) {
        if (stringIsNullOrEmpty(str)) {
            return null;
        }
        return str;
    }

    static String formatCompact4Digits(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    static <T extends Enum<T>> Optional<T> getEnumIfPresent(Class<T> cls, String str) {
        WeakReference weakReference = (WeakReference) Enums.getEnumConstants(cls).get(str);
        return weakReference == null ? Optional.absent() : Optional.of(cls.cast(weakReference.get()));
    }

    private static PatternCompiler loadPatternCompiler() {
        return new JdkPatternCompiler();
    }

    private static void logPatternCompilerError(ServiceConfigurationError serviceConfigurationError) {
        logger.log(Level.WARNING, "Error loading regex compiler, falling back to next option", serviceConfigurationError);
    }

    static String nullToEmpty(String str) {
        return str == null ? "" : str;
    }

    static boolean patternCompilerIsPcreLike() {
        return patternCompiler.isPcreLike();
    }

    static CharMatcher precomputeCharMatcher(CharMatcher charMatcher) {
        return charMatcher.precomputedInternal();
    }

    static boolean stringIsNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    static long systemNanoTime() {
        return System.nanoTime();
    }
}
