/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author shashank
 */
public class URLCallable implements Callable<String> {

    private String url;
    private String data;

    public URLCallable(String url, String data) {
        this.url = url;
        this.data = data;
    }

    @Override
    public String call() throws Exception {
        System.out.println("CALLING:------>" + url);
        Document d = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1667.0 Safari/537.36")
                .header("Accept-Language", "en-US")
                .header("Accept-Encoding", "gzip,deflate,sdch")
                .get();
        Elements elms = d.getElementsByClass("a-spacing-none");
//            Vector<String> v = new Vector();
//            String domain = "https://www.amazon.com/";
        String m[] = url.split("/");
        System.out.println(m[m.length - 1]);
        PrintStream ps = new PrintStream(new File(m[m.length - 1] + ".html"));
        String urlData[] = {""};
        System.out.println(url + ":" + elms.size());
        elms.forEach(c -> {

            ps.println(c.html());

            if (c.text().toLowerCase().contains(data)) {
                System.out.println(c.text());
                urlData[0] = url;
            }
        });
        return urlData[0];
    }

}
