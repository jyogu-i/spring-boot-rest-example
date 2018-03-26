package net.mybrainlab.camp.common;

import static java.util.Objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * テンプレートクラス.
 */
@Component
public class SimpleTemplateEngin {

    private Map<String, Object> valueMap;

    private String source = null;

    /**
     * 行単位で改行文字を変更.
     */
    private Consumer<BufferedReader> templateAssign = (in) -> {
        this.source = in.lines()
                .peek(line -> line.replaceAll("\n", System.lineSeparator()))
                .collect(Collectors.joining());
    };

    private Consumer<Map.Entry<String, Object>> assignTo = entry ->
            source = source.replaceAll(
                    String.format("((\\{{2})%s(\\}{2}))", entry.getKey()), String.valueOf(entry.getValue()));

    /**
     * 指定パスをクラスパスからロードする.
     * @param resourcePath クラスパスを基にしたリソースファイルのパス
     * @throws IOException
     */
    public void loadTemplate(final String resourcePath) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(resourcePath)));
        if (nonNull(br) && br.ready()) if (br.ready()) templateAssign.accept(br);
    }

    /**
     * テンプレート変数を追加する.
     * @param key
     * @param value
     */
    public void add(final String key, final Object value) {
        if (isNull(this.valueMap)) this.valueMap = new HashMap<>();
        this.valueMap.putIfAbsent(key, value);
    }

    /**
     * 登録変数の値をテンプレートに埋め込んた結果を返す.
     * @return {@linkplain String}
     */
    public String buildTemplate() {
        if (isNull(source)) return null;
        valueMap.entrySet().stream().forEach(assignTo);
        return source;
    }
}
