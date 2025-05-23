/*
+--------------------------------------------------------------------------
|   Mtons [#RELEASE_VERSION#]
|   ========================================

|   http://www.mtons.com
+---------------------------------------------------------------------------
*/
package com.zplus.terablog.common.util;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;

/**
 *    

 */
public class PreviewTextUtils {
    /**
     * 提取纯文本
     * @param html 代码
     * @return string
     */
    public static String getText(String html) {
        if (html == null) {
            return null;
        }
        return Jsoup.clean(html, Whitelist.none()).trim();
    }

    /**
     * 提取纯文本
     * @param html 代码
     * @param length 提取文本长度
     * @return string
     */
    public static String getText(String html, int length){
        String text = getText(html);
        text = StringUtils.abbreviate(text, length);
        return text;
    }

    /**
     * 以下标签可以通过 (b, em, i, strong, u. 纯文本)
     * @param html 代码
     * @return string
     */
    public static String getSimpleHtml(String html) {
        if (html == null) {
            return null;
        }
        return Jsoup.clean(html, Whitelist.simpleText());
    }

    /**
     * 获取文章中的img url
     * @param html 代码
     * @return string
     */
    public static String getImgSrc(String html) {
        if (html == null) {
            return null;
        }
        Document doc = Jsoup.parseBodyFragment(html);
        Element image = doc.select("img").first();
        return image == null ? null : image.attr("src");
    }

}
