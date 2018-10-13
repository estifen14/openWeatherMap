package org.practice.util;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by estifen on 10/12/2018.
 */
public class MessageConverterUtil {
    public static void setMessageConverter(RestTemplate restTemplate){
        HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        HttpMessageConverter xmlConverter = new Jaxb2RootElementHttpMessageConverter();
        List<HttpMessageConverter<?>> list = new ArrayList();
        list.add(jsonConverter);
        list.add(xmlConverter);
        restTemplate.setMessageConverters(list);
    }
}
