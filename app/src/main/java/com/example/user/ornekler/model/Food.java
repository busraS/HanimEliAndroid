package com.example.user.ornekler.model;
import java.util.List;
/**
 * Created by USER on 12.4.2015.
 */
public class Food {

        private Long id;
        private String name;
        private String description;
        private Person user;
        private String materials;
        private short preparationTime;

        private List<Comment> comments;

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

        public Person getUser() {
            return user;
        }

        public void setUser(Person user) {
            this.user = user;
        }

        public String getMaterials() {
            return materials;
        }

        public void setMaterials(String materials) {
            this.materials = materials;
        }

        public short getPreparationTime() {
            return preparationTime;
        }

        public void setPreparationTime(Short preparationTime) {
            this.preparationTime = preparationTime;
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
            return "com.dukefuns.hanimeliweb.model.Food[ id=" + id + " ]";
        }


    public void setPreparationTime(String s) {

    }
}
