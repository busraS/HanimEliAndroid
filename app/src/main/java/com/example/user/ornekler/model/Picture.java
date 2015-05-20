package com.example.user.ornekler.model;
import java.util.Date;
import java.util.List;
/**
 * Created by USER on 12.4.2015.
 */
public class Picture {
        private Long id;
        private String description;
        private String path;

        private Date  time;
        private List<Comment> comments;
        private Gallery gallery;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

        public Gallery getGallery() {
            return gallery;
        }

        public void setGallery(Gallery gallery) {
            this.gallery = gallery;
        }

        public List<Comment> getComments() {
            return comments;
        }

        public void setComments(List<Comment> comments) {
            this.comments = comments;
        }





        @Override
        public String toString() {
            return "com.dukefuns.hanimeliweb.model.Picture[ id=" + id + " ]";
        }



}
