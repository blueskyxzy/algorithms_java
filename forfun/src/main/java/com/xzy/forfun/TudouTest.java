package com.xzy.forfun;// created by xzy on 2019-05-14

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


/**
 * 获取土豆网视频
 * @author sunlightcs
 * 2011-3-31
 * http://hi.juziku.com/sunlightcs/
 */
public class TudouTest {

    public static void main(String[] args) throws Exception{
        Document doc = getURLContent();
        String content = doc.html();
        int beginLocal = content.indexOf("<script>document.domain");
        int endLocal = content.indexOf("</script>");
        content = content.substring(beginLocal, endLocal);

        String flashUrl = getScriptVarByName("iid_code", content);
        flashUrl = "http://www.tudou.com/v/" + flashUrl + "/v.swf";
        System.out.println("视频地址："+flashUrl);


        String pic = getScriptVarByName("thumbnail", content);
        System.out.println("视频缩略图："+pic);


        String time = getScriptVarByName("time", content);
        System.out.println("视频时长："+time);


    }

    /**
     * 获取script某个变量的值
     * @param name  变量名称
     * @return   返回获取的值
     */
    private static String getScriptVarByName(String name, String content){
        String script = content;

        int begin = script.indexOf(name);

        script = script.substring(begin+name.length()+2);

        int end = script.indexOf(",");

        script = script.substring(0,end);

        String result=script.replaceAll("'", "");
        result = result.trim();

        return result;
    }


    /**
     * 获取土豆网页的内容
     */
    private static Document getURLContent() throws MalformedURLException, IOException, UnsupportedEncodingException {
        Document doc = Jsoup.connect("http://www.tudou.com/programs/view/pVploWOtCQM/")
                .data("query", "Java")
                .userAgent("Mozilla")
                .cookie("auth", "token")
                .timeout(3000)
                .post();
        return doc;
    }

}
