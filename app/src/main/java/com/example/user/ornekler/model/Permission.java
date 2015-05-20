package com.example.user.ornekler.model;

/**
 * Created by USER on 12.4.2015.
 */
public class Permission {


        private static final long serialVersionUID = 1L;
        private byte id;

        private String name;

        public short getId() {
            return id;
        }

        public void setId(byte id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "com.dukefuns.hanimeliweb.model.Permission[ id=" + id + " ]";
        }


}
