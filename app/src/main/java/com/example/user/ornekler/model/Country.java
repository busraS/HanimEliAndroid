package com.example.user.ornekler.model;

/**
 * Created by USER on 12.4.2015.
 */
public class Country {

        private byte id;
        private String name;

        public Country() {

        }
        public Country(String name) {
            this.name = name;
        }
        public byte getId() {
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
            return "com.dukefuns.hanimeliweb.model.Country[ id=" + id + " ]";
        }

}
