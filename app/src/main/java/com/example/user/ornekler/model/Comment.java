package com.example.user.ornekler.model;
import java.util.Date;

public class Comment {

        private Long id;

        private Person user;
        private String content;
        private Date date;

        public Comment() {
            this.date = new Date();
        }

        public Comment(Person user, String content) {
            this.user = user;
            this.date = new Date();
            this.content = content;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Person getUser() {
            return user;
        }

        public void setUser(Person user) {
            this.user = user;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }


        @Override
        public String toString() {
            return "com.dukefuns.hanimeliweb.model.Comment[ id=" + id + " ]";
        }


}
