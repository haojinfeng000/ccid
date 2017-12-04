package com.sdlx.base;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

    /**
     * 控制器基类
     */
    public class BaseController {
        public final Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
        /**
         * 对象转为json字符串
         * @Description: TODO(这里用一句话描述这个方法的作用)
         * @param
         * @return String
         * @throws
         * @author haojf
         * @createtime 2016年5月6日 下午3:30:17
         */
        public String render(Object obj){
            return gson.toJson(obj);
        }
        public void render(HttpServletResponse response, Object obj){
            try {
                response.setCharacterEncoding("UTF-8"); //设置编码格式
                response.setContentType("text/html");   //设置数据格式
                PrintWriter out = response.getWriter(); //获取写入对象
                out.print(gson.toJson(obj)); //将json数据写入流中
                out.flush();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        protected String controlAlert(HttpServletResponse response, String msg, String url) {
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            PrintWriter out = null;
            try {
                out = response.getWriter();
                out.print("<script>alert('" + msg + "');window.location.href='"
                        + url + "';</script>");
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                IOUtils.closeQuietly(out);
            }
            return "common/suc";

        }

        protected void controlAlertAndclose(HttpServletResponse response, String msg) {
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            PrintWriter out = null;
            try {
                out = response.getWriter();
                out.print("<script>alert('" + msg + "');window.close();</script>");
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                IOUtils.closeQuietly(out);
            }

        }
    }
