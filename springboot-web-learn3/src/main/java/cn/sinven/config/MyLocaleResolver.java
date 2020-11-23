package cn.sinven.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author lj
 * @create 2020-09-16 11:21
 * @email 1624058512@qq.com
 */
@Component
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String l=httpServletRequest.getParameter("l");

        //如果没有传入当前类型参数那么就用默认的设置
        Locale locale=Locale.getDefault();
        if (!StringUtils.isEmpty(l)){
            String [] split=l.split("_");
            locale=new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
