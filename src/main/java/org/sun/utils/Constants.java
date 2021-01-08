package org.sun.utils;

public interface Constants {

    interface User{
        String ROLE_ADMIN = "role_admin";
        String ROLE_NORMAL = "role_normal";
        String DEFAULT_AVATAR = "https://cdn.sunofbeaches.com/images/default_avatar.png";
        String DEFAULT_STATE = "1";
        String COOKIE_TOKEN_KEY = "blog_token";
        //redis的key
        String KEY_CAPTCHA_CONTENT = "key_captcha_content_";
        String KEY_EMAIL_CODE_CONTENT = "key_email_code_content_";
        String KEY_EMAIL_SEND_IP = "key_email_send_ip_";
        String KEY_EMAIL_SEND_ADDRESS = "key_email_send_address_";
        String KEY_TOKEN = "key_token_";
    }

    interface Settings{
        String MANAGER_ACCOUNT_INIT_STATE = "manager_account_init_state";
    }

    interface Page {
        int DEFAULT_PAGE = 1;
        int MIN_SIZE = 10;
    }

    /**
     * 单位是秒
     */
    interface TimeValue{
        int MIN = 60;
        int HOUR = 60 * MIN;
        int  HOUR_2 = 60 * MIN * 2;
        int DAY = 24 * HOUR;
        int WEEK = 7 * DAY;
        int MONTH = 30 * DAY;
    }
}
