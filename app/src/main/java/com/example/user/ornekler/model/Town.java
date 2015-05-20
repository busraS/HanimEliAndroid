package com.example.user.ornekler.model;

/**
 * Created by USER on 12.4.2015.
 */
public class Town {

        private short id;
        private String name;

        private Country country;

        public Town() {

        }

        public Town(String name, Country country) {
            this.name = name;
            this.country = country;
        }

        public short getId() {
            return id;
        }

        public void setId(short id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "com.dukefuns.hanimeliweb.model.Town[ id=" + id + " ]";
        }



}
