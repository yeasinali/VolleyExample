package com.example.nayan.volleyexample;

/**
 * Created by Nayan on 12/27/2016.
 */

public class Users {
    /**
     * name : Ravi Tamada
     * email : ravi8x@gmail.com
     * phone : {"home":"08947 000000","mobile":"9999999999"}
     */

    private String Name;
    private String username;
    private PhoneBean phone;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PhoneBean getPhone() {
        return phone;
    }

    public void setPhone(PhoneBean phone) {
        this.phone = phone;
    }

    public static class PhoneBean {
        /**
         * home : 08947 000000
         * mobile : 9999999999
         */

        private String home;
        private String mobile;

        public String getHome() {
            return home;
        }

        public void setHome(String home) {
            this.home = home;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }
    }
}
