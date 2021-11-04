package com.ethoca.ShoppingCart.util;

import java.util.Arrays;
import java.util.List;

public class Common {

    // Common Headers
    public static final String SHAPE_WEB="shape=web";
    public static final String DETAILS_BASIC="details=basic";
    public static final String ORIGIN="http://localhost:8080";
    public static final String ALLOWED_METHOD_GET="GET";
    public static final String ALLOWED_METHOD_POST="POST";
    public static final String ALLOWED_HEADER_ORIGIN="Origin";
    public static final String ACCEPT_LANGUAGE_EN="Accept-Language=en-US";
    public static final String ALLOWED_HEADER_CONTENT_TYPE="Content-Type";
    public static final String ALLOWED_HEADER_ACCEPT="Accept";
    public static final String ALLOWED_HEADER_ACCEPT_LANGUAGE="Accept-Language";
    public static final String REGISTER_CORS_CONFIG="/**";

    private static List<String> urls= Arrays.asList(
            "/customerInfo/customer",
            "/abc/def"
    );

    public static boolean checkUrlExist(String requestUrl){
        for (String url: urls) {
            if (requestUrl.contains(url)){
                return true;
            }
        }
        return false;
    }

}
