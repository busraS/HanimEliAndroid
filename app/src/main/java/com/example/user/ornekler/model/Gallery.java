package com.example.user.ornekler.model;
import java.util.List;
/**
 * Created by USER on 12.4.2015.
 */
public class Gallery {

        private Long id;

        private Person user;
        private String name;
        private List<Comment> comments;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Comment> getComments() {
            return comments;
        }

        public void setComments(List<Comment> comments) {
            this.comments = comments;
        }


        @Override
        public String toString() {
            return "com.dukefuns.hanimeliweb.model.Galery[ id=" + id + " ]";
        }



}
