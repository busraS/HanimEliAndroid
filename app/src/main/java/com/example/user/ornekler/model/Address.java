package com.example.user.ornekler.model;

/**
 * Created by USER on 12.4.2015.
 */
public class Address {

        private Long id;

        private Town town;
        private String content;

        public Address() {

        }

        public Address(Town town, String content) {
            this.town = town;
            this.content = content;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }


        public Town getTown() {
            return town;
        }

        public void setTown(Town town) {
            this.town = town;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

}
