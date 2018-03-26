package net.mybrainlab.camp.common;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.function.Supplier;

import static java.util.Objects.*;

/**
 * ユーティリティクラス.
 */
public class Utils {

    /**
     * 文字列前後の半角スペース, 全角スペース, {@value &nbsp;}を除去する.
     * @param src 対象文字列
     * @return {@link String}
     */
    public static String trim(final String src) {
        if (isNull(src) || src.length() == 0)
            return src;

        int st = 0;
        int len = src.length();
        char[] val = src.toCharArray();
        while ((st < len) && ((val[st] <= '\u0020') || (val[st] == '\u00A0') || (val[st] == '\u3000'))) {
            st++;
        }
        while ((st < len) && ((val[len - 1] <= '\u0020') || (val[len - 1] == '\u00A0') || (val[len - 1] == '\u3000'))) {
            len--;
        }
        return ((st > 0) || (len < src.length())) ? src.substring(st, len) : src;
    };

    private static Supplier<ZoneOffset> systemZoneOffset = () -> (ZoneOffset) ZoneOffset.systemDefault();

    /**
     * 指定時間後の{@linkplain java.util.Date 日時}を取得する。
     * @param offsetHours
     * @return {@linkplain java.util.Date 日時}
     */
    public static Date getDateOffsetHours(int offsetHours) {
        LocalDateTime ldt = LocalDateTime.now();
        Instant instant = ldt.toInstant(systemZoneOffset.get());
        return offsetHours == 0 ? Date.from(instant) : Date.from(ldt.plusHours(offsetHours).toInstant(systemZoneOffset.get()));
    }
}
